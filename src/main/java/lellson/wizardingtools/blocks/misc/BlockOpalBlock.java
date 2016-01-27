package lellson.wizardingtools.blocks.misc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockOpalBlock extends Block {

	public BlockOpalBlock(Material material) {
		super(material);
		this.setResistance(10);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
	}

}
