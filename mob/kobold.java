// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class kobold<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "kobold"), "main");
	private final ModelPart root;
	private final ModelPart body;
	private final ModelPart left_leg;
	private final ModelPart right_leg;
	private final ModelPart snail;
	private final ModelPart snail2;
	private final ModelPart snail3;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart Machoire;

	public kobold(ModelPart root) {
		this.root = root.getChild("root");
		this.body = this.root.getChild("body");
		this.left_leg = this.body.getChild("left_leg");
		this.right_leg = this.body.getChild("right_leg");
		this.snail = this.body.getChild("snail");
		this.snail2 = this.snail.getChild("snail2");
		this.snail3 = this.snail2.getChild("snail3");
		this.left_arm = this.body.getChild("left_arm");
		this.right_arm = this.body.getChild("right_arm");
		this.head = this.body.getChild("head");
		this.Machoire = this.head.getChild("Machoire");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = root.addOrReplaceChild("body", CubeListBuilder.create().texOffs(36, 10).addBox(0.0F, -12.0F, 2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(40, 10).addBox(0.0F, -8.0F, 2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 16).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -6.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -6.0F, 0.0F));

		PartDefinition snail = body.addOrReplaceChild("snail", CubeListBuilder.create().texOffs(0, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 2.0F));

		PartDefinition snail2 = snail.addOrReplaceChild("snail2", CubeListBuilder.create().texOffs(44, 35).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offset(0.0F, 1.0F, 4.0F));

		PartDefinition snail3 = snail2.addOrReplaceChild("snail3", CubeListBuilder.create().texOffs(44, 43).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.15F)), PartPose.offset(0.0F, 0.0F, 6.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(16, 35).addBox(0.5F, 0.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offset(3.5F, -14.0F, 0.0F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(30, 35).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.3F)), PartPose.offset(-4.0F, -14.0F, 0.0F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 29).addBox(0.0F, -6.0F, 3.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(20, 29).addBox(0.0F, -2.0F, 3.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 29).addBox(0.0F, -8.0F, 1.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(32, 10).addBox(0.0F, -8.0F, -2.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, 0.0F));

		PartDefinition Teeth_r1 = head.addOrReplaceChild("Teeth_r1", CubeListBuilder.create().texOffs(26, 34).addBox(-4.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(24, 34).addBox(-2.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(22, 34).addBox(0.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(20, 34).addBox(2.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(1.0F, -3.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Teeth_r2 = head.addOrReplaceChild("Teeth_r2", CubeListBuilder.create().texOffs(20, 45).addBox(4.0F, 2.0F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(18, 45).addBox(12.0F, 2.0F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-8.0F, -4.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(28, 16).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Machoire = head.addOrReplaceChild("Machoire", CubeListBuilder.create(), PartPose.offset(0.0F, -3.0F, 4.0F));

		PartDefinition Teeth_r3 = Machoire.addOrReplaceChild("Teeth_r3", CubeListBuilder.create().texOffs(18, 34).addBox(-4.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(16, 34).addBox(-6.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(34, 15).addBox(-8.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(32, 15).addBox(-10.0F, 1.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.005F))
		.texOffs(28, 28).addBox(-10.0F, 2.0F, -8.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(6.0F, 0.0F, -4.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Teeth_r4 = Machoire.addOrReplaceChild("Teeth_r4", CubeListBuilder.create().texOffs(44, 14).addBox(4.0F, 2.0F, -8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(16, 45).addBox(4.0F, 2.0F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(44, 12).addBox(12.0F, 2.0F, -8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F))
		.texOffs(44, 10).addBox(12.0F, 2.0F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-8.0F, -1.0F, -4.0F, 0.3927F, 0.0F, 0.0F));

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