package net.TitusTheDuck.dwarfcivilisation.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfWarriorModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;

public class DwarfWarriorArmorModel extends EntityModel<DwarfWarriorEntity> {

	private final ModelRenderer root;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer rightArm;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftLeg;

	public DwarfWarriorArmorModel() {
		textureWidth = 64;
		textureHeight = 64;

		root = new ModelRenderer(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(body);
		// PLASTRON - exactement comme dans ton modèle
		body.setTextureOffset(-12, -4).addBox(-5.0F, -18.0F, -3.0F, 10.0F, 10.0F, 6.0F, 0.01F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		body.addChild(head);
		// CASQUE - exactement comme dans ton modèle
		head.setTextureOffset(-15, -8).addBox(-4.5F, -8.5F, -5.0F, 9.0F, 4.0F, 10.0F, 0.01F, false);
		head.setTextureOffset(2, 1).addBox(-0.5F, -4.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.01F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-4.0F, -16.0F, 0.0F);
		body.addChild(rightArm);
		// BRAS DROIT - exactement comme dans ton modèle
		rightArm.setTextureOffset(-8, -4).addBox(-6.5F, -2.5F, -3.0F, 6.0F, 7.0F, 6.0F, 0.01F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(3.5F, -16.0F, 0.0F);
		body.addChild(leftArm);
		// BRAS GAUCHE - exactement comme dans ton modèle
		leftArm.setTextureOffset(-8, -4).addBox(1.0F, -2.5F, -3.0F, 6.0F, 7.0F, 6.0F, 0.01F, true);

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, -10.0F, 0.0F);
		body.addChild(rightLeg);
		// JAMBE DROITE - exactement comme dans ton modèle
		rightLeg.setTextureOffset(-7, -4).addBox(-3.0F, 7.0F, -2.75F, 5.0F, 3.0F, 6.0F, 0.01F, false);
		rightLeg.setTextureOffset(-6, -3).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.01F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setRotationPoint(3.0F, -10.0F, 0.0F);
		body.addChild(leftLeg);
		// JAMBE GAUCHE - exactement comme dans ton modèle
		leftLeg.setTextureOffset(-7, -4).addBox(-3.0F, 7.0F, -2.75F, 5.0F, 3.0F, 6.0F, 0.01F, true);
		leftLeg.setTextureOffset(-6, -3).addBox(-3.0F, 2.0F, -2.0F, 5.0F, 5.0F, 5.0F, 0.01F, true);
	}

	@Override
	public void setRotationAngles(DwarfWarriorEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		// Les rotations sont copiées depuis le modèle principal
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void copyRotationsFrom(DwarfWarriorModel model) {
		this.body.copyModelAngles(model.getBody());
		this.head.copyModelAngles(model.getHead());
		this.rightArm.copyModelAngles(model.getRightArm());
		this.leftArm.copyModelAngles(model.getLeftArm());
		this.rightLeg.copyModelAngles(model.getRightLeg());
		this.leftLeg.copyModelAngles(model.getLeftLeg());
	}
}