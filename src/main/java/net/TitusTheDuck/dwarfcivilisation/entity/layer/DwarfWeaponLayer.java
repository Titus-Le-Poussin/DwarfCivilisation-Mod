package net.TitusTheDuck.dwarfcivilisation.entity.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.vector.Vector3f;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfWarriorModel;

public class DwarfWeaponLayer extends LayerRenderer<DwarfWarriorEntity, DwarfWarriorModel> {

    public DwarfWeaponLayer(IEntityRenderer<DwarfWarriorEntity, DwarfWarriorModel> renderer) {
        super(renderer);
    }

    @Override
    public void render(MatrixStack matrixStack, IRenderTypeBuffer buffer, int packedLight,
                       DwarfWarriorEntity entity, float limbSwing, float limbSwingAmount,
                       float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {

        ItemStack weapon = entity.getWeapon();
        if (!weapon.isEmpty()) {
            matrixStack.push();

            // Position de l'épée: x=-9, y=-8, z=-1 (main droite selon ton modèle)
            // Converti en coordonnées depuis le centre (0, 24, 0)
            matrixStack.translate(-0.5625D, 1.0D, -0.0625D);

            // Rotation pour que l'épée soit bien tenue
            matrixStack.rotate(Vector3f.ZP.rotationDegrees(-45.0F));
            matrixStack.rotate(Vector3f.YP.rotationDegrees(180.0F));

            // Scale de l'épée pour correspondre au nain
            matrixStack.scale(0.8F, 0.8F, 0.8F);

            // Rend l'épée
            Minecraft.getInstance().getItemRenderer().renderItem(weapon,
                    ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND,
                    packedLight, OverlayTexture.NO_OVERLAY, matrixStack, buffer);

            matrixStack.pop();
        }
    }
}