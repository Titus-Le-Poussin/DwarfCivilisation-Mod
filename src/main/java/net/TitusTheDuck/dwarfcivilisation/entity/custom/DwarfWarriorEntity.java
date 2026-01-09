package net.TitusTheDuck.dwarfcivilisation.entity.custom;

import net.TitusTheDuck.dwarfcivilisation.container.DwarfWarriorContainer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;

public class DwarfWarriorEntity extends VillagerEntity {

    // Système d'inventaire (5 slots : casque, plastron, jambières, bottes, épée)
    private final ItemStackHandler inventory = new ItemStackHandler(5) {
        @Override
        protected void onContentsChanged(int slot) {
            DwarfWarriorEntity.this.updateEquipmentStats();
        }

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            return DwarfWarriorEntity.this.isValidItemForSlot(slot, stack);
        }
    };

    // DataParameters pour synchroniser l'équipement visuellement
    private static final DataParameter<ItemStack> HELMET = EntityDataManager.createKey(DwarfWarriorEntity.class, DataSerializers.ITEMSTACK);
    private static final DataParameter<ItemStack> CHESTPLATE = EntityDataManager.createKey(DwarfWarriorEntity.class, DataSerializers.ITEMSTACK);
    private static final DataParameter<ItemStack> LEGGINGS = EntityDataManager.createKey(DwarfWarriorEntity.class, DataSerializers.ITEMSTACK);
    private static final DataParameter<ItemStack> BOOTS = EntityDataManager.createKey(DwarfWarriorEntity.class, DataSerializers.ITEMSTACK);
    private static final DataParameter<ItemStack> WEAPON = EntityDataManager.createKey(DwarfWarriorEntity.class, DataSerializers.ITEMSTACK);

    // Slots de l'inventaire
    public static final int HELMET_SLOT = 0;
    public static final int CHESTPLATE_SLOT = 1;
    public static final int LEGGINGS_SLOT = 2;
    public static final int BOOTS_SLOT = 3;
    public static final int WEAPON_SLOT = 4;

    public DwarfWarriorEntity(EntityType<? extends VillagerEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 30.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.35D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 8.0D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 32.0D)
                .createMutableAttribute(Attributes.ARMOR, 4.0D);
    }

    @Override
    protected void registerData() {
        super.registerData();
        this.dataManager.register(HELMET, ItemStack.EMPTY);
        this.dataManager.register(CHESTPLATE, ItemStack.EMPTY);
        this.dataManager.register(LEGGINGS, ItemStack.EMPTY);
        this.dataManager.register(BOOTS, ItemStack.EMPTY);
        this.dataManager.register(WEAPON, ItemStack.EMPTY);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 0.8D));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, ZombieEntity.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, SkeletonEntity.class, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, CreeperEntity.class, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, MonsterEntity.class, true));
    }

    // Interaction avec le joueur (clic droit)

    // Vérifie si un item est valide pour un slot spécifique
    private boolean isValidItemForSlot(int slot, ItemStack stack) {
        if (stack.isEmpty()) return true;

        switch (slot) {
            case HELMET_SLOT:
                return stack.getItem() instanceof ArmorItem &&
                        ((ArmorItem) stack.getItem()).getEquipmentSlot() == EquipmentSlotType.HEAD;
            case CHESTPLATE_SLOT:
                return stack.getItem() instanceof ArmorItem &&
                        ((ArmorItem) stack.getItem()).getEquipmentSlot() == EquipmentSlotType.CHEST;
            case LEGGINGS_SLOT:
                return stack.getItem() instanceof ArmorItem &&
                        ((ArmorItem) stack.getItem()).getEquipmentSlot() == EquipmentSlotType.LEGS;
            case BOOTS_SLOT:
                return stack.getItem() instanceof ArmorItem &&
                        ((ArmorItem) stack.getItem()).getEquipmentSlot() == EquipmentSlotType.FEET;
            case WEAPON_SLOT:
                return stack.getItem() instanceof SwordItem;
            default:
                return false;
        }
    }

    // Met à jour les stats en fonction de l'équipement
    private void updateEquipmentStats() {
        if (this.world.isRemote) return;

        // Réinitialise les attributs de base
        double baseHealth = 30.0D;
        double baseArmor = 4.0D;
        double baseDamage = 8.0D;

        // Ajoute les bonus de l'armure
        for (int i = 0; i < 4; i++) {
            ItemStack armorStack = inventory.getStackInSlot(i);
            if (!armorStack.isEmpty() && armorStack.getItem() instanceof ArmorItem) {
                ArmorItem armor = (ArmorItem) armorStack.getItem();
                baseArmor += armor.getDamageReduceAmount();
            }
        }

        // Ajoute les bonus de l'épée
        ItemStack weaponStack = inventory.getStackInSlot(WEAPON_SLOT);
        if (!weaponStack.isEmpty() && weaponStack.getItem() instanceof SwordItem) {
            SwordItem sword = (SwordItem) weaponStack.getItem();
            baseDamage += sword.getAttackDamage();
        }

        // Applique les nouveaux attributs
        this.getAttribute(Attributes.ARMOR).setBaseValue(baseArmor);
        this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(baseDamage);

        // Synchronise visuellement l'équipement
        this.dataManager.set(HELMET, inventory.getStackInSlot(HELMET_SLOT));
        this.dataManager.set(CHESTPLATE, inventory.getStackInSlot(CHESTPLATE_SLOT));
        this.dataManager.set(LEGGINGS, inventory.getStackInSlot(LEGGINGS_SLOT));
        this.dataManager.set(BOOTS, inventory.getStackInSlot(BOOTS_SLOT));
        this.dataManager.set(WEAPON, inventory.getStackInSlot(WEAPON_SLOT));
    }

    // Getters pour l'équipement visible
    public ItemStack getHelmet() {
        return this.dataManager.get(HELMET);
    }

    public ItemStack getChestplate() {
        return this.dataManager.get(CHESTPLATE);
    }

    public ItemStack getLeggings() {
        return this.dataManager.get(LEGGINGS);
    }

    public ItemStack getBoots() {
        return this.dataManager.get(BOOTS);
    }

    public ItemStack getWeapon() {
        return this.dataManager.get(WEAPON);
    }

    // Getter pour l'inventaire
    public ItemStackHandler getInventory() {
        return this.inventory;
    }

    // Sauvegarde de l'inventaire
    @Override
    public void writeAdditional(CompoundNBT compound) {
        super.writeAdditional(compound);
        compound.put("Inventory", inventory.serializeNBT());
    }

    @Override
    public void readAdditional(CompoundNBT compound) {
        super.readAdditional(compound);
        if (compound.contains("Inventory")) {
            inventory.deserializeNBT(compound.getCompound("Inventory"));
            updateEquipmentStats();
        }
    }

    // Provider pour ouvrir le container
    public class DwarfWarriorContainerProvider implements net.minecraft.inventory.container.INamedContainerProvider {
        private final DwarfWarriorEntity entity;

        public DwarfWarriorContainerProvider(DwarfWarriorEntity entity) {
            this.entity = entity;
        }

        @Override
        public net.minecraft.util.text.ITextComponent getDisplayName() {
            return new net.minecraft.util.text.TranslationTextComponent("container.dwarfcivilisation.dwarf_warrior");
        }

        @Override
        public net.minecraft.inventory.container.Container createMenu(int windowId, net.minecraft.entity.player.PlayerInventory playerInventory,
                                                                      PlayerEntity player) {
            // On créera cette classe dans la prochaine étape
            return new DwarfWarriorContainer(
                    windowId, playerInventory, entity);
        }
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 5 + this.world.rand.nextInt(5);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_VILLAGER_AMBIENT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_VILLAGER_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.ENTITY_VILLAGER_HURT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState block) {
        this.playSound(SoundEvents.ENTITY_IRON_GOLEM_STEP, 0.15F, 1.0F);
    }

    @Override
    public boolean canBeLeashedTo(PlayerEntity player) {
        return false;
    }
}