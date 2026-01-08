package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfAlchemistEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfAlchemistModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfAlchemistRender extends MobRenderer<DwarfAlchemistEntity, DwarfAlchemistModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_alchemist.png");

    public DwarfAlchemistRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfAlchemistModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfAlchemistEntity entity) {
        return TEXTURE;
    }
}