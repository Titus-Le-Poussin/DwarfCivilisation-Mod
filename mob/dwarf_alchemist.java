// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class dwarf_villager<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dwarf_villager"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart eye_brow_left_r1;
	private final ModelPart beard4_r1;
	private final ModelPart beard5_r1;
	private final ModelPart beard5_r2;
	private final ModelPart beard3_r1;
	private final ModelPart beard2_r1;
	private final ModelPart beard1_r1;

	public dwarf_villager(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.left_leg = this.body.getChild("left_leg");
		this.right_leg = this.body.getChild("right_leg");
		this.left_arm = this.body.getChild("left_arm");
		this.right_arm = this.body.getChild("right_arm");
		this.head = this.body.getChild("head");
		this.eye_brow_left_r1 = this.head.getChild("eye_brow_left_r1");
		this.beard4_r1 = this.head.getChild("beard4_r1");
		this.beard5_r1 = this.head.getChild("beard5_r1");
		this.beard5_r2 = this.head.getChild("beard5_r2");
		this.beard3_r1 = this.head.getChild("beard3_r1");
		this.beard2_r1 = this.head.getChild("beard2_r1");
		this.beard1_r1 = this.head.getChild("beard1_r1");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(32, 16).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(34, 46).addBox(-3.0F, 7.0F, -3.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -10.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(18, 32).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(46, 46).addBox(-3.0F, 7.0F, -3.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -10.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(5.0F, -2.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(5.0F, -1.5F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(5.0F, -2.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(6.0F, -1.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(6.0F, -1.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(3.0F, -2.5F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(5.0F, -1.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(3.0F, -1.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 1).addBox(3.0F, -2.5F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, -16.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -16.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(8, 48).addBox(0.0F, -10.0F, -2.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 50).addBox(0.0F, -11.0F, -3.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 48).addBox(0.0F, -9.0F, 1.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(32, 29).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -2.25F, -4.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition eye_brow_left_r1 = head.addOrReplaceChild("eye_brow_left_r1", CubeListBuilder.create().texOffs(50, 0).addBox(-0.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(50, 2).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(50, 14).addBox(5.5F, -4.5761F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(34, 50).addBox(-0.5F, -4.5761F, -1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(50, 4).addBox(5.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.5F))
		.texOffs(50, 7).addBox(-0.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-3.5F, -2.4239F, -3.1173F, -0.0436F, 0.0F, 0.0F));

		PartDefinition beard4_r1 = head.addOrReplaceChild("beard4_r1", CubeListBuilder.create().texOffs(14, 48).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-3.5F, -2.4239F, -3.1173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition beard5_r1 = head.addOrReplaceChild("beard5_r1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.5F, -1.5F, -3.5F, -0.3927F, 0.0F, -0.2618F));

		PartDefinition beard5_r2 = head.addOrReplaceChild("beard5_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5F, -1.5F, -3.5F, -0.3927F, 0.0F, 0.2618F));

		PartDefinition beard3_r1 = head.addOrReplaceChild("beard3_r1", CubeListBuilder.create().texOffs(50, 10).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.5F, -1.5F, -3.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition beard2_r1 = head.addOrReplaceChild("beard2_r1", CubeListBuilder.create().texOffs(38, 33).addBox(-2.5F, -2.0F, -1.0F, 5.0F, 8.0F, 2.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 2.8612F, -4.9021F, -0.3054F, 0.0F, 0.0F));

		PartDefinition beard2_r1_r1 = beard2_r1.addOrReplaceChild("beard2_r1_r1", CubeListBuilder.create().texOffs(26, 45).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -0.5F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition beard2_r1_r2 = beard2_r1.addOrReplaceChild("beard2_r1_r2", CubeListBuilder.create().texOffs(18, 45).addBox(0.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition beard1_r1 = head.addOrReplaceChild("beard1_r1", CubeListBuilder.create().texOffs(38, 29).addBox(-7.0F, 0.0F, -1.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.3F))
		.texOffs(38, 43).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.0F, 0.0F, -4.0F, -0.3054F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}