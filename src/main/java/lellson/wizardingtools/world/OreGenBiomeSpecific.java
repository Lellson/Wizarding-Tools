package lellson.wizardingtools.world;

import java.util.Random;

import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGenBiomeSpecific implements IWorldGenerator
{
  public OreGenBiomeSpecific() {
  }
  
  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    if (world.provider.dimensionId == 0)
    {
	  this.generateSurface(world, random, chunkX << 4, chunkZ << 4);
    }
  }
  public void generateSurface(World par1World, Random par2Random, int chunkX, int chunkZ)
  {
    String opalOreDesert = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((opalOreDesert.startsWith("Desert")) || (opalOreDesert.startsWith("Savanna")) || (opalOreDesert.startsWith("Mesa")) || (opalOreDesert.startsWith("Badlands")) || (opalOreDesert.startsWith("Canyon")) || (opalOreDesert.startsWith("Dunes")) || (opalOreDesert.startsWith("Outback")) || (opalOreDesert.startsWith("Scrubland")) || (opalOreDesert.startsWith("Steppe")) || (opalOreDesert.startsWith("Waste")) || (opalOreDesert.startsWith("Xeric")) || (opalOreDesert.startsWith("Sahel")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockOpalOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String amethystOreSwamp = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((amethystOreSwamp.startsWith("Swamp")) || (amethystOreSwamp.startsWith("Roofed")) || (amethystOreSwamp.startsWith("Bog")) || (amethystOreSwamp.startsWith("Brushland")) || (amethystOreSwamp.startsWith("Bayou")) || (amethystOreSwamp.startsWith("Dead")) || (amethystOreSwamp.startsWith("Fen")) || (amethystOreSwamp.startsWith("Lush")) || (amethystOreSwamp.startsWith("Quagmire")) || (amethystOreSwamp.startsWith("Sludgepit")) || (amethystOreSwamp.startsWith("Wetland")) || (amethystOreSwamp.startsWith("Moor")) || (amethystOreSwamp.startsWith("Ominous")) || (amethystOreSwamp.startsWith("Silk")) || (amethystOreSwamp.startsWith("Timber")) || (amethystOreSwamp.startsWith("Taint")) || (amethystOreSwamp.startsWith("Mushroom")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockAmethystOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String sapphireOreOcean = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((sapphireOreOcean.startsWith("Ocean")) || (sapphireOreOcean.startsWith("Beach")) || (sapphireOreOcean.startsWith("Deep")) || (sapphireOreOcean.startsWith("Crag")) || (sapphireOreOcean.startsWith("Hot")) || (sapphireOreOcean.startsWith("Mangrove")) || (sapphireOreOcean.startsWith("Marsh")) || (sapphireOreOcean.startsWith("Sacred")) || (sapphireOreOcean.startsWith("Kelp")) || (sapphireOreOcean.startsWith("Coral")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockSapphireOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String malachiteOreJungle = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((malachiteOreJungle.startsWith("Jungle")) || (malachiteOreJungle.startsWith("Bamboo")) || (malachiteOreJungle.startsWith("Oasis")) || (malachiteOreJungle.startsWith("Rain")) || (malachiteOreJungle.startsWith("Tropic")) || (malachiteOreJungle.startsWith("Eucalyptus")) || (malachiteOreJungle.startsWith("Fungi")) || (malachiteOreJungle.startsWith("Redwood")) || (malachiteOreJungle.startsWith("Temperate")) || (malachiteOreJungle.startsWith("Mini Jungle")) || (malachiteOreJungle.startsWith("Extreme Jungle")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockMalachiteOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String rubyOrePlains = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((rubyOrePlains.startsWith("Plains")) || (rubyOrePlains.startsWith("Sunflower")) || (rubyOrePlains.startsWith("Forest")) || (rubyOrePlains.startsWith("Birch")) || (rubyOrePlains.startsWith("Chaparral")) || (rubyOrePlains.startsWith("Birch")) || (rubyOrePlains.startsWith("Field")) || (rubyOrePlains.startsWith("Garden")) || (rubyOrePlains.startsWith("Grass")) || (rubyOrePlains.startsWith("Heathland")) || (rubyOrePlains.startsWith("Orchard")) || (rubyOrePlains.startsWith("Meadow")) || (rubyOrePlains.startsWith("Pasture")) || (rubyOrePlains.startsWith("Prairie")) || (rubyOrePlains.startsWith("Shrubland")) || (rubyOrePlains.startsWith("Forested")) || (rubyOrePlains.startsWith("Thick")) || (rubyOrePlains.startsWith("Thinned")) || (rubyOrePlains.startsWith("Maple")) || (rubyOrePlains.startsWith("Lavender")) || (rubyOrePlains.startsWith("Seasonal")) || (rubyOrePlains.startsWith("Cherry")) || (rubyOrePlains.startsWith("Autumn")) || (rubyOrePlains.startsWith("Overgrown")) || (rubyOrePlains.startsWith("Origin")) || (rubyOrePlains.startsWith("Woodland")) || (rubyOrePlains.startsWith("Flower")) || (rubyOrePlains.startsWith("Green")) || (rubyOrePlains.startsWith("Everglades")) || (rubyOrePlains.startsWith("Lowlands")) || (rubyOrePlains.startsWith("Witch")) || (rubyOrePlains.startsWith("Magical")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	int randomPosX = chunkX + par2Random.nextInt(16);
   	 	int randomPosY = par2Random.nextInt(height);
   	 	int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockRubyOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String topazOreCold = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (!WizardingConfig.gemsAll)
    if ((topazOreCold.startsWith("Taiga")) || (topazOreCold.startsWith("Cold")) || (topazOreCold.startsWith("Mega")) || (topazOreCold.startsWith("Ice")) || (topazOreCold.startsWith("Alp")) || (topazOreCold.startsWith("Arctic")) || (topazOreCold.startsWith("Frost")) || (topazOreCold.startsWith("Glazier")) || (topazOreCold.startsWith("Icy")) || (topazOreCold.startsWith("Polar")) || (topazOreCold.startsWith("Snowy")) || (topazOreCold.startsWith("Tundra")) || (topazOreCold.startsWith("Pine")) || (topazOreCold.startsWith("Snowy")) || (topazOreCold.startsWith("Mountain Taiga")) || (topazOreCold.startsWith("Glacier")) || (topazOreCold.startsWith("Coniferous")))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockTopazOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String TopazOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (TopazOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockTopazOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String OpalOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (OpalOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockOpalOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String RubyOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (RubyOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockRubyOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String SapphireOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (SapphireOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockSapphireOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String AmethystOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (AmethystOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
    	  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockAmethystOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    String MalachiteOreAll = par1World.getBiomeGenForCoords(chunkX + 8, chunkZ + 8).biomeName;
    if (WizardingConfig.gemsAll)
    if (MalachiteOreAll.startsWith(""))
    {
      int rarity = WizardingConfig.gemSpawnChance;
      int veinSize = WizardingConfig.gemVeinSize;
      int height = WizardingConfig.gemSpawnHeight;
      for (int i = 0; i < rarity; ++i)
      {
    	  int randomPosX = chunkX + par2Random.nextInt(16);
    	  int randomPosY = par2Random.nextInt(height);
   		  int randomPosZ = chunkZ + par2Random.nextInt(16);
   	 (new WorldGenMinable(WizardingBlocks.blockMalachiteOre, veinSize)).generate(par1World, par2Random, randomPosX, randomPosY, randomPosZ);
      }
    }
    
    
  }
}
