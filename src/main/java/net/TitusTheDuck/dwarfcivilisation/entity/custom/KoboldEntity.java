package net.TitusTheDuck.dwarfcivilisation.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class KoboldEntity extends MonsterEntity {

    public KoboldEntity(EntityType<? extends MonsterEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MonsterEntity.func_234295_eP_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.30D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 5.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 24.0D)
                .createMutableAttribute(Attributes.ARMOR, 2.0D);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(4, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));

        // Attaque TOUT sauf les Blaze et Magma Cubes
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, VillagerEntity.class, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, IronGolemEntity.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, ZombieEntity.class, true));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, SkeletonEntity.class, true));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, CreeperEntity.class, true));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal<>(this, SpiderEntity.class, true));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal<>(this, EndermanEntity.class, true));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal<>(this, WitchEntity.class, true));

        // Attaque aussi les nains si tu as ces entités
        // this.targetSelector.addGoal(11, new NearestAttackableTargetGoal<>(this, DwarfWarriorEntity.class, true));
        // this.targetSelector.addGoal(12, new NearestAttackableTargetGoal<>(this, DwarfSentinelEntity.class, true));
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 5 + this.world.rand.nextInt(5);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.ENTITY_ZOMBIE_VILLAGER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ZOMBIE_VILLAGER_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState block) {
        this.playSound(SoundEvents.ENTITY_ZOMBIE_STEP, 0.15F, 1.2F);
    }

    @Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return new ResourceLocation("minecraft", "entities/zombie");
    }
}