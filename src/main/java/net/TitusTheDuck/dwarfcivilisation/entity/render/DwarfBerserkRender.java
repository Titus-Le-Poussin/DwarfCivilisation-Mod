package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfBerserkEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfBerserkModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfBerserkRender extends MobRenderer<DwarfBerserkEntity, DwarfBerserkModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_berserk.png");

    public DwarfBerserkRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfBerserkModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfBerserkEntity entity) {
        return TEXTURE;
    }
}