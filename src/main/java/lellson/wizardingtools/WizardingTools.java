package lellson.wizardingtools;

import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.blocks.misc.BlockTitaniumBlock;
import lellson.wizardingtools.blocks.ore.BlockTitaniumOre;
import lellson.wizardingtools.entity.entityAxeProjectile;
import lellson.wizardingtools.entity.entityEnderBeltProjectile;
import lellson.wizardingtools.entity.entityLaserProjectile;
import lellson.wizardingtools.entity.entityRailProjectile;
import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.items.resources.ItemAmethyst;
import lellson.wizardingtools.items.resources.ItemMalachite;
import lellson.wizardingtools.items.resources.ItemOpal;
import lellson.wizardingtools.items.resources.ItemRuby;
import lellson.wizardingtools.items.resources.ItemSapphire;
import lellson.wizardingtools.items.resources.ItemTitaniumIngot;
import lellson.wizardingtools.items.resources.ItemTopaz;
import lellson.wizardingtools.util.WizardingCommonProxy;
import lellson.wizardingtools.util.WizardingConfig;
import lellson.wizardingtools.util.WizardingOreDict;
import lellson.wizardingtools.util.WizardingRecipes;
import lellson.wizardingtools.world.OreGenBiomeSpecific;
import lellson.wizardingtools.world.WizardingWorld;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = "wizardingtools", name = "Wizarding Tools", version = "1.0.5")
public class WizardingTools {
	
	@Instance
	public static WizardingTools instance;
	public static Configuration config;
	
	public static boolean baublesInstalled = false;
	
	@SidedProxy(clientSide="lellson.wizardingtools.client.WizardingClientProxy", serverSide="lellson.wizardingtools.util.WizardingCommonProxy")
	public static WizardingCommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		WizardingItems.init();
		WizardingBlocks.init();
		WizardingWorld.mainRegistry();
		GameRegistry.registerWorldGenerator(new OreGenBiomeSpecific(), 0);
		proxy.registerRenderers();
		
		int modEntityID = 0;
		EntityRegistry.registerModEntity(entityAxeProjectile.class, "Axe", ++modEntityID, this, 64, 10, true);
		EntityRegistry.registerModEntity(entityLaserProjectile.class, "Laser", ++modEntityID, this, 64, 10, true);
		
		//Config handling
		config = new Configuration(event.getSuggestedConfigurationFile());
		WizardingConfig.syncConfig();
	}

		@SubscribeEvent
		public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
		WizardingConfig.syncConfig();
		}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		WizardingRecipes.init();
        WizardingOreDict.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		if (baublesInstalled = Loader.isModLoaded("Baubles")) {
			System.out.println("<WizardingTools> Baubles is installed!");
		} else
			System.out.println("<WizardingTools> Baubles is NOT installed! Installing is highly recommended!");
	}
	

	public static CreativeTabs tabWizardingTools = new CreativeTabs("tabWizardingTools") {
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem() {
			return WizardingItems.itemTitaniumIngot;

			}
	};
}
