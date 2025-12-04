package net.TitusTheDuck.dwarfcivilisation.world.gen;

import com.mojang.serialization.Codec;
import net.TitusTheDuck.dwarfcivilisation.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.Random;

public class OnyxArdoiseFeature extends Feature<OreFeatureConfig> {

    public OnyxArdoiseFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand,
                            BlockPos pos, OreFeatureConfig config) {


        BlockState currentState = reader.getBlockState(pos);
        if (currentState.getBlock() != ModBlocks.ARDOISE_CUBE.get()) {
            return false;
        }


        int ardoiseCount = 0;
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                for (int z = -1; z <= 1; z++) {
                    if (x == 0 && y == 0 && z == 0) continue;

                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState state = reader.getBlockState(checkPos);
                    if (state.getBlock() == ModBlocks.ARDOISE_CUBE.get()) {
                        ardoiseCount++;
                    }
                }
            }
        }


        if (ardoiseCount < 4) {
            return false;
        }


        int placed = 0;
        for (int i = 0; i < config.size; i++) {
            BlockPos placePos = pos.add(
                    rand.nextInt(3) - 1,
                    rand.nextInt(3) - 1,
                    rand.nextInt(3) - 1
            );

            BlockState stateToReplace = reader.getBlockState(placePos);
            if (stateToReplace.getBlock() == ModBlocks.ARDOISE_CUBE.get()) {
                reader.setBlockState(placePos, config.state, 2);
                placed++;
            }
        }

        return placed > 0;
    }
}