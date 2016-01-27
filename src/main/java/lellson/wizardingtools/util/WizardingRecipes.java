package lellson.wizardingtools.util;

import sun.security.krb5.Config;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.OreDictionary;
import lellson.wizardingtools.WizardingTools;
import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.items.WizardingItems;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;

public class WizardingRecipes {
	
	public static final void init() {
		
		//Shaped Recipes
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockTitaniumBlock), new Object[]{"TTT","TTT","TTT",'T', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumIngot, 9), new Object[]{"T",'T', WizardingBlocks.blockTitaniumBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockRubyBlock), new Object[]{"RRR","RRR","RRR",'R', WizardingItems.itemRuby});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRuby, 9), new Object[]{"R",'R', WizardingBlocks.blockRubyBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockSapphireBlock), new Object[]{"SSS","SSS","SSS",'S', WizardingItems.itemSapphire});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemSapphire, 9), new Object[]{"S",'S', WizardingBlocks.blockSapphireBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockTopazBlock), new Object[]{"TTT","TTT","TTT",'T', WizardingItems.itemTopaz});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTopaz, 9), new Object[]{"T",'T', WizardingBlocks.blockTopazBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockAmethystBlock), new Object[]{"AAA","AAA","AAA",'A', WizardingItems.itemAmethyst});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemAmethyst, 9), new Object[]{"A",'A', WizardingBlocks.blockAmethystBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockOpalBlock), new Object[]{"OOO","OOO","OOO",'O', WizardingItems.itemOpal});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemOpal, 9), new Object[]{"O",'O', WizardingBlocks.blockOpalBlock});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockMalachiteBlock), new Object[]{"MMM","MMM","MMM",'M', WizardingItems.itemMalachite});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemMalachite, 9), new Object[]{"M",'M', WizardingBlocks.blockMalachiteBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRedTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemRubyDust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBlueTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemSapphireDust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemYellowTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemTopazDust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemPurpleTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemAmethystDust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemOrangeTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemOpalDust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemGreenTitanMixture, WizardingConfig.mixtureDustOutput), new Object[]{" D ","DTD"," D ",'T', WizardingItems.itemTitaniumDust, 'D', WizardingItems.itemMalachiteDust});
		
	if (!WizardingConfig.disableRecipeTitanTools) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanPickaxe), new Object[]{"TTT"," S "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanSword), new Object[]{" T "," T "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanAxe), new Object[]{"TT ","TS "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanAxe), new Object[]{" TT"," ST"," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanShovel), new Object[]{" T "," S "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanHoe), new Object[]{"TT "," S "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanHoe), new Object[]{" TT"," S "," S ",'T', WizardingItems.itemTitaniumIngot, 'S', Items.stick});
	}
	
	if (WizardingConfig.disableRecipeTitanTools) {
		if (!WizardingConfig.disableRecipeEnhancedTitanTools) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanPickaxe), new Object[]{"TTT"," PT","S T",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanSword), new Object[]{" TT","TPT","ST ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanAxe), new Object[]{" T ","TPT","ST ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanShovel), new Object[]{" TT"," PT","S  ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanHoe), new Object[]{"TTT"," P ","S  ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitaniumIngot});
		}
	}
	
	if (!WizardingConfig.disableRecipeTitanTools) {
		if (!WizardingConfig.disableRecipeEnhancedTitanTools) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanPickaxe), new Object[]{"TTT"," PT","S T",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitanPickaxe});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanSword), new Object[]{" TT","TPT","ST ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitanSword});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanAxe), new Object[]{" T ","TPT","ST ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitanAxe});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanShovel), new Object[]{" TT"," PT","S  ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitanShovel});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitanHoe), new Object[]{"TTT"," P ","S  ",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitaniumRod, 'P', WizardingItems.itemTitanHoe});
		}
	}
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumRod, 2), new Object[]{"T","T",'T', WizardingItems.itemTitaniumIngot});
		
	if (!WizardingConfig.disableCrusher) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemCrushingBlade), new Object[]{" T ","TIT"," T ",'T', WizardingItems.itemTitaniumNugget, 'I', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingBlocks.blockTitanCrusher), new Object[]{"TCT","ORO","TOT",'T', WizardingItems.itemTitaniumIngot, 'C', WizardingItems.itemCrushingBlade, 'R', Blocks.redstone_block, 'O', Blocks.obsidian});
	}
		
	if (!WizardingConfig.disableRecipeTitanArmor) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumHelmet), new Object[]{"TTT","T T",'T', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumChestplate), new Object[]{"T T","TTT","TTT",'T', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumLeggings), new Object[]{"TTT","T T","T T",'T', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitaniumBoots), new Object[]{"T T","T T",'T', WizardingItems.itemTitaniumIngot});
	}
	
	if (!WizardingConfig.disableRecipeEnhancedTitanArmor) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitaniumHelmet), new Object[]{"TTT","T T",'T', WizardingItems.itemEnhancedTitanIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitaniumChestplate), new Object[]{"T T","TTT","TTT",'T', WizardingItems.itemEnhancedTitanIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitaniumLeggings), new Object[]{"TTT","T T","T T",'T', WizardingItems.itemEnhancedTitanIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedTitaniumBoots), new Object[]{"T T","T T",'T', WizardingItems.itemEnhancedTitanIngot});
	}
	
	if (!WizardingConfig.easierBaubleRecipes) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanAmulet), new Object[]{" S ","SNS","NTN",'T', WizardingItems.itemEnhancedTitanIngot, 'S', WizardingItems.itemTitanString, 'N', WizardingItems.itemEnhancedTitaniumNugget});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanRing), new Object[]{" T ","T T"," T ",'T', WizardingItems.itemEnhancedTitanIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanBelt), new Object[]{"NTN","T T","NTN",'T', WizardingItems.itemEnhancedTitanIngot, 'N', Items.leather});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanString), new Object[]{"TTT","TST","TTT",'T', WizardingItems.itemEnhancedTitaniumNugget, 'S', Items.string});
	}
	
	if (WizardingConfig.easierBaubleRecipes) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanAmulet), new Object[]{" S ","SNS","NTN",'T', WizardingItems.itemTitaniumIngot, 'S', WizardingItems.itemTitanString, 'N', WizardingItems.itemTitaniumNugget});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanRing), new Object[]{" T ","T T"," T ",'T', WizardingItems.itemTitaniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanBelt), new Object[]{"NTN","T T","NTN",'T', WizardingItems.itemTitaniumIngot, 'N', Items.leather});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemTitanString), new Object[]{"TTT","TST","TTT",'T', WizardingItems.itemTitaniumNugget, 'S', Items.string});
	}
	
	if (!WizardingConfig.disableLifeforce) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLifeforcePendant), new Object[]{"RGY","GAG","OGV",'A', WizardingItems.itemTitanAmulet, 'Y', WizardingItems.itemYellowTitanAlloy, 'R', WizardingItems.itemPurpleTitanAlloy, 'O', WizardingItems.itemOrangeTitanAlloy, 'V', WizardingItems.itemGreenTitanAlloy, 'G', Items.golden_apple});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemEnhancedLifeforcePendant), new Object[]{" G ","CLC"," G ",'L', WizardingItems.itemLifeforcePendant, 'C', WizardingItems.itemCrystalDust, 'G', new ItemStack(Items.golden_apple, 1, 1)});
	}
	
	if (!WizardingConfig.disableLevitaion) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemAmuletOfLevitation), new Object[]{"PDY","EAE","YDP",'A', WizardingItems.itemTitanAmulet, 'Y', WizardingItems.itemYellowTitanAlloy, 'P', WizardingItems.itemPurpleTitanAlloy, 'E', Items.feather, 'D', Items.diamond});
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemAmuletOfLevitation), new ItemStack(WizardingItems.itemAmuletOfLevitation, 1, OreDictionary.WILDCARD_VALUE), Items.feather, Items.feather, Items.feather);
	}
	
	if (!WizardingConfig.disableAntiRings) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfAntiBlindness), new Object[]{" P ","IRI"," P ",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemPurpleTitanAlloy, 'I', Items.golden_carrot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfAntiFreeze), new Object[]{" P ","IRI"," P ",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemBlueTitanAlloy, 'I', Items.sugar});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfAntiWither), new Object[]{" N ","BRB"," D ",'R', WizardingItems.itemTitanRing, 'B', WizardingItems.itemBlueTitanAlloy, 'D', Items.diamond, 'N', Items.nether_star});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfAntiVenom), new Object[]{" P ","IRI"," P ",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemGreenTitanAlloy, 'I', Items.ghast_tear});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfAntiWeakness), new Object[]{" P ","IRI"," P ",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemRedTitanAlloy, 'I', Items.blaze_powder});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingofAntiHunger), new Object[]{" P ","IRI"," P ",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemYellowTitanAlloy, 'I', Items.porkchop});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfPotionProtection), new Object[]{"1S2","3 4","5S6",'1', WizardingItems.itemRingOfAntiBlindness, '2', WizardingItems.itemRingOfAntiFreeze, '3', WizardingItems.itemRingOfAntiVenom, '4', WizardingItems.itemRingOfAntiWeakness, '5', WizardingItems.itemRingOfAntiWither, '6', WizardingItems.itemRingofAntiHunger, 'S', WizardingItems.itemEnhancedTitanIngot});
	}
	
	if (!WizardingConfig.disableElementalRings) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfWaterBreathing), new Object[]{"BMY","LRL","YMB",'R', WizardingItems.itemTitanRing, 'B', WizardingItems.itemBlueTitanAlloy, 'Y', WizardingItems.itemPurpleTitanAlloy, 'M', Items.snowball, 'L', Items.water_bucket});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfHeatResistance), new Object[]{"BMY","LRL","YMB",'R', WizardingItems.itemTitanRing, 'B', WizardingItems.itemRedTitanAlloy, 'Y', WizardingItems.itemOrangeTitanAlloy, 'M', Items.magma_cream, 'L', Items.lava_bucket});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfTheElements), new Object[]{"F","L",'F', WizardingItems.itemRingOfHeatResistance, 'L', WizardingItems.itemRingOfWaterBreathing});
	}
	
	if (!WizardingConfig.disableCavingRings) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfDarkVision), new Object[]{"BGP","GRG","PGB",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemOrangeTitanAlloy, 'B', WizardingItems.itemBlueTitanAlloy, 'G', Items.glowstone_dust});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfDigging), new Object[]{"BGP","GRG","PGB",'R', WizardingItems.itemTitanRing, 'P', WizardingItems.itemYellowTitanAlloy, 'B', WizardingItems.itemRedTitanAlloy, 'G', Items.golden_pickaxe});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfCaving), new Object[]{"P","F",'P', WizardingItems.itemRingOfDarkVision, 'F', WizardingItems.itemRingOfDigging});
	}
	
	if (!WizardingConfig.disableSpeedRings) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfTheWind), new Object[]{"PFR","FAF","RFP",'A', WizardingItems.itemTitanBelt, 'P', WizardingItems.itemPurpleTitanAlloy, 'R', WizardingItems.itemRedTitanAlloy, 'F', Items.feather});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfTheSteelFeet), new Object[]{"PFR","FAF","RFP",'A', WizardingItems.itemTitanBelt, 'P', WizardingItems.itemGreenTitanAlloy, 'R', WizardingItems.itemOrangeTitanAlloy, 'F', Items.golden_boots});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfTheSteelwing), new Object[]{"P","F",'P', WizardingItems.itemBeltOfTheSteelFeet, 'F', WizardingItems.itemBeltOfTheWind});
	}
	
	if (!WizardingConfig.disableWrathBelts) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfWrath), new Object[]{"PFR","FAF","RSP",'A', WizardingItems.itemTitanBelt, 'P', WizardingItems.itemRedTitanAlloy, 'R', WizardingItems.itemYellowTitanAlloy, 'F', Items.blaze_powder, 'S', WizardingItems.itemTitanSword});
	}
	
	if (!WizardingConfig.disableMetalSkinBelts) {
		
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfMetalSkin), new Object[]{"PFR","FAF","RSP",'A', WizardingItems.itemTitanBelt, 'P', WizardingItems.itemGreenTitanAlloy, 'R', WizardingItems.itemOrangeTitanAlloy, 'F', Items.iron_ingot, 'S', WizardingItems.itemTitaniumChestplate});
	}
	
	if (!WizardingConfig.disableAmuletOfReborn) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemAmuletOfReborn), new Object[]{"PFR","FAF","RSP",'A', WizardingItems.itemTitanAmulet, 'P', WizardingItems.itemBlueTitanAlloy, 'R', WizardingItems.itemOrangeTitanAlloy, 'S', Items.golden_apple, 'F', WizardingItems.itemCrystalDust});
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemAmuletOfReborn), new ItemStack(WizardingItems.itemAmuletOfReborn, 1, OreDictionary.WILDCARD_VALUE), Items.golden_apple, WizardingItems.itemCrystalDust);
	}
	
	if (!WizardingConfig.disableBeltOfEnder) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemBeltOfEnder), new Object[]{"PFR","FAF","RSP",'A', WizardingItems.itemTitanBelt, 'P', WizardingItems.itemGreenTitanAlloy, 'R', WizardingItems.itemPurpleTitanAlloy, 'S', Items.ender_pearl, 'F', Items.ender_eye});
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemBeltOfEnder), new ItemStack(WizardingItems.itemBeltOfEnder, 1, OreDictionary.WILDCARD_VALUE), Items.ender_pearl);
	}
	
	if (!WizardingConfig.disableRingOfRegen) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRingOfRegeneration), new Object[]{"PFR","FAF","RSP",'A', WizardingItems.itemTitanRing, 'P', WizardingItems.itemRedTitanAlloy, 'R', WizardingItems.itemYellowTitanAlloy, 'S', Items.diamond, 'F', Items.speckled_melon});
	}
	
	if (!WizardingConfig.disableLightsaber) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberR), new Object[]{"I","I","S",'I', WizardingItems.itemRedTitanAlloy, 'S', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberB), new Object[]{"I","I","S",'I', WizardingItems.itemBlueTitanAlloy, 'S', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberY), new Object[]{"I","I","S",'I', WizardingItems.itemYellowTitanAlloy, 'S', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberP), new Object[]{"I","I","S",'I', WizardingItems.itemPurpleTitanAlloy, 'S', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberO), new Object[]{"I","I","S",'I', WizardingItems.itemOrangeTitanAlloy, 'S', Items.iron_ingot});
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLightSaberG), new Object[]{"I","I","S",'I', WizardingItems.itemGreenTitanAlloy, 'S', Items.iron_ingot});
	}
	
	if (!WizardingConfig.disableLasergun) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemLaserGun), new Object[]{"DG ","RTT","  T",'T', WizardingItems.itemTitaniumIngot, 'G', Blocks.glass, 'R', Blocks.redstone_block, 'D', Items.diamond});
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemLaserGun), new ItemStack(WizardingItems.itemLaserGun, 1, OreDictionary.WILDCARD_VALUE), Items.redstone);
	}
	
	if (!WizardingConfig.disableRailgun) {
		GameRegistry.addShapedRecipe(new ItemStack(WizardingItems.itemRailGun), new Object[]{"TDT","GRT","TDT",'T', WizardingItems.itemTitaniumIngot, 'G', Blocks.glass, 'R', Blocks.redstone_block, 'D', Items.diamond});
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemRailProjectile, 12), WizardingItems.itemTitaniumIngot, WizardingItems.itemTitaniumIngot);
	}
		
		//Shapeless Recipes
	
	if (!WizardingConfig.easierCrystalDust) {
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemMalachiteDust, WizardingItems.itemOpalDust, WizardingItems.itemAmethystDust, WizardingItems.itemTopazDust, WizardingItems.itemSapphireDust, WizardingItems.itemRubyDust);
	} else {
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemMalachiteDust, WizardingItems.itemMalachiteDust, WizardingItems.itemMalachiteDust, WizardingItems.itemMalachiteDust, WizardingItems.itemMalachiteDust, WizardingItems.itemMalachiteDust);
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemOpalDust, WizardingItems.itemOpalDust, WizardingItems.itemOpalDust, WizardingItems.itemOpalDust, WizardingItems.itemOpalDust, WizardingItems.itemOpalDust);
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemAmethystDust, WizardingItems.itemAmethystDust, WizardingItems.itemAmethystDust, WizardingItems.itemAmethystDust, WizardingItems.itemAmethystDust, WizardingItems.itemAmethystDust);
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemTopazDust, WizardingItems.itemTopazDust, WizardingItems.itemTopazDust, WizardingItems.itemTopazDust, WizardingItems.itemTopazDust, WizardingItems.itemTopazDust);
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemSapphireDust, WizardingItems.itemSapphireDust, WizardingItems.itemSapphireDust, WizardingItems.itemSapphireDust, WizardingItems.itemSapphireDust, WizardingItems.itemSapphireDust);
	GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemCrystalDust, WizardingConfig.crystalDustOutput), WizardingItems.itemRubyDust, WizardingItems.itemRubyDust, WizardingItems.itemRubyDust, WizardingItems.itemRubyDust, WizardingItems.itemRubyDust, WizardingItems.itemRubyDust);
	}	
	
	if (WizardingConfig.enableOPRing) {
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemOPRing), WizardingItems.itemRingOfTheElements, WizardingItems.itemRingOfCaving, WizardingItems.itemRingOfPotionProtection, WizardingItems.itemRingOfRegeneration);
	}
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemEnhancedTitanDust), WizardingItems.itemCrystalDust, WizardingItems.itemCrystalDust, WizardingItems.itemCrystalDust, WizardingItems.itemCrystalDust, WizardingItems.itemTitaniumDust);
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemTitaniumNugget, 9), WizardingItems.itemTitaniumIngot);
		GameRegistry.addShapelessRecipe(new ItemStack(WizardingItems.itemEnhancedTitaniumNugget, 9), WizardingItems.itemEnhancedTitanIngot);
		
		//Smelting Recipes
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockTitaniumOre), new ItemStack(WizardingItems.itemTitaniumIngot), 1.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemEnhancedTitanDust), new ItemStack(WizardingItems.itemEnhancedTitanIngot), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemTitaniumDust), new ItemStack(WizardingItems.itemTitaniumIngot), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemRubyDust), new ItemStack(WizardingItems.itemRuby), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemSapphireDust), new ItemStack(WizardingItems.itemSapphire), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemTopazDust), new ItemStack(WizardingItems.itemTopaz), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemAmethystDust), new ItemStack(WizardingItems.itemAmethyst), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemOpalDust), new ItemStack(WizardingItems.itemOpal), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemMalachiteDust), new ItemStack(WizardingItems.itemMalachite), 0.0F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemRedTitanMixture), new ItemStack(WizardingItems.itemRedTitanAlloy), 0.5F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemBlueTitanMixture), new ItemStack(WizardingItems.itemBlueTitanAlloy), 0.5F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemYellowTitanMixture), new ItemStack(WizardingItems.itemYellowTitanAlloy), 0.5F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemPurpleTitanMixture), new ItemStack(WizardingItems.itemPurpleTitanAlloy), 0.5F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemOrangeTitanMixture), new ItemStack(WizardingItems.itemOrangeTitanAlloy), 0.5F);
		GameRegistry.addSmelting(new ItemStack(WizardingItems.itemGreenTitanMixture), new ItemStack(WizardingItems.itemGreenTitanAlloy), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockRubyOre), new ItemStack(WizardingItems.itemRuby), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockSapphireOre), new ItemStack(WizardingItems.itemSapphire), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockTopazOre), new ItemStack(WizardingItems.itemTopaz), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockAmethystOre), new ItemStack(WizardingItems.itemAmethyst), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockOpalOre), new ItemStack(WizardingItems.itemOpal), 0.5F);	
		GameRegistry.addSmelting(new ItemStack(WizardingBlocks.blockMalachiteOre), new ItemStack(WizardingItems.itemMalachite), 0.5F);	
		
	}

}
