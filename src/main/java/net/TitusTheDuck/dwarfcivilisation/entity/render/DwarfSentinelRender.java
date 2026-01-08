package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfSentinelEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfSentinelModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfSentinelRender extends MobRenderer<DwarfSentinelEntity, DwarfSentinelModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_sentinel.png");

    public DwarfSentinelRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfSentinelModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfSentinelEntity entity) {
        return TEXTURE;
    }
}