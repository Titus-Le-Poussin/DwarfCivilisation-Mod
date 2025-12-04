package net.TitusTheDuck.dwarfcivilisation.world.gen;

import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {


    AMETHYST(Lazy.of(ModBlocks.AMETHYST_BLOCK), 8, 3, 10, 32),
    ARDOISE(Lazy.of(ModBlocks.ARDOISE_CUBE), 50, 50, 0, 20),    // 14, 10
    AZURE(Lazy.of(ModBlocks.AZURE_ORE), 6, 2, 5, 40),
    RUBY(Lazy.of(ModBlocks.RUBY_ORE), 4, 1, 4, 32),
    SCHIST(Lazy.of(ModBlocks.SCHIST_BLOCK), 20, 12, 50, 80),
    SILVER(Lazy.of(ModBlocks.SILVER_ORE), 8, 4, 5, 45),
    EMBER(Lazy.of(ModBlocks.EMBER_BLOCK), 3, 2, 1, 30),
    ONYX_ARDOISE(Lazy.of(ModBlocks.ONYX_ARDOISE_ORE), 20, 20, 0, 20), // 4, 3
    SUNSTONE(Lazy.of(ModBlocks.SUNSTONE_BLOCK), 6, 2, 0, 30),
    TOPAZ(Lazy.of(ModBlocks.TOPAZ_ORE), 5, 1, 0, 15);


    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int veinsPerChunk;



    OreType(Lazy<Block> block, int maxVeinSize, int veinsPerChunk, int minHeight, int maxHeight){
    this.block = block;
    this.maxVeinSize = maxVeinSize;
    this.minHeight = minHeight;
    this.maxHeight = maxHeight;
    this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxveinSize() {
        return maxVeinSize;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore: values()){
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }

}
