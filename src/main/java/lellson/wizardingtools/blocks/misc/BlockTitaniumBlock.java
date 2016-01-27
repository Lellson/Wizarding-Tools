package lellson.wizardingtools.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTitaniumBlock extends Block {

	public BlockTitaniumBlock(Material material) {
		super(material);
		this.setResistance(10);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
	}

}
