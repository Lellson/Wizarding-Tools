package lellson.wizardingtools.util;

import lellson.wizardingtools.WizardingTools;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.common.config.Configuration;

public class WizardingConfig {
	
	//1
	public static boolean easierBaubleRecipes;
	public static boolean disableRecipeTitanTools;
	public static boolean disableRecipeEnhancedTitanTools;
	public static boolean disableRecipeTitanArmor;
	public static boolean disableRecipeEnhancedTitanArmor;
	public static boolean disableLifeforce;
	public static boolean disableLevitaion;
	public static boolean disableAntiRings;
	public static boolean disableElementalRings;
	public static boolean disableCavingRings;
	public static boolean disableSpeedRings;
	public static boolean disableWrathBelts;
	public static boolean disableMetalSkinBelts;
	public static boolean disableAmuletOfReborn;
	public static boolean disableBeltOfEnder;
	public static boolean disableRingOfRegen;
	public static boolean disableCrusher;
	public static boolean disableLightsaber;
	public static boolean disableLasergun;
	public static boolean disableRailgun;
	public static boolean enableOPRing;
	
	public static int crystalDustOutput;
	public static boolean easierCrystalDust;
	public static int mixtureDustOutput;
	
	public static int gemSpawnHeight;
	public static int gemSpawnChance;
	public static int gemVeinSize;
	
	public static int titanSpawnHeight;
	public static int titanSpawnChance;
	public static int titanVeinSize;
	
	public static boolean gemsAll;
	
	public static byte axeDamage;
	public static byte laserDamage;
	public static int railExplosion;
	public static boolean railExplosionTiles;
	
	public static final boolean BOOLEAN_DEFAULT_F = false;
	public static final boolean BOOLEAN_DEFAULT_T = true;
	
	public static final int CRYSTAL_OUTPUT_DEFAULT = 3;
	public static final int MIXTURE_OUTPUT_DEFAULT = 1;
	
	public static final int GEM_SPAWN_HEIGTH_DEFAULT = 32;
	public static final int GEM_SPAWN_CHANCE_DEFAULT = 20;
	public static final int GEM_VEIN_SIZE_DEFAULT = 3;
	public static final int TITAN_SPAWN_HEIGTH_DEFAULT = 16;
	public static final int TITAN_SPAWN_CHANCE_DEFAULT = 2;
	public static final int TITAN_VEIN_SIZE_DEFAULT = 7;
	
	public static final byte LASERGUN_DEFAULT = 4;
	public static final byte AXE_DEFAULT = 10;
	public static final int RAIL_EXPLOSION_DEFAULT = 4;
	
	//2
	public static final String DISABLERECIPE_easierBaubleRecipes = "Titan Belts, Amulets, Rings and Strings require normal Titanium ingots";
	public static final String DISABLERECIPE_TitanTools = "Disable Recipes for Titan Sword and Titan Tools";
	public static final String DISABLERECIPE_EnhancedTitanTools = "Disable Recipes for Enhanced Titan Sword and Enhanced Titan Tools";
	public static final String DISABLERECIPE_TitanArmor = "Disable Recipes for Titan Armor";
	public static final String DISABLERECIPE_EnhancedTitanArmor = "Disable Recipes for Enhanced Titan Armor";
	public static final String DISABLERECIPE_disableLifeforce = "Disable Recipes for Lifeforce Pendant and Enhanced Lifeforce Pendant";
	public static final String DISABLERECIPE_disableLevitaion = "Disable Recipe for the Levitation Amulet";
	public static final String DISABLERECIPE_disableAntiRings = "Disable Recipes for all Anti Rings";
	public static final String DISABLERECIPE_disableElementalRings = "Disable Recipes for Heat and Water Resistance Rings";
	public static final String DISABLERECIPE_disableCavingRings = "Disable Recipes for Dark Vision and Digging Rings";
	public static final String DISABLERECIPE_disableSpeedRings = "Disable Recipes for Mobility and Speed Belts";
	public static final String DISABLERECIPE_disableWrathBelts = "Disable Recipe for the Wrath Belt";
	public static final String DISABLERECIPE_disableMetalSkinBelts = "Disable Recipe for the Metal Skin Belt";
	public static final String DISABLERECIPE_disableAmuletOfReborn = "Disable Recipe for the Amulet of Reborn";
	public static final String DISABLERECIPE_disableBeltOfEnder = "Disable Recipe for the Enderman's Sash";
	public static final String DISABLERECIPE_disableRingOfRegen = "Disable Recipe for the Ring Of Regeneration";
	public static final String DISABLERECIPE_crusher = "Disable Recipe for the Titan Crusher";
	public static final String DISABLERECIPE_ligthsaber = "Disable Recipe for the Lightsaber";
	public static final String DISABLERECIPE_lasergun = "Disable Recipe for the Laser Gun";
	public static final String DISABLERECIPE_railgun = "Disable Recipe for the Rail Gun";
	public static final String ENABLERECIPE_OPRing = "Should the Ring That Rules Them All be craftable? (Default: false)";
	public static final String DISABLERECIPE_easierCrystalDust = "Use 6 Gems of the same type instead of all 6 different Gems for the Crystal Powder Recipe";
	
	public static final String CRYSTAL_OUTPUT ="Amount of the output for the Crystal Powder recipe. (Default: 3)";
	public static final String MIXTURE_OUTPUT ="Amount of the output for the Gem Mixture Recipes. (Default: 1)";
	
	public static final String GEM_SpawnHeight ="Max Spawn Heigth for all Gem Ores. (Default: 32)";
	public static final String GEM_SpawnChance ="Spawn Chance for all Gem Ores. (Default: 20)";
	public static final String GEM_VeinSize ="Vein Size for all Gem Ores. (Default: 3)";
	
	public static final String TITAN_SpawnHeight ="Max Spawn Heigth for Titanium Ore. (Default: 16)";
	public static final String TITAN_SpawnChance ="Spawn Chance for Titanium Ore. (Default: 2)";
	public static final String TITAN_VeinSize ="Vein Size for Titanium Ore. (Default: 7)";
	
	public static final String GEM_All ="Should Gem Ores spawn in any Biome?. (Default: false)";
	
	public static final String DAMAGE_Axe ="How much damage does the Enhanced Axe Projectile? (Default: 10)";
	public static final String DAMAGE_Laser ="How much damage does the Laser Gun Projectile? (Default: 4)";
	public static final String RAILGUN_Explosion ="How big is the Railgun Explosion radius? (Default: 4, higher number = bigger explosion)";
	public static final String RAILGUN_ExplosionTiles ="Should the Railgun explosion destroy blocks? (Default: false)";
	
	public static void syncConfig(){
		
		FMLCommonHandler.instance().bus().register(WizardingTools.instance);
		
		final String RECIPES = WizardingTools.config.CATEGORY_GENERAL + WizardingTools.config.CATEGORY_SPLITTER + "Change/Disable Recipes";
		WizardingTools.config.addCustomCategoryComment(RECIPES, "Set to true, to disable the Recipes / change the Recipes");
		
		final String WORLDGEN = WizardingTools.config.CATEGORY_GENERAL + WizardingTools.config.CATEGORY_SPLITTER + "World Gen";
		WizardingTools.config.addCustomCategoryComment(WORLDGEN, "Edit World Generation");
		
		final String GENERAL = WizardingTools.config.CATEGORY_GENERAL + WizardingTools.config.CATEGORY_SPLITTER + "General";
		WizardingTools.config.addCustomCategoryComment(GENERAL, "General Settings");
		
		//3
		easierBaubleRecipes = WizardingTools.config.get(RECIPES, DISABLERECIPE_easierBaubleRecipes, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRecipeTitanTools = WizardingTools.config.get(RECIPES, DISABLERECIPE_TitanTools, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRecipeEnhancedTitanTools = WizardingTools.config.get(RECIPES, DISABLERECIPE_EnhancedTitanTools, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRecipeTitanArmor = WizardingTools.config.get(RECIPES, DISABLERECIPE_TitanArmor, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRecipeEnhancedTitanArmor = WizardingTools.config.get(RECIPES, DISABLERECIPE_EnhancedTitanArmor, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableLifeforce = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableLifeforce, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableLevitaion = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableLevitaion, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableAntiRings = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableAntiRings, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableElementalRings = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableElementalRings, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableCavingRings = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableCavingRings, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableSpeedRings = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableSpeedRings, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableWrathBelts = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableWrathBelts, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableMetalSkinBelts = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableMetalSkinBelts, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableAmuletOfReborn = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableAmuletOfReborn, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableBeltOfEnder = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableBeltOfEnder, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRingOfRegen = WizardingTools.config.get(RECIPES, DISABLERECIPE_disableRingOfRegen, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableLightsaber = WizardingTools.config.get(RECIPES, DISABLERECIPE_ligthsaber, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableLightsaber = WizardingTools.config.get(RECIPES, DISABLERECIPE_lasergun, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		disableRailgun = WizardingTools.config.get(RECIPES, DISABLERECIPE_railgun, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		easierCrystalDust = WizardingTools.config.get(RECIPES, DISABLERECIPE_easierCrystalDust, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		enableOPRing = WizardingTools.config.get(RECIPES, ENABLERECIPE_OPRing, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		
		crystalDustOutput = WizardingTools.config.get(RECIPES, CRYSTAL_OUTPUT, CRYSTAL_OUTPUT_DEFAULT).getInt(CRYSTAL_OUTPUT_DEFAULT);
		mixtureDustOutput = WizardingTools.config.get(RECIPES, MIXTURE_OUTPUT, MIXTURE_OUTPUT_DEFAULT).getInt(MIXTURE_OUTPUT_DEFAULT);
		
		gemSpawnHeight = WizardingTools.config.get(WORLDGEN, GEM_SpawnHeight, GEM_SPAWN_HEIGTH_DEFAULT).getInt(GEM_SPAWN_HEIGTH_DEFAULT);
		gemSpawnChance = WizardingTools.config.get(WORLDGEN, GEM_SpawnChance, GEM_SPAWN_CHANCE_DEFAULT).getInt(GEM_SPAWN_CHANCE_DEFAULT);
		gemVeinSize = WizardingTools.config.get(WORLDGEN, GEM_VeinSize, GEM_VEIN_SIZE_DEFAULT).getInt(GEM_VEIN_SIZE_DEFAULT);
		
		titanSpawnHeight = WizardingTools.config.get(WORLDGEN, TITAN_SpawnHeight, TITAN_SPAWN_HEIGTH_DEFAULT).getInt(TITAN_SPAWN_HEIGTH_DEFAULT);
		titanSpawnChance = WizardingTools.config.get(WORLDGEN, TITAN_SpawnChance, TITAN_SPAWN_CHANCE_DEFAULT).getInt(TITAN_SPAWN_CHANCE_DEFAULT);
		titanVeinSize = WizardingTools.config.get(WORLDGEN, TITAN_VeinSize, TITAN_VEIN_SIZE_DEFAULT).getInt(TITAN_VEIN_SIZE_DEFAULT);
		
		gemsAll = WizardingTools.config.get(WORLDGEN, GEM_All, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		
		axeDamage = (byte) WizardingTools.config.get(GENERAL, DAMAGE_Axe, AXE_DEFAULT).getInt(AXE_DEFAULT);
		laserDamage = (byte) WizardingTools.config.get(GENERAL, DAMAGE_Laser, LASERGUN_DEFAULT).getInt(LASERGUN_DEFAULT);
		railExplosion = WizardingTools.config.get(GENERAL, RAILGUN_Explosion, RAIL_EXPLOSION_DEFAULT).getInt(RAIL_EXPLOSION_DEFAULT);
		railExplosionTiles = WizardingTools.config.get(GENERAL, RAILGUN_ExplosionTiles, BOOLEAN_DEFAULT_F).getBoolean(BOOLEAN_DEFAULT_F);
		
		if(WizardingTools.config.hasChanged()){
			WizardingTools.config.save();
		}
	}
}