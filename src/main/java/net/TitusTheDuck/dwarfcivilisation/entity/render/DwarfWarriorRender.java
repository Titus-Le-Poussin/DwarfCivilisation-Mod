package net.TitusTheDuck.dwarfcivilisation.entity.render;

import net.TitusTheDuck.dwarfcivilisation.DwarfCivilisationMod;
import net.TitusTheDuck.dwarfcivilisation.entity.custom.DwarfWarriorEntity;
import net.TitusTheDuck.dwarfcivilisation.entity.model.DwarfWarriorModel;
import net.TitusTheDuck.dwarfcivilisation.entity.layer.DwarfArmorLayer;
import net.TitusTheDuck.dwarfcivilisation.entity.layer.DwarfWeaponLayer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DwarfWarriorRender extends MobRenderer<DwarfWarriorEntity, DwarfWarriorModel> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(
            DwarfCivilisationMod.MOD_ID, "textures/entity/dwarf_warrior.png");

    public DwarfWarriorRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DwarfWarriorModel(), 0.5f);

        // Ajoute les layers pour l'armure et l'arme
        this.addLayer(new DwarfArmorLayer(this));
        this.addLayer(new DwarfWeaponLayer(this));
    }

    @Override
    public ResourceLocation getEntityTexture(DwarfWarriorEntity entity) {
        return TEXTURE;
    }
}