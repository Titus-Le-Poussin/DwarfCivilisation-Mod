package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfWarriorModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfWarriorRender extends MobRenderer <DwarfWarriorEntity, DwarfWarriorModel <DwarfWarriorEntity>> {
    protected  static final ResourceLocation TEXTURE =
            new ResourceLocation(DwarfCivilisationMod.MOD_ID, "textures/mob/model_dwarf2_basic_1");

    public DwarfWarriorRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfWarriorModel<>(), 1f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfWarriorEntity entity) {return TEXTURE;}
}
