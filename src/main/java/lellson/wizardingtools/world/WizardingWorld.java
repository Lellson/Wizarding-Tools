package lellson.wizardingtools.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WizardingWorld {
	public static void mainRegistry(){
		initialiseWorldGen();
	}
	
	public static void initialiseWorldGen(){
		registerWorldGen(new OreGen(), 1);
	}
	
	public static void registerWorldGen(IWorldGenerator worldGen, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGen, weightedProbability);
	}
}
