package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfHerboristEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfHerboristModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfHerboristRender extends MobRenderer<DwarfHerboristEntity, DwarfHerboristModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_herborist.png");

    public DwarfHerboristRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfHerboristModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfHerboristEntity entity) {
        return TEXTURE;
    }
}