package lellson.wizardingtools.items.resources;

import lellson.wizardingtools.blocks.WizardingBlocks;
import lellson.wizardingtools.items.WizardingItems;
import net.minecraft.block.BlockJukebox;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMalachite extends Item {
	
	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int x, int y, int z, int i, float f, float g, float h)
    {
        if (world.getBlock(x, y, z) == WizardingBlocks.blockTitanCrusher && world.getBlockMetadata(x, y, z) == 0)
            {
            	world.playSoundAtEntity(player, "tile.piston.out", 0.3F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            	player.inventory.addItemStackToInventory(new ItemStack(WizardingItems.itemMalachiteDust));
                	--item.stackSize;
                	return true;
            }
        
        else {
		return false;
        }
    }

	public static void dropItemStack(ItemStack item, World world, int x, int y, int z)
	{
		if(!world.isRemote) {
	EntityItem entityitem = new EntityItem(world, x, y, z, item);

	entityitem.posX = x;
	entityitem.posY = y;
	entityitem.posZ = z;
	world.spawnEntityInWorld(entityitem);
		}
		
	}

}
