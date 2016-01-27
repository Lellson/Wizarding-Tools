package lellson.wizardingtools.world;

import java.util.Random;

import com.sun.media.sound.ModelIdentifier;

import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;

public class OreGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId) {
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}

	}
	
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVein, int maxVein, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVein + random.nextInt(maxVein - minVein)), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {

		
	}

	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		
		addOre(WizardingBlocks.blockTitaniumOre, Blocks.stone, random, world, chunkX, chunkZ, 0, WizardingConfig.titanSpawnHeight, 1, WizardingConfig.titanVeinSize, WizardingConfig.titanSpawnChance);
		
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world) {

		
	}

}
