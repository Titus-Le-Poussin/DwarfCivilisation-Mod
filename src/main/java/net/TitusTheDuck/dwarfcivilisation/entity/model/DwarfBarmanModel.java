package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfBarmanEntity;

public class DwarfBarmanModel extends EntityModel<DwarfBarmanEntity> {

	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer beardgroup;
	private final ModelRenderer beardgroup2;

	public DwarfBarmanModel() {
		textureWidth = 128;
		textureHeight = 128;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(body);
		body.setTextureOffset(0, 0).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, -10.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(34, 43).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, -10.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(0, 45).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.5F, -16.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(32, 11).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(50, 11).addBox(1.5F, -2.0F, -2.0F, 5.0F, 10.0F, 4.0F, 0.3F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -16.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(34, 27).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(52, 25).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 10.0F, 4.0F, 0.3F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(20, 45).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 32).addBox(-4.0F, -9.9239F, -4.6173F, 8.0F, 4.0F, 9.0F, 0.3F, false);
		head.setTextureOffset(54, 39).addBox(4.0F, -8.9239F, -3.6173F, 1.0F, 2.0F, 7.0F, 0.3F, false);
		head.setTextureOffset(54, 48).addBox(-5.0F, -8.9239F, -3.6173F, 1.0F, 2.0F, 7.0F, 0.3F, false);
		head.setTextureOffset(32, 0).addBox(-3.0F, -10.9239F, -3.6173F, 6.0F, 4.0F, 7.0F, 0.3F, false);

		ModelRenderer eye_brow_right_r1 = new ModelRenderer(this);
		eye_brow_right_r1.setRotationPoint(-8.5F, -2.4239F, -3.1173F);
		head.addChild(eye_brow_right_r1);
		setRotationAngle(eye_brow_right_r1, -0.0436F, 0.0F, 0.0F);
		eye_brow_right_r1.setTextureOffset(20, 51).addBox(5.5F, -3.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		eye_brow_right_r1.setTextureOffset(20, 49).addBox(9.5F, -3.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		eye_brow_right_r1.setTextureOffset(26, 48).addBox(10.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		eye_brow_right_r1.setTextureOffset(26, 45).addBox(4.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		ModelRenderer hair_r1 = new ModelRenderer(this);
		hair_r1.setRotationPoint(-3.0F, -9.4239F, 0.8827F);
		head.addChild(hair_r1);
		setRotationAngle(hair_r1, 0.0F, -1.5708F, 0.0F);
		hair_r1.setTextureOffset(36, 56).addBox(3.0F, 0.5F, -6.5F, 1.0F, 2.0F, 7.0F, 0.3F, false);

		ModelRenderer hair_r2 = new ModelRenderer(this);
		hair_r2.setRotationPoint(-3.0F, -9.4239F, -8.1173F);
		head.addChild(hair_r2);
		setRotationAngle(hair_r2, 0.0F, -1.5708F, 0.0F);
		hair_r2.setTextureOffset(20, 56).addBox(3.0F, 0.5F, -6.5F, 1.0F, 2.0F, 7.0F, 0.3F, false);

		ModelRenderer beard4_r1 = new ModelRenderer(this);
		beard4_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(beard4_r1);
		setRotationAngle(beard4_r1, -0.3927F, 0.0F, 0.0F);
		beard4_r1.setTextureOffset(30, 51).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard3_r1 = new ModelRenderer(this);
		beard3_r1.setRotationPoint(3.5F, -1.5F, -3.5F);
		head.addChild(beard3_r1);
		setRotationAngle(beard3_r1, -0.3927F, 0.0F, 0.0F);
		beard3_r1.setTextureOffset(26, 51).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		ModelRenderer beard_r1 = new ModelRenderer(this);
		beard_r1.setRotationPoint(3.0F, 1.0F, -4.0F);
		head.addChild(beard_r1);
		setRotationAngle(beard_r1, -0.3054F, 0.0F, 0.0F);
		beard_r1.setTextureOffset(52, 57).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);

		beardgroup = new ModelRenderer(this);
		beardgroup.setRotationPoint(3.0F, -1.2609F, -2.5969F);
		head.addChild(beardgroup);
		setRotationAngle(beardgroup, 0.3054F, 0.0F, 0.0F);

		beardgroup2 = new ModelRenderer(this);
		beardgroup2.setRotationPoint(0.0F, 0.0F, 0.0F);
		beardgroup.addChild(beardgroup2);
	}

	@Override
	public void setRotationAngles(DwarfBarmanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Animation des jambes
		this.right_leg.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount);
		this.left_leg.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 1.4F * limbSwingAmount);

		// Animation des bras (un peu moins pour un barman qui sert des boissons)
		this.right_arm.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 1.0F * limbSwingAmount * 0.5F);
		this.left_arm.rotateAngleX = (float) (Math.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount * 0.5F);

		// Rotation de la tête
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