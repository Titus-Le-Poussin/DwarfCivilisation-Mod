package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfForgerEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfForgerModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfForgerRender extends MobRenderer<DwarfForgerEntity, DwarfForgerModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_forger.png");

    public DwarfForgerRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfForgerModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfForgerEntity entity) {
        return TEXTURE;
    }
}