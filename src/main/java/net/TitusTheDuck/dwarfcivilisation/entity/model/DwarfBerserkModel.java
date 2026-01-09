package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfBerserkEntity;

public class DwarfBerserkModel extends EntityModel<DwarfBerserkEntity> {

	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;

	public DwarfBerserkModel() {
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
		left_leg.setTextureOffset(34, 46).addBox(-3.0F, 7.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, -10.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(18, 32).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(46, 46).addBox(-3.0F, 7.0F, -3.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.5F, -16.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.2F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -16.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 32).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, 0.2F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		ModelRenderer head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -1.25F, -4.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.3054F, 0.0F, 0.0F);
		head_r1.setTextureOffset(32, 29).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer eye_brow_left_r1 = new ModelRenderer(this);
		eye_brow_left_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(eye_brow_left_r1);
		setRotationAngle(eye_brow_left_r1, -0.0436F, 0.0F, 0.0F);
		eye_brow_left_r1.setTextureOffset(50, 0).addBox(-0.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(50, 2).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(52, 2).addBox(3.0F, -5.25F, 6.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(50, 14).addBox(5.5F, -4.5761F, -1.5F, 2.0F, 1.0F, 1.0F, -0.005F, false);
		eye_brow_left_r1.setTextureOffset(34, 50).addBox(-0.5F, -4.5761F, -1.5F, 2.0F, 1.0F, 1.0F, -0.005F, false);
		eye_brow_left_r1.setTextureOffset(50, 4).addBox(5.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		eye_brow_left_r1.setTextureOffset(50, 7).addBox(-0.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		ModelRenderer eye_brow_left_r1_r1 = new ModelRenderer(this);
		eye_brow_left_r1_r1.setRotationPoint(4.0F, 5.25F, 7.5F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r1);
		setRotationAngle(eye_brow_left_r1_r1, 0.1745F, 0.0F, 0.0F);
		eye_brow_left_r1_r1.setTextureOffset(50, 1).addBox(-1.5F, 1.75F, -0.5F, 2.0F, 2.0F, 2.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1_r2 = new ModelRenderer(this);
		eye_brow_left_r1_r2.setRotationPoint(3.5F, 5.25F, 8.0F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r2);
		setRotationAngle(eye_brow_left_r1_r2, 0.1745F, 0.0F, 0.0F);
		eye_brow_left_r1_r2.setTextureOffset(52, 2).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1_r2.setTextureOffset(50, 1).addBox(-1.0F, -7.5F, -0.5F, 2.0F, 8.0F, 2.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1_r3 = new ModelRenderer(this);
		eye_brow_left_r1_r3.setRotationPoint(3.5F, -5.75F, 7.0F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r3);
		setRotationAngle(eye_brow_left_r1_r3, -0.829F, 0.0F, 0.0F);
		eye_brow_left_r1_r3.setTextureOffset(52, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1_r4 = new ModelRenderer(this);
		eye_brow_left_r1_r4.setRotationPoint(3.5F, -5.75F, 5.0F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r4);
		setRotationAngle(eye_brow_left_r1_r4, -0.829F, 0.0F, 0.0F);
		eye_brow_left_r1_r4.setTextureOffset(52, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1_r5 = new ModelRenderer(this);
		eye_brow_left_r1_r5.setRotationPoint(3.5F, -5.75F, 3.0F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r5);
		setRotationAngle(eye_brow_left_r1_r5, -0.829F, 0.0F, 0.0F);
		eye_brow_left_r1_r5.setTextureOffset(52, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1_r6 = new ModelRenderer(this);
		eye_brow_left_r1_r6.setRotationPoint(3.5F, -5.75F, 1.0F);
		eye_brow_left_r1.addChild(eye_brow_left_r1_r6);
		setRotationAngle(eye_brow_left_r1_r6, -0.829F, 0.0F, 0.0F);
		eye_brow_left_r1_r6.setTextureOffset(52, 2).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.3F, false);

		ModelRenderer beard4_r1 = new ModelRenderer(this);
		beard4_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(beard4_r1);
		setRotationAngle(beard4_r1, -0.3927F, 0.0F, 0.0F);
		beard4_r1.setTextureOffset(14, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard3_r1 = new ModelRenderer(this);
		beard3_r1.setRotationPoint(3.5F, -1.5F, -3.5F);
		head.addChild(beard3_r1);
		setRotationAngle(beard3_r1, -0.3927F, 0.0F, 0.0F);
		beard3_r1.setTextureOffset(50, 10).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard1_r1 = new ModelRenderer(this);
		beard1_r1.setRotationPoint(3.0F, 0.0F, -4.0F);
		head.addChild(beard1_r1);
		setRotationAngle(beard1_r1, -0.3054F, 0.0F, 0.0F);
		beard1_r1.setTextureOffset(38, 29).addBox(-7.0F, 0.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.3F, false);
		beard1_r1.setTextureOffset(39, 29).addBox(-6.5F, 2.5F, -1.0F, 7.0F, 2.0F, 2.0F, 0.3F, false);
		beard1_r1.setTextureOffset(41, 29).addBox(-5.5F, 5.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.3F, false);
		beard1_r1.setTextureOffset(43, 29).addBox(-4.5F, 7.5F, -1.0F, 3.0F, 0.0F, 2.0F, 0.3F, false);
		beard1_r1.setTextureOffset(38, 43).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);
	}

	@Override
	public void setRotationAngles(DwarfBerserkEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Animation des jambes (plus rapide et agressive)
		this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.8F) * 1.6F * limbSwingAmount;
		this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.8F + (float)Math.PI) * 1.6F * limbSwingAmount;

		// Animation des bras (mouvements amples et agressifs)
		this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.8F + (float)Math.PI) * 2.5F * limbSwingAmount * 0.7F;
		this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.8F) * 2.5F * limbSwingAmount * 0.7F;

		// Rotation de la tête (CORRECTION ICI)
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);

		// Animation de rage quand il attaque (APRÈS la rotation de base)
		if (entity.isAggressive()) {
			this.right_arm.rotateAngleX += MathHelper.cos(ageInTicks * 0.4F) * 0.3F - 0.8F;
			this.left_arm.rotateAngleX += MathHelper.cos(ageInTicks * 0.4F + 1.0F) * 0.3F - 0.8F;

			// Tête qui bouge de rage (légèrement de haut en bas)
			this.head.rotateAngleX += MathHelper.cos(ageInTicks * 0.3F) * 0.05F;
		}
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