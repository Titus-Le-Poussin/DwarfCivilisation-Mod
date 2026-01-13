package net.TitusTheDuck.dwarfcivilisation.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
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

public class DwarfHerboristEntity extends VillagerEntity {

    // Inventaire de 12 slots pour les fleurs
    private final ItemStackHandler inventory = new ItemStackHandler(12) {
        @Override
        protected void onContentsChanged(int slot) {
            DwarfHerboristEntity.this.syncInventory();
        }
    };

    private BlockPos targetFlower = null;

    public DwarfHerboristEntity(EntityType<? extends VillagerEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 20.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.30D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(1, new SwimGoal(this));
        this.goalSelector.addGoal(2, new CollectFlowerGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
    }

    public ItemStackHandler getInventory() {
        return this.inventory;
    }

    private void syncInventory() {
        // Synchronisation si nécessaire
    }

    // Ajoute une fleur dans l'inventaire
    public boolean addFlower(ItemStack flower) {
        for (int i = 0; i < inventory.getSlots(); i++) {
            ItemStack slotStack = inventory.getStackInSlot(i);
            if (slotStack.isEmpty()) {
                inventory.setStackInSlot(i, flower.copy());
                return true;
            } else if (slotStack.isItemEqual(flower) && slotStack.getCount() < slotStack.getMaxStackSize()) {
                slotStack.grow(1);
                return true;
            }
        }
        return false; // Inventaire plein
    }

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
        }
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 3 + this.world.rand.nextInt(3);
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
    public boolean canBeLeashedTo(PlayerEntity player) {
        return false;
    }

    // Provider pour l'interface
    public class DwarfHerboristContainerProvider implements net.minecraft.inventory.container.INamedContainerProvider {
        private final DwarfHerboristEntity entity;

        public DwarfHerboristContainerProvider(DwarfHerboristEntity entity) {
            this.entity = entity;
        }

        @Override
        public net.minecraft.util.text.ITextComponent getDisplayName() {
            return new net.minecraft.util.text.TranslationTextComponent("container.dwarfcivilisation.dwarf_herborist");
        }

        @Override
        public net.minecraft.inventory.container.Container createMenu(int windowId,
                                                                      net.minecraft.entity.player.PlayerInventory playerInventory,
                                                                      PlayerEntity player) {
            return new net.TitusTheDuck.dwarfcivilisation.container.DwarfHerboristContainer(
                    windowId, playerInventory, entity);
        }
    }

    // Goal pour collecter les fleurs
    static class CollectFlowerGoal extends Goal {
        private final DwarfHerboristEntity herborist;
        private final double speed;
        private int searchCooldown = 0;

        public CollectFlowerGoal(DwarfHerboristEntity herborist, double speed) {
            this.herborist = herborist;
            this.speed = speed;
        }

        @Override
        public boolean shouldExecute() {
            if (searchCooldown > 0) {
                searchCooldown--;
                return false;
            }

            return findNearestFlower();
        }

        @Override
        public boolean shouldContinueExecuting() {
            return herborist.targetFlower != null &&
                    herborist.world.getBlockState(herborist.targetFlower).getBlock() instanceof FlowerBlock;
        }

        @Override
        public void resetTask() {
            herborist.targetFlower = null;
            searchCooldown = 100; // Attend 5 secondes avant de chercher une nouvelle fleur
        }

        @Override
        public void tick() {
            if (herborist.targetFlower == null) return;

            double distance = herborist.getDistanceSq(
                    herborist.targetFlower.getX() + 0.5D,
                    herborist.targetFlower.getY(),
                    herborist.targetFlower.getZ() + 0.5D
            );

            if (distance > 2.0D) {
                // Se déplace vers la fleur
                herborist.getNavigator().tryMoveToXYZ(
                        herborist.targetFlower.getX() + 0.5D,
                        herborist.targetFlower.getY(),
                        herborist.targetFlower.getZ() + 0.5D,
                        speed
                );
            } else {
                // Ramasse la fleur
                BlockState state = herborist.world.getBlockState(herborist.targetFlower);
                ItemStack flower = new ItemStack(state.getBlock().asItem());

                if (herborist.addFlower(flower)) {
                    herborist.world.destroyBlock(herborist.targetFlower, false);
                    herborist.playSound(SoundEvents.BLOCK_GRASS_BREAK, 0.5F, 1.0F);
                }

                herborist.targetFlower = null;
            }
        }

        private boolean findNearestFlower() {
            BlockPos pos = herborist.getPosition();
            BlockPos.Mutable mutablePos = new BlockPos.Mutable();

            // Cherche dans un rayon de 8 blocs
            for (int x = -8; x <= 8; x++) {
                for (int y = -3; y <= 3; y++) {
                    for (int z = -8; z <= 8; z++) {
                        mutablePos.setPos(pos.getX() + x, pos.getY() + y, pos.getZ() + z);
                        BlockState state = herborist.world.getBlockState(mutablePos);

                        if (state.getBlock() instanceof FlowerBlock) {
                            herborist.targetFlower = mutablePos.toImmutable();
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }
}