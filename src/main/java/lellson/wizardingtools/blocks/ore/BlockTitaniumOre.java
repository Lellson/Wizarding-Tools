package lellson.wizardingtools.blocks.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTitaniumOre extends Block {

	public BlockTitaniumOre(Material material) {
		super(material);
		this.setResistance(5);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
	}

}
