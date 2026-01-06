package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfSentinelEntity;

public class DwarfSentinelModel extends EntityModel<DwarfSentinelEntity> {

	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;

	public DwarfSentinelModel() {
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
		left_arm.setTextureOffset(38, 35).addBox(1.5F, 2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -16.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 45).addBox(-6.0F, 2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(50, 12).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ModelRenderer eye_brow_left_r1 = new ModelRenderer(this);
		eye_brow_left_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(eye_brow_left_r1);
		setRotationAngle(eye_brow_left_r1, -0.0436F, 0.0F, 0.0F);
		eye_brow_left_r1.setTextureOffset(36, 51).addBox(-0.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(6, 51).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(38, 29).addBox(-0.5F, -3.5F, 2.5F, 8.0F, 1.0F, 5.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(44, 51).addBox(5.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		eye_brow_left_r1.setTextureOffset(32, 29).addBox(-0.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		ModelRenderer beard4_r1 = new ModelRenderer(this);
		beard4_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(beard4_r1);
		setRotationAngle(beard4_r1, -0.3927F, 0.0F, 0.0F);
		beard4_r1.setTextureOffset(50, 51).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard5_r1 = new ModelRenderer(this);
		beard5_r1.setRotationPoint(-3.5F, -1.5F, -3.5F);
		head.addChild(beard5_r1);
		setRotationAngle(beard5_r1, -0.3927F, 0.0F, -0.2618F);
		beard5_r1.setTextureOffset(0, 51).addBox(-0.5F, 3.5F, -0.5F, 1.0F, 3.0F, 2.0F, 0.3F, false);

		ModelRenderer beard5_r2 = new ModelRenderer(this);
		beard5_r2.setRotationPoint(3.5F, -1.5F, -3.5F);
		head.addChild(beard5_r2);
		setRotationAngle(beard5_r2, -0.3927F, 0.0F, 0.2618F);
		beard5_r2.setTextureOffset(50, 7).addBox(-0.5F, 3.5F, -0.5F, 1.0F, 3.0F, 2.0F, 0.3F, false);

		ModelRenderer beard3_r1 = new ModelRenderer(this);
		beard3_r1.setRotationPoint(3.5F, -1.5F, -3.5F);
		head.addChild(beard3_r1);
		setRotationAngle(beard3_r1, -0.3927F, 0.0F, 0.0F);
		beard3_r1.setTextureOffset(14, 51).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard2_r1 = new ModelRenderer(this);
		beard2_r1.setRotationPoint(0.0F, 2.8612F, -4.9021F);
		head.addChild(beard2_r1);
		setRotationAngle(beard2_r1, -0.3054F, 0.0F, 0.0F);
		beard2_r1.setTextureOffset(50, 0).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		ModelRenderer beard1_r1 = new ModelRenderer(this);
		beard1_r1.setRotationPoint(3.0F, 0.0F, -4.0F);
		head.addChild(beard1_r1);
		setRotationAngle(beard1_r1, -0.3054F, 0.0F, 0.0F);
		beard1_r1.setTextureOffset(36, 47).addBox(-7.0F, 0.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.3F, false);
		beard1_r1.setTextureOffset(0, 48).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);
	}

	@Override
	public void setRotationAngles(DwarfSentinelEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Animation des jambes
		this.right_leg.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.left_leg.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 1.4F * limbSwingAmount);

		// Animation des bras
		this.right_arm.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 2.0F * limbSwingAmount * 0.5F);
		this.left_arm.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F);

		// Rotation de la tête (et la barbe suit)
		this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	// Fonction helper pour définir les rotations
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}