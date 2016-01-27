package lellson.wizardingtools.blocks;

import lellson.wizardingtools.WizardingTools;
import lellson.wizardingtools.blocks.misc.BlockAmethystBlock;
import lellson.wizardingtools.blocks.misc.BlockMalachiteBlock;
import lellson.wizardingtools.blocks.misc.BlockOpalBlock;
import lellson.wizardingtools.blocks.misc.BlockRubyBlock;
import lellson.wizardingtools.blocks.misc.BlockSapphireBlock;
import lellson.wizardingtools.blocks.misc.BlockTitanCrusher;
import lellson.wizardingtools.blocks.misc.BlockTitaniumBlock;
import lellson.wizardingtools.blocks.misc.BlockTopazBlock;
import lellson.wizardingtools.blocks.ore.BlockAmethystOre;
import lellson.wizardingtools.blocks.ore.BlockMalachiteOre;
import lellson.wizardingtools.blocks.ore.BlockOpalOre;
import lellson.wizardingtools.blocks.ore.BlockRubyOre;
import lellson.wizardingtools.blocks.ore.BlockSapphireOre;
import lellson.wizardingtools.blocks.ore.BlockTitaniumOre;
import lellson.wizardingtools.blocks.ore.BlockTopazOre;
import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.items.resources.ItemAmethyst;
import lellson.wizardingtools.items.resources.ItemAmethystDust;
import lellson.wizardingtools.items.resources.ItemMalachite;
import lellson.wizardingtools.items.resources.ItemMalachiteDust;
import lellson.wizardingtools.items.resources.ItemTopaz;
import lellson.wizardingtools.items.resources.ItemTopazDust;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public final class WizardingBlocks {
	
	public static Block blockTitaniumOre;
	public static Block blockRubyOre;
	public static Block blockSapphireOre;
	public static Block blockAmethystOre;
	public static Block blockTopazOre;
	public static Block blockOpalOre;
	public static Block blockMalachiteOre;
	public static Block blockTitaniumBlock;
	public static Block blockRubyBlock;
	public static Block blockSapphireBlock;
	public static Block blockTopazBlock;
	public static Block blockAmethystBlock;
	public static Block blockOpalBlock;
	public static Block blockMalachiteBlock;
	public static Block blockTitanCrusher;
	private static boolean modinstalled = false;
	
	public static final void init() {
		
		blockTitaniumOre = new BlockTitaniumOre(Material.rock).setBlockName("BlockTitaniumOre").setBlockTextureName("wt:blocktitaniumore").setCreativeTab(WizardingTools.tabWizardingTools);
		
	if (modinstalled = Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("gregtech") || Loader.isModLoaded("ProjRed|Exploration")) {
		blockRubyOre = new BlockRubyOre(Material.rock).setBlockName("BlockRubyOreBoP").setBlockTextureName("wt:blockrubyore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockRubyBlock = new BlockRubyBlock(Material.iron).setBlockName("BlockRubyBlockBoP").setBlockTextureName("wt:blockrubyblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockSapphireOre = new BlockSapphireOre(Material.rock).setBlockName("BlockSapphireOreBoP").setBlockTextureName("wt:blocksapphireore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockSapphireBlock = new BlockSapphireBlock(Material.iron).setBlockName("BlockSapphireBlockBoP").setBlockTextureName("wt:blocksapphireblock").setCreativeTab(WizardingTools.tabWizardingTools);
	} 
	if (!(modinstalled = Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("gregtech") || Loader.isModLoaded("ProjRed|Exploration"))) {
		blockRubyOre = new BlockRubyOre(Material.rock).setBlockName("BlockRubyOre").setBlockTextureName("wt:blockrubyore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockRubyBlock = new BlockRubyBlock(Material.iron).setBlockName("BlockRubyBlock").setBlockTextureName("wt:blockrubyblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockSapphireOre = new BlockSapphireOre(Material.rock).setBlockName("BlockSapphireOre").setBlockTextureName("wt:blocksapphireore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockSapphireBlock = new BlockSapphireBlock(Material.iron).setBlockName("BlockSapphireBlock").setBlockTextureName("wt:blocksapphireblock").setCreativeTab(WizardingTools.tabWizardingTools);
	}
	if (modinstalled = Loader.isModLoaded("BiomesOPlenty")) {
		blockAmethystOre = new BlockAmethystOre(Material.rock).setBlockName("BlockAmethystOreBoP").setBlockTextureName("wt:blockamethystore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockTopazOre = new BlockTopazOre(Material.rock).setBlockName("BlockTopazOreBoP").setBlockTextureName("wt:blocktopazore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockMalachiteOre = new BlockMalachiteOre(Material.rock).setBlockName("BlockMalachiteOreBoP").setBlockTextureName("wt:blockmalachiteore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockTopazBlock = new BlockTopazBlock(Material.iron).setBlockName("BlockTopazBlockBoP").setBlockTextureName("wt:blocktopazblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockAmethystBlock = new BlockAmethystBlock(Material.iron).setBlockName("BlockAmethystBlockBoP").setBlockTextureName("wt:blockamethystblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockMalachiteBlock = new BlockMalachiteBlock(Material.iron).setBlockName("BlockMalachiteBlockBoP").setBlockTextureName("wt:blockmalachiteblock").setCreativeTab(WizardingTools.tabWizardingTools);
	} 
	if (!(modinstalled = Loader.isModLoaded("BiomesOPlenty") || Loader.isModLoaded("gregtech") || Loader.isModLoaded("ProjRed|Exploration"))) {
		blockAmethystOre = new BlockAmethystOre(Material.rock).setBlockName("BlockAmethystOre").setBlockTextureName("wt:blockamethystore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockTopazOre = new BlockTopazOre(Material.rock).setBlockName("BlockTopazOre").setBlockTextureName("wt:blocktopazore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockMalachiteOre = new BlockMalachiteOre(Material.rock).setBlockName("BlockMalachiteOre").setBlockTextureName("wt:blockmalachiteore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockTopazBlock = new BlockTopazBlock(Material.iron).setBlockName("BlockTopazBlock").setBlockTextureName("wt:blocktopazblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockAmethystBlock = new BlockAmethystBlock(Material.iron).setBlockName("BlockAmethystBlock").setBlockTextureName("wt:blockamethystblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockMalachiteBlock = new BlockMalachiteBlock(Material.iron).setBlockName("BlockMalachiteBlock").setBlockTextureName("wt:blockmalachiteblock").setCreativeTab(WizardingTools.tabWizardingTools);
	}
	
		blockOpalOre = new BlockOpalOre(Material.rock).setBlockName("BlockOpalOre").setBlockTextureName("wt:blockopalore").setCreativeTab(WizardingTools.tabWizardingTools);
		blockTitaniumBlock = new BlockTitaniumBlock(Material.iron).setBlockName("BlockTitaniumBlock").setBlockTextureName("wt:blocktitaniumblock").setCreativeTab(WizardingTools.tabWizardingTools);
		blockOpalBlock = new BlockOpalBlock(Material.iron).setBlockName("BlockOpalBlock").setBlockTextureName("wt:blockopalblock").setCreativeTab(WizardingTools.tabWizardingTools);
		
		blockTitanCrusher = new BlockTitanCrusher(Material.iron).setBlockName("BlockTitanCrusher").setBlockTextureName("wt:blocktitancrusher").setCreativeTab(WizardingTools.tabWizardingTools);
		
		GameRegistry.registerBlock(blockTitaniumOre, blockTitaniumOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRubyOre, blockRubyOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapphireOre, blockSapphireOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAmethystOre, blockAmethystOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTopazOre, blockTopazOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOpalOre, blockOpalOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMalachiteOre, blockMalachiteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTitaniumBlock, blockTitaniumBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockRubyBlock, blockRubyBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockSapphireBlock, blockSapphireBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockTopazBlock, blockTopazBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockAmethystBlock, blockAmethystBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockOpalBlock, blockOpalBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockMalachiteBlock, blockMalachiteBlock.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(blockTitanCrusher, blockTitanCrusher.getUnlocalizedName().substring(5));
		System.out.println(blockTitanCrusher.getUnlocalizedName().substring(5));
		}
}
