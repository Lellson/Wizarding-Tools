package lellson.wizardingtools.util;

import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.items.WizardingItems;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.event.FMLInitializationEvent;

public class WizardingOreDict {
	
	
	public static void init() {
		
		OreDictionary.registerOre("ingotTitanium", WizardingItems.itemTitaniumIngot);
		
		OreDictionary.registerOre("gemRuby", WizardingItems.itemRuby);
		OreDictionary.registerOre("gemSapphire", WizardingItems.itemSapphire);
		OreDictionary.registerOre("gemTopaz", WizardingItems.itemTopaz);
		OreDictionary.registerOre("gemAmethyst", WizardingItems.itemAmethyst);
		OreDictionary.registerOre("gemOpal", WizardingItems.itemOpal);
		OreDictionary.registerOre("gemMalachite", WizardingItems.itemMalachite);
		
		OreDictionary.registerOre("dustRuby", WizardingItems.itemRubyDust);
		OreDictionary.registerOre("dustSapphire", WizardingItems.itemSapphireDust);
		OreDictionary.registerOre("dustTopaz", WizardingItems.itemTopazDust);
		OreDictionary.registerOre("dustAmethyst", WizardingItems.itemAmethystDust);
		OreDictionary.registerOre("dustOpal", WizardingItems.itemOpalDust);
		OreDictionary.registerOre("dustMalachite", WizardingItems.itemMalachiteDust);
		OreDictionary.registerOre("dustTitanium", WizardingItems.itemTitaniumDust);
		
		OreDictionary.registerOre("oreRuby", WizardingBlocks.blockRubyOre);
		OreDictionary.registerOre("oreSapphire", WizardingBlocks.blockSapphireOre);
		OreDictionary.registerOre("oreTopaz", WizardingBlocks.blockTopazOre);
		OreDictionary.registerOre("oreAmethyst", WizardingBlocks.blockAmethystOre);
		OreDictionary.registerOre("oreOpal", WizardingBlocks.blockOpalOre);
		OreDictionary.registerOre("oreMalachite", WizardingBlocks.blockMalachiteOre);
		
		OreDictionary.registerOre("blockRuby", WizardingBlocks.blockRubyBlock);
		OreDictionary.registerOre("blockSapphire", WizardingBlocks.blockSapphireBlock);
		OreDictionary.registerOre("blockTopaz", WizardingBlocks.blockTopazBlock);
		OreDictionary.registerOre("blockAmethyst", WizardingBlocks.blockAmethystBlock);
		OreDictionary.registerOre("blockOpal", WizardingBlocks.blockOpalBlock);
		OreDictionary.registerOre("blockMalachite", WizardingBlocks.blockMalachiteBlock);
		OreDictionary.registerOre("blockTitanium", WizardingBlocks.blockTitaniumBlock);
	}
}