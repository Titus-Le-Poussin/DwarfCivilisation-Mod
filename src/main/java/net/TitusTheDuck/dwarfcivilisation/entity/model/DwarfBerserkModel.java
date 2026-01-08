package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
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

		// ================= BODY (PLUS MASSIF) =================
		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(body);
		body.setTextureOffset(0, 0)
				.addBox(-6.0F, -19.0F, -4.0F, 12.0F, 11.0F, 8.0F, 0.3F);

		// ================= LEGS =================
		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, -10.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.setTextureOffset(32, 16)
				.addBox(-3.0F, 2.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.2F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, -10.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.setTextureOffset(18, 32)
				.addBox(-3.0F, 2.0F, -2.5F, 5.0F, 8.0F, 5.0F, 0.2F);

		// ================= ARMS (BERSERK = GROS BRAS) =================
		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.5F, -17.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.setTextureOffset(0, 32)
				.addBox(0.0F, -2.0F, -2.5F, 6.0F, 13.0F, 5.0F, 0.4F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -17.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(32, 0)
				.addBox(-6.0F, -2.0F, -2.5F, 6.0F, 13.0F, 5.0F, 0.4F);

		// ================= HEAD =================
		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -19.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16)
				.addBox(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, 0.2F);

		// ================= BEARD (OBLIGATOIRE) =================
		ModelRenderer beard = new ModelRenderer(this);
		beard.setRotationPoint(0.0F, 0.0F, -4.5F);
		head.addChild(beard);
		setRotationAngle(beard, -0.3F, 0.0F, 0.0F);
		beard.setTextureOffset(38, 43)
				.addBox(-4.0F, 0.0F, -1.0F, 8.0F, 7.0F, 2.0F, 0.3F);

		ModelRenderer beard_side_l = new ModelRenderer(this);
		beard_side_l.setRotationPoint(3.5F, -1.5F, -3.5F);
		head.addChild(beard_side_l);
		setRotationAngle(beard_side_l, -0.4F, 0.0F, 0.0F);
		beard_side_l.setTextureOffset(50, 10)
				.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.3F);

		ModelRenderer beard_side_r = new ModelRenderer(this);
		beard_side_r.setRotationPoint(-3.5F, -1.5F, -3.5F);
		head.addChild(beard_side_r);
		setRotationAngle(beard_side_r, -0.4F, 0.0F, 0.0F);
		beard_side_r.setTextureOffset(14, 48)
				.addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.3F);
	}

	// ================= ANIMATIONS BERSERK =================
	@Override
	public void setRotationAngles(
			DwarfBerserkEntity entity,
			float limbSwing,
			float limbSwingAmount,
			float ageInTicks,
			float netHeadYaw,
			float headPitch
	) {
		// Jambes lourdes
		right_leg.rotateAngleX =
				(float) (Math.cos(limbSwing * 0.6662F) * 1.3F * limbSwingAmount);
		left_leg.rotateAngleX =
				(float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 1.3F * limbSwingAmount);

		// Bras agressifs (berserk)
		right_arm.rotateAngleX =
				(float) (Math.cos(limbSwing * 0.6662F + Math.PI) * 2.0F * limbSwingAmount);
		left_arm.rotateAngleX =
				(float) (Math.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount);

		// Tête
		head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
		head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void render(
			MatrixStack matrixStack,
			IVertexBuilder buffer,
			int packedLight,
			int packedOverlay,
			float red,
			float green,
			float blue,
			float alpha
	) {
		root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	private void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
