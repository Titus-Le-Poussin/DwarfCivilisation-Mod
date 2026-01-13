package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.minecraft.util.HandSide;

public class DwarfWarriorModel extends EntityModel<DwarfWarriorEntity> {

	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer beardgroup;
	private final ModelRenderer beardgroup2;

	public DwarfWarriorModel() {
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
		left_arm.setTextureOffset(38, 29).addBox(1.5F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, -16.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.setTextureOffset(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(38, 39).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		head.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(16, 52).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 45).addBox(-1.0F, -7.9239F, -2.6173F, 2.0F, 1.0F, 6.0F, 0.3F, false);

		ModelRenderer eye_brow_left_r1 = new ModelRenderer(this);
		eye_brow_left_r1.setRotationPoint(-3.5F, -2.4239F, -3.1173F);
		head.addChild(eye_brow_left_r1);
		setRotationAngle(eye_brow_left_r1, -0.0436F, 0.0F, 0.0F);
		eye_brow_left_r1.setTextureOffset(34, 49).addBox(-0.5F, -3.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.setTextureOffset(52, 20).addBox(5.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		eye_brow_left_r1.setTextureOffset(32, 29).addBox(-0.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

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

		ModelRenderer beard5_r1 = new ModelRenderer(this);
		beard5_r1.setRotationPoint(1.0F, -0.1388F, -4.9021F);
		head.addChild(beard5_r1);
		setRotationAngle(beard5_r1, -0.2986F, 0.0387F, 0.1251F);
		beard5_r1.setTextureOffset(8, 51).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 8.0F, 2.0F, -0.04F, false);

		ModelRenderer beard5_r2 = new ModelRenderer(this);
		beard5_r2.setRotationPoint(-1.0F, -0.1388F, -4.9021F);
		head.addChild(beard5_r2);
		setRotationAngle(beard5_r2, -0.3052F, 0.0F, -0.165F);
		beard5_r2.setTextureOffset(0, 51).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 8.0F, 2.0F, -0.001F, false);

		ModelRenderer beard2_r1 = new ModelRenderer(this);
		beard2_r1.setRotationPoint(0.0F, 0.4769F, -4.1504F);
		head.addChild(beard2_r1);
		setRotationAngle(beard2_r1, -0.3054F, 0.0F, 0.0F);
		beard2_r1.setTextureOffset(50, 0).addBox(-2.5F, -1.5F, -1.0F, 5.0F, 3.0F, 2.0F, 0.001F, false);

		ModelRenderer beard_r1 = new ModelRenderer(this);
		beard_r1.setRotationPoint(3.0F, 0.0F, -4.0F);
		head.addChild(beard_r1);
		setRotationAngle(beard_r1, -0.3054F, 0.0F, 0.0F);
		beard_r1.setTextureOffset(0, 48).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);

		beardgroup = new ModelRenderer(this);
		beardgroup.setRotationPoint(3.0F, -1.2608F, -2.5969F);
		head.addChild(beardgroup);
		setRotationAngle(beardgroup, 0.3054F, 0.0F, 0.0F);

		ModelRenderer beard5_r3 = new ModelRenderer(this);
		beard5_r3.setRotationPoint(0.0F, 1.122F, -2.3052F);
		beardgroup.addChild(beard5_r3);
		setRotationAngle(beard5_r3, -0.3054F, 0.0F, 0.0F);
		beard5_r3.setTextureOffset(50, 5).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 8.0F, 2.0F, -0.04F, false);

		ModelRenderer beard5_r4 = new ModelRenderer(this);
		beard5_r4.setRotationPoint(0.0F, 6.0F, -3.0F);
		beardgroup.addChild(beard5_r4);
		setRotationAngle(beard5_r4, -0.3054F, 0.0F, 0.0F);
		beard5_r4.setTextureOffset(42, 51).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, -0.04F, false);

		beardgroup2 = new ModelRenderer(this);
		beardgroup2.setRotationPoint(0.0F, 0.0F, 0.0F);
		beardgroup.addChild(beardgroup2);

		ModelRenderer beard5_r5 = new ModelRenderer(this);
		beard5_r5.setRotationPoint(0.0F, 1.122F, -2.3052F);
		beardgroup2.addChild(beard5_r5);
		setRotationAngle(beard5_r5, -0.3054F, 0.0F, 0.0F);
		beard5_r5.setTextureOffset(34, 51).addBox(-7.0F, -1.0F, 0.0F, 2.0F, 8.0F, 2.0F, -0.04F, false);

		ModelRenderer beard5_r6 = new ModelRenderer(this);
		beard5_r6.setRotationPoint(0.0F, 6.0F, -3.0F);
		beardgroup2.addChild(beard5_r6);
		setRotationAngle(beard5_r6, -0.3054F, 0.0F, 0.0F);
		beard5_r6.setTextureOffset(52, 15).addBox(-7.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, -0.04F, false);
	}

	@Override
	public void setRotationAngles(DwarfWarriorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
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

	public void translateHand(HandSide side, MatrixStack matrixStack) {
		ModelRenderer arm = side == HandSide.RIGHT ? this.right_arm : this.left_arm;

		// Translate vers la position du bras
		if (side == HandSide.RIGHT) {
			matrixStack.translate(-0.3125D, 0.125D, 0.0D);
		} else {
			matrixStack.translate(0.3125D, 0.125D, 0.0D);
		}
	}

	// Garde la méthode existante
	public void copyModelAttributesTo(DwarfWarriorModel target) {
		target.isChild = this.isChild;
		target.isSitting = this.isSitting;
		target.swingProgress = this.swingProgress;

		// Copie les rotations
		target.head.copyModelAngles(this.head);
		target.body.copyModelAngles(this.body);
		target.right_arm.copyModelAngles(this.right_arm);
		target.left_arm.copyModelAngles(this.left_arm);
		target.right_leg.copyModelAngles(this.right_leg);
		target.left_leg.copyModelAngles(this.left_leg);
	}

	// AJOUTE cette nouvelle méthode pour BipedModel
	public void copyModelAttributesTo(BipedModel<?> target) {
		target.isChild = this.isChild;
		target.isSitting = this.isSitting;
		target.swingProgress = this.swingProgress;

		// Copie les rotations vers le BipedModel
		target.bipedHead.copyModelAngles(this.head);
		target.bipedBody.copyModelAngles(this.body);
		target.bipedRightArm.copyModelAngles(this.right_arm);
		target.bipedLeftArm.copyModelAngles(this.left_arm);
		target.bipedRightLeg.copyModelAngles(this.right_leg);
		target.bipedLeftLeg.copyModelAngles(this.left_leg);
	}

	// Fonction helper pour définir les rotations
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	// À ajouter à la fin de DwarfWarriorModel.java
	public ModelRenderer getHead() {
		return this.head;
	}

	public ModelRenderer getBody() {
		return this.body;
	}

	public ModelRenderer getRightArm() {
		return this.right_arm;
	}

	public ModelRenderer getLeftArm() {
		return this.left_arm;
	}

	public ModelRenderer getRightLeg() {
		return this.right_leg;
	}

	public ModelRenderer getLeftLeg() {
		return this.left_leg;
	}
}