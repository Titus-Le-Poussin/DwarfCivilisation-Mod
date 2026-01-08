package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.KoboldEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.KoboldModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class KoboldRender extends MobRenderer<KoboldEntity, KoboldModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/classic_kobold.png");

    public KoboldRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new KoboldModel(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(KoboldEntity entity) {
        return TEXTURE;
    }
}