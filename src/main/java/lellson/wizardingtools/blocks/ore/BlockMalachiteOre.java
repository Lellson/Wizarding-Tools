package lellson.wizardingtools.blocks.ore;

import java.util.Random;

import lellson.wizardingtools.items.WizardingItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class BlockMalachiteOre extends Block {

	private Item drop;
	private int meta;
	private int least_quantity;
	private int most_quantity;

	public BlockMalachiteOre(Material material) {
		super(material);
		this.setResistance(5);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		}
	
		public Item getItemDropped(int damage, Random random, int fortune)
	    {
	        return WizardingItems.itemMalachite;
	    }
		
		public int getExpDrop(IBlockAccess block, int meta, int fortune)
		{
		return 5;
		}

	    public int quantityDropped(Random random)
	    {
	        return 1;
	    }

	    public int quantityDroppedWithBonus(int fortune, Random random)
	    {
	        if (fortune > 0)
	        {
	            int i = random.nextInt(fortune + 2) - 1;

	            if (i < 0)
	            {
	                i = 0;
	            }

	            return quantityDropped(random) * (i + 1);
	        }
	        else
	        {
	            return quantityDropped(random);
	        }
	    }
	    
	}
