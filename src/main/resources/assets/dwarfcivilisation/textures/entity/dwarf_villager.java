// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class dwarf_villager extends EntityModel<Entity> {
	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer eye_brow_left_r1;
	private final ModelRenderer beard4_r1;
	private final ModelRenderer beard5_r1;
	private final ModelRenderer beard5_r2;
	private final ModelRenderer beard3_r1;
	private final ModelRenderer beard2_r1;
	private final ModelRenderer beard1_r1;

	public dwarf_villager() {
		texWidth = 64;
		texHeight = 64;

		root = new ModelRenderer(this);
		root.setPos(0.0F, 24.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		root.addChild(body);
		body.texOffs(0, 0).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(3.0F, -10.0F, 0.0F);
		body.addChild(left_leg);
		left_leg.texOffs(32, 16).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(-2.0F, -10.0F, 0.0F);
		body.addChild(right_leg);
		right_leg.texOffs(18, 32).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setPos(3.5F, -16.0F, 0.0F);
		body.addChild(left_arm);
		left_arm.texOffs(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		left_arm.texOffs(38, 35).addBox(1.5F, 2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setPos(-4.0F, -16.0F, 0.0F);
		body.addChild(right_arm);
		right_arm.texOffs(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, 0.0F, false);
		right_arm.texOffs(18, 45).addBox(-6.0F, 2.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.3F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		head.texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(50, 12).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		eye_brow_left_r1 = new ModelRenderer(this);
		eye_brow_left_r1.setPos(-3.5F, -2.4239F, -3.1173F);
		head.addChild(eye_brow_left_r1);
		setRotationAngle(eye_brow_left_r1, -0.0436F, 0.0F, 0.0F);
		eye_brow_left_r1.texOffs(36, 51).addBox(-0.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.texOffs(6, 51).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, 0.3F, false);
		eye_brow_left_r1.texOffs(38, 29).addBox(-0.5F, -3.5F, 2.5F, 8.0F, 1.0F, 5.0F, 0.3F, false);
		eye_brow_left_r1.texOffs(44, 51).addBox(5.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);
		eye_brow_left_r1.texOffs(32, 29).addBox(-0.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, 0.5F, false);

		beard4_r1 = new ModelRenderer(this);
		beard4_r1.setPos(-3.5F, -2.4239F, -3.1173F);
		head.addChild(beard4_r1);
		setRotationAngle(beard4_r1, -0.3927F, 0.0F, 0.0F);
		beard4_r1.texOffs(50, 51).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		beard5_r1 = new ModelRenderer(this);
		beard5_r1.setPos(-3.5F, -1.5F, -3.5F);
		head.addChild(beard5_r1);
		setRotationAngle(beard5_r1, -0.3927F, 0.0F, -0.2618F);
		beard5_r1.texOffs(0, 51).addBox(-0.5F, 3.5F, -0.5F, 1.0F, 3.0F, 2.0F, 0.3F, false);

		beard5_r2 = new ModelRenderer(this);
		beard5_r2.setPos(3.5F, -1.5F, -3.5F);
		head.addChild(beard5_r2);
		setRotationAngle(beard5_r2, -0.3927F, 0.0F, 0.2618F);
		beard5_r2.texOffs(50, 7).addBox(-0.5F, 3.5F, -0.5F, 1.0F, 3.0F, 2.0F, 0.3F, false);

		beard3_r1 = new ModelRenderer(this);
		beard3_r1.setPos(3.5F, -1.5F, -3.5F);
		head.addChild(beard3_r1);
		setRotationAngle(beard3_r1, -0.3927F, 0.0F, 0.0F);
		beard3_r1.texOffs(14, 51).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.3F, false);

		beard2_r1 = new ModelRenderer(this);
		beard2_r1.setPos(0.0F, 2.8612F, -4.9021F);
		head.addChild(beard2_r1);
		setRotationAngle(beard2_r1, -0.3054F, 0.0F, 0.0F);
		beard2_r1.texOffs(50, 0).addBox(-2.5F, -1.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		beard1_r1 = new ModelRenderer(this);
		beard1_r1.setPos(3.0F, 0.0F, -4.0F);
		head.addChild(beard1_r1);
		setRotationAngle(beard1_r1, -0.3054F, 0.0F, 0.0F);
		beard1_r1.texOffs(36, 47).addBox(-7.0F, 0.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.3F, false);
		beard1_r1.texOffs(0, 48).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, -0.001F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}