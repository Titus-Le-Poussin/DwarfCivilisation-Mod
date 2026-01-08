package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfBarmanEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfBarmanModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfBarmanRender extends MobRenderer<DwarfBarmanEntity, DwarfBarmanModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_barman.png");

    public DwarfBarmanRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfBarmanModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfBarmanEntity entity) {
        return TEXTURE;
    }
}