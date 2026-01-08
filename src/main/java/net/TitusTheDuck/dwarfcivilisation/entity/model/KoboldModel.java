package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.KoboldEntity;

public class KoboldModel extends EntityModel<KoboldEntity> {

    private final ModelRenderer root;
    private final ModelRenderer body;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;
    private final ModelRenderer snail;
    private final ModelRenderer snail2;
    private final ModelRenderer snail3;
    private final ModelRenderer left_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer head;
    private final ModelRenderer Machoire;

    public KoboldModel() {
        textureWidth = 64;
        textureHeight = 64;

        root = new ModelRenderer(this);
        root.setRotationPoint(0.0F, 24.0F, 0.0F);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        root.addChild(body);
        body.setTextureOffset(36, 10).addBox(0.0F, -12.0F, 2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(40, 10).addBox(0.0F, -8.0F, 2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(0, 16).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);

        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(3.0F, -6.0F, 0.0F);
        body.addChild(left_leg);
        left_leg.setTextureOffset(0, 29).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(-2.0F, -6.0F, 0.0F);
        body.addChild(right_leg);
        right_leg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        snail = new ModelRenderer(this);
        snail.setRotationPoint(0.0F, -7.0F, 2.0F);
        body.addChild(snail);
        snail.setTextureOffset(0, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        snail2 = new ModelRenderer(this);
        snail2.setRotationPoint(0.0F, 1.0F, 4.0F);
        snail.addChild(snail2);
        snail2.setTextureOffset(44, 35).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, -0.2F, false);

        snail3 = new ModelRenderer(this);
        snail3.setRotationPoint(0.0F, 0.0F, 6.0F);
        snail2.addChild(snail3);
        snail3.setTextureOffset(44, 43).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, 0.15F, false);

        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(3.5F, -14.0F, 0.0F);
        body.addChild(left_arm);
        left_arm.setTextureOffset(16, 35).addBox(0.5F, 0.0F, -2.0F, 4.0F, 7.0F, 3.0F, 0.3F, false);

        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(-4.0F, -14.0F, 0.0F);
        body.addChild(right_arm);
        right_arm.setTextureOffset(30, 35).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 7.0F, 3.0F, 0.3F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, -14.0F, 0.0F);
        body.addChild(head);
        head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(16, 29).addBox(0.0F, -6.0F, 3.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(20, 29).addBox(0.0F, -2.0F, 3.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(24, 29).addBox(0.0F, -8.0F, 1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(32, 10).addBox(0.0F, -8.0F, -2.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        ModelRenderer Teeth_r1 = new ModelRenderer(this);
        Teeth_r1.setRotationPoint(1.0F, -3.0F, 0.0F);
        head.addChild(Teeth_r1);
        setRotationAngle(Teeth_r1, 0.3927F, 0.0F, 0.0F);
        Teeth_r1.setTextureOffset(26, 34).addBox(-4.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r1.setTextureOffset(24, 34).addBox(-2.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r1.setTextureOffset(22, 34).addBox(0.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r1.setTextureOffset(20, 34).addBox(2.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);

        ModelRenderer Teeth_r2 = new ModelRenderer(this);
        Teeth_r2.setRotationPoint(-8.0F, -4.0F, 0.0F);
        head.addChild(Teeth_r2);
        setRotationAngle(Teeth_r2, 0.3927F, 0.0F, 0.0F);
        Teeth_r2.setTextureOffset(20, 45).addBox(4.0F, 2.0F, -7.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);
        Teeth_r2.setTextureOffset(18, 45).addBox(12.0F, 2.0F, -7.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);

        ModelRenderer head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
        head.addChild(head_r1);
        setRotationAngle(head_r1, 0.3054F, 0.0F, 0.0F);
        head_r1.setTextureOffset(28, 16).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 6.0F, 6.0F, -0.001F, false);

        Machoire = new ModelRenderer(this);
        Machoire.setRotationPoint(0.0F, -3.0F, 4.0F);
        head.addChild(Machoire);

        ModelRenderer Teeth_r3 = new ModelRenderer(this);
        Teeth_r3.setRotationPoint(6.0F, 0.0F, -4.0F);
        Machoire.addChild(Teeth_r3);
        setRotationAngle(Teeth_r3, 0.3927F, 0.0F, 0.0F);
        Teeth_r3.setTextureOffset(18, 34).addBox(-4.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r3.setTextureOffset(16, 34).addBox(-6.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r3.setTextureOffset(34, 15).addBox(-8.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r3.setTextureOffset(32, 15).addBox(-10.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, -0.005F, false);
        Teeth_r3.setTextureOffset(28, 28).addBox(-10.0F, 2.0F, -8.0F, 8.0F, 1.0F, 6.0F, -0.001F, false);

        ModelRenderer Teeth_r4 = new ModelRenderer(this);
        Teeth_r4.setRotationPoint(-8.0F, -1.0F, -4.0F);
        Machoire.addChild(Teeth_r4);
        setRotationAngle(Teeth_r4, 0.3927F, 0.0F, 0.0F);
        Teeth_r4.setTextureOffset(44, 14).addBox(4.0F, 2.0F, -8.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);
        Teeth_r4.setTextureOffset(16, 45).addBox(4.0F, 2.0F, -6.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);
        Teeth_r4.setTextureOffset(44, 12).addBox(12.0F, 2.0F, -8.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);
        Teeth_r4.setTextureOffset(44, 10).addBox(12.0F, 2.0F, -6.0F, 0.0F, 1.0F, 1.0F, -0.005F, false);
    }

    @Override
    public void setRotationAngles(KoboldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        // Rotation de la tête
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);

        // Animation des jambes
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;

        // Animation de la queue (snail) qui balance
        this.snail.rotateAngleY = MathHelper.cos(ageInTicks * 0.09F) * 0.15F;
        this.snail2.rotateAngleY = MathHelper.cos(ageInTicks * 0.09F + 0.5F) * 0.2F;
        this.snail3.rotateAngleY = MathHelper.cos(ageInTicks * 0.09F + 1.0F) * 0.25F;

        // Animation de la mâchoire qui s'ouvre en attaquant
        if (entity.isAggressive()) {
            this.Machoire.rotateAngleX = MathHelper.cos(ageInTicks * 0.4F) * 0.15F + 0.2F;
        } else {
            this.Machoire.rotateAngleX = 0.0F;
        }

        // Animation des bras
                    // Animation normale des bras
            this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F;
            this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F;

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