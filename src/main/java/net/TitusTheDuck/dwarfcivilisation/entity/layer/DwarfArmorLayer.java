package net.TitusTheDuck.dwarfcivilisation.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfWarriorModel;

public class DwarfArmorLayer extends LayerRenderer<DwarfWarriorEntity, DwarfWarriorModel> {

    private final BipedModel<DwarfWarriorEntity> innerModel;
    private final BipedModel<DwarfWarriorEntity> outerModel;

    public DwarfArmorLayer(IEntityRenderer<DwarfWarriorEntity, DwarfWarriorModel> renderer) {
        super(renderer);
        this.innerModel = new BipedModel<>(0.5F);
        this.outerModel = new BipedModel<>(1.0F);
    }

    @Override
    public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight,
                       DwarfWarriorEntity entity, float limbSwing, float limbSwingAmount,
                       float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        this.renderArmor(matrixStack, buffer, entity, EquipmentSlotType.CHEST, packedLight,
                this.getArmorModel(EquipmentSlotType.CHEST), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmor(matrixStack, buffer, entity, EquipmentSlotType.LEGS, packedLight,
                this.getArmorModel(EquipmentSlotType.LEGS), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmor(matrixStack, buffer, entity, EquipmentSlotType.FEET, packedLight,
                this.getArmorModel(EquipmentSlotType.FEET), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmor(matrixStack, buffer, entity, EquipmentSlotType.HEAD, packedLight,
                this.getArmorModel(EquipmentSlotType.HEAD), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    private void renderArmor(MatrixStack matrixStack, IRenderTypeBuffer buffer, DwarfWarriorEntity entity,
                             EquipmentSlotType slot, int packedLight, BipedModel<DwarfWarriorEntity> model,
                             float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

        ItemStack itemstack = entity.getItemStackFromSlot(slot);
        if (!(itemstack.getItem() instanceof ArmorItem)) {
            return;
        }

        ArmorItem armoritem = (ArmorItem) itemstack.getItem();
        if (armoritem.getEquipmentSlot() != slot) {
            return;
        }

        matrixStack.push();

        // Ajustement pour le nain
        matrixStack.translate(0.0D, 0.7D, 0.0D);
        matrixStack.scale(1.0F, 0.8F, 1.0F);

        ((DwarfWarriorModel)this.getEntityModel()).copyModelAttributesTo((BipedModel<?>)model);
        this.setModelSlotVisible(model, slot);

        boolean flag = this.isLegSlot(slot);
        model.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        ResourceLocation resourcelocation = this.getArmorResource(armoritem, flag);
        IVertexBuilder ivertexbuilder = ItemRenderer.getArmorVertexBuilder(buffer,
                RenderType.getArmorCutoutNoCull(resourcelocation), false, itemstack.hasEffect());

        model.render(matrixStack, ivertexbuilder, packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();
    }

    private void setModelSlotVisible(BipedModel<DwarfWarriorEntity> model, EquipmentSlotType slot) {
        model.setVisible(false);
        switch (slot) {
            case HEAD:
                model.bipedHead.showModel = true;
                model.bipedHeadwear.showModel = true;
                break;
            case CHEST:
                model.bipedBody.showModel = true;
                model.bipedRightArm.showModel = true;
                model.bipedLeftArm.showModel = true;
                break;
            case LEGS:
                model.bipedBody.showModel = true;
                model.bipedRightLeg.showModel = true;
                model.bipedLeftLeg.showModel = true;
                break;
            case FEET:
                model.bipedRightLeg.showModel = true;
                model.bipedLeftLeg.showModel = true;
                break;
        }
    }

    private BipedModel<DwarfWarriorEntity> getArmorModel(EquipmentSlotType slot) {
        return this.isLegSlot(slot) ? this.innerModel : this.outerModel;
    }

    private boolean isLegSlot(EquipmentSlotType slotType) {
        return slotType == EquipmentSlotType.LEGS;
    }

    private ResourceLocation getArmorResource(ArmorItem armor, boolean legs) {
        String texture = armor.getArmorMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(':');
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        String s1 = String.format("%s:textures/models/armor/%s_layer_%d.png",
                domain, texture, legs ? 2 : 1);
        return new ResourceLocation(s1);
    }
}