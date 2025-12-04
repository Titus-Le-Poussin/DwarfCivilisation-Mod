package net.TitusTheDuck.dwarfcivilisation.world.gen;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.Random;

public class EmberFeature extends Feature<OreFeatureConfig> {

    public EmberFeature(Codec<OreFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(ISeedReader reader, ChunkGenerator generator, Random rand,
                            BlockPos pos, OreFeatureConfig config) {


        boolean lavaNearby = false;
        for (int x = -3; x <= 3; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -3; z <= 3; z++) {
                    BlockPos checkPos = pos.add(x, y, z);
                    BlockState state = reader.getBlockState(checkPos);
                    if (state.getBlock() == Blocks.LAVA) {
                        lavaNearby = true;
                        break;
                    }
                }
                if (lavaNearby) break;
            }
            if (lavaNearby) break;
        }


        if (!lavaNearby) {
            return false;
        }


        int placed = 0;
        for (int i = 0; i < config.size; i++) {
            BlockPos placePos = pos.add(
                    rand.nextInt(3) - 1,
                    rand.nextInt(3) - 1,
                    rand.nextInt(3) - 1
            );

            BlockState currentState = reader.getBlockState(placePos);
            if (config.target.test(currentState, rand)) {
                reader.setBlockState(placePos, config.state, 2);
                placed++;
            }
        }

        return placed > 0;
    }
}