package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfForgerEntity;

public class DwarfForgerModel extends EntityModel<DwarfForgerEntity> {

    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
    private final ModelRenderer left_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer head;
    private final ModelRenderer beardgroup;
    private final ModelRenderer beardgroup2;

    public DwarfForgerModel() {
        textureWidth = 64;
        textureHeight = 64;

        root = new ModelRenderer(this);
        root.setRotationPoint(0.0F, 24.0F, 0.0F);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(body);
        body.setTextureOffset(0, 0).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(3.0F, -10.0F, 0.0F);
        body.addChild(left_leg);
        left_leg.setTextureOffset(32, 16).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-2.0F, -10.0F, 0.0F);
        body.addChild(right_leg);
        right_leg.setTextureOffset(18, 32).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(3.5F, -16.0F, 0.0F);
        body.addChild(left_arm);
        left_arm.setTextureOffset(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
        // Gants/protections de forgeron
        left_arm.setTextureOffset(38, 29).addBox(1.5F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);
        left_arm.setTextureOffset(38, 29).addBox(1.5F, 8.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.3F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(-4.0F, -16.0F, 0.0F);
        body.addChild(right_arm);
        right_arm.setTextureOffset(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
        // Gants/protections de forgeron
        right_arm.setTextureOffset(38, 39).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);
        right_arm.setTextureOffset(38, 39).addBox(-6.0F, 8.0F, -2.0F, 5.0F, 2.0F, 4.0F, 0.3F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -18.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(16, 52).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

        ModelRenderer eye_brow_right_r1 = new ModelRenderer(this);
        eye_brow_right_r1.setRotationPoint(-8.5F, -2.4239F, -3.1173F);
        head.addChild(eye_brow_right_r1);
        setRotationAngle(eye_brow_right_r1, -0.0436F, 0.0F, 0.0F);
        eye_brow_right_r1.setTextureOffset(39, 49).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
        eye_brow_right_r1.setTextureOffset(39, 49).addBox(9.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
        eye_brow_right_r1.setTextureOffset(52, 20).addBox(10.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
        eye_brow_right_r1.setTextureOffset(32, 29).addBox(4.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

        ModelRenderer beard4_r1 = new ModelRenderer(this);
        beard4_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
        head.addChild(beard4_r1);
        setRotationAngle(beard4_r1, -0.3927F, 0.0F, 0.0F);
        beard4_r1.setTextureOffset(22, 52).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

        ModelRenderer beard3_r1 = new ModelRenderer(this);
        beard3_r1.setRotationPoint(3.5F, -1.5F, -3.5F);
        head.addChild(beard3_r1);
        setRotationAngle(beard3_r1, -0.3927F, 0.0F, 0.0F);
        beard3_r1.setTextureOffset(34, 45).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

        ModelRenderer beard_r1 = new ModelRenderer(this);
        beard_r1.setRotationPoint(3.0F, 0.0F, -4.0F);
        head.addChild(beard_r1);
        setRotationAngle(beard_r1, -0.3054F, 0.0F, 0.0F);
        beard_r1.setTextureOffset(0, 48).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);

        beardgroup = new ModelRenderer(this);
        beardgroup.setRotationPoint(3.0F, -1.2609F, -2.5969F);
        head.addChild(beardgroup);
        setRotationAngle(beardgroup, 0.3054F, 0.0F, 0.0F);

        beardgroup2 = new ModelRenderer(this);
        beardgroup2.setRotationPoint(0.0F, 0.0F, 0.0F);
        beardgroup.addChild(beardgroup2);
    }

    @Override
    public void setRotationAngles(DwarfForgerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Animation des jambes
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        // Animation de forge (bras qui martèle)
        if (entity.isForging()) {
            // Bras droit qui martèle
            this.right_arm.rotateAngleX = MathHelper.cos(ageInTicks * 0.6F) * 0.8F - 1.2F;
            this.right_arm.rotateAngleZ = 0.0F;

            // Bras gauche qui tient l'enclume/pièce
            this.left_arm.rotateAngleX = -1.0F;
            this.left_arm.rotateAngleZ = 0.3F;
        } else {
            // Animation normale des bras
            this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
            this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;
            this.right_arm.rotateAngleZ = 0.0F;
            this.left_arm.rotateAngleZ = 0.0F;
        }

        // Rotation de la tête
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}