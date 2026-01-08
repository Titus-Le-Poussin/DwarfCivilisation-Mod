// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class dwarf_forger<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dwarf_forger"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart beardgroup;
	private final ModelPart beardgroup2;

	public dwarf_forger(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.left_leg = this.body.getChild("left_leg");
		this.right_leg = this.body.getChild("right_leg");
		this.left_arm = this.body.getChild("left_arm");
		this.right_arm = this.body.getChild("right_arm");
		this.head = this.body.getChild("head");
		this.beardgroup = this.head.getChild("beardgroup");
		this.beardgroup2 = this.beardgroup.getChild("beardgroup2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(32, 16).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -10.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(18, 32).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -10.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 32).addBox(1.5F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(38, 29).addBox(1.5F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.3F))
		.texOffs(38, 29).addBox(1.5F, 8.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(3.5F, -16.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(32, 0).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(38, 39).addBox(-6.0F, -2.0F, -2.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.3F))
		.texOffs(38, 39).addBox(-6.0F, 8.0F, -2.0F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offset(-4.0F, -16.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 52).addBox(-1.0F, -3.0F, -5.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition eye_brow_right_r1 = head.addOrReplaceChild("eye_brow_right_r1", CubeListBuilder.create().texOffs(39, 49).addBox(4.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(39, 49).addBox(9.5F, -3.5F, -1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.3F))
		.texOffs(52, 20).addBox(10.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.5F))
		.texOffs(32, 29).addBox(4.5F, -1.5F, 2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-8.5F, -2.4239F, -3.1173F, -0.0436F, 0.0F, 0.0F));

		PartDefinition beard4_r1 = head.addOrReplaceChild("beard4_r1", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-3.5F, -2.4239F, -3.1173F, -0.3927F, 0.0F, 0.0F));

		PartDefinition beard3_r1 = head.addOrReplaceChild("beard3_r1", CubeListBuilder.create().texOffs(34, 45).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(3.5F, -1.5F, -3.5F, -0.3927F, 0.0F, 0.0F));

		PartDefinition beard_r1 = head.addOrReplaceChild("beard_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(3.0F, 0.0F, -4.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition beardgroup = head.addOrReplaceChild("beardgroup", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -1.2609F, -2.5969F, 0.3054F, 0.0F, 0.0F));

		PartDefinition beardgroup2 = beardgroup.addOrReplaceChild("beardgroup2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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