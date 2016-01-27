package lellson.wizardingtools.items.wands;

import java.util.List;

import com.google.common.collect.Multimap;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class ItemWandOfNature extends Item {

	private double field_150934_a = 0.0F;

	public ItemWandOfNature() {
		this.setMaxStackSize(1);
		this.setMaxDamage(128);
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack item, EntityPlayer player, EntityLivingBase entity) {
		
	if (!(item.getItemDamage() >= 124)) {
		if (player.isSneaking()) {
			
		player.addPotionEffect(new PotionEffect(Potion.harm.id, 1, 0));
		entity.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1));
		
		item.damageItem(5, player);
	
		}
	}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Shift-Rightclick: Life Transmission.");
		list.add("Rightclick: Bonemeal.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}

	public boolean onItemUse(ItemStack item, EntityPlayer player, World world, int posX, int posY, int posZ, int side, float pointX, float pointY, float pointZ) {
   
	if (!(item.getItemDamage() >= 128)) {
		if (!player.canPlayerEdit(posX, posY, posZ, side, item))
        {
            return false;
        }
        else
        {
                if (applyBonemeal(item, world, posX, posY, posZ, player))
                {
                    if (!world.isRemote)
                    {
                        world.playAuxSFX(2005, posX, posY, posZ, 0);
                    }
                }
        }
    }
		
        return true;             
    }

    public static boolean func_150919_a(ItemStack item, World world, int x, int y, int z)
    {
        if (world instanceof WorldServer)
            return applyBonemeal(item, world, x, y, z, FakePlayerFactory.getMinecraft((WorldServer)world));
        return false;
    }

    public static boolean applyBonemeal(ItemStack item, World world, int x, int y, int z, EntityPlayer player)
    {
        Block block = world.getBlock(x, y, z);

        BonemealEvent event = new BonemealEvent(player, world, block, x, y, z);
        if (MinecraftForge.EVENT_BUS.post(event))
        {
            return false;
        }

        if (event.getResult() == Result.ALLOW)
        {
            if (!world.isRemote)
            {
            	item.damageItem(1, player);
            }
            return true;
        }

        if (block instanceof IGrowable)
        {
            IGrowable igrowable = (IGrowable)block;

            if (igrowable.func_149851_a(world, x, y, z, world.isRemote))
            {
                if (!world.isRemote)
                {
                    if (igrowable.func_149852_a(world, world.rand, x, y, z))
                    {
                        igrowable.func_149853_b(world, world.rand, x, y, z);
                    }

                    item.damageItem(1, player);
                }

                return true;
            }
        }

        return false;
    }

    @SideOnly(Side.CLIENT)
    public static void func_150918_a(World world, int x, int y, int z, int meta)
    {

        Block block = world.getBlock(x, y, z);

        if (block.getMaterial() != Material.air)
        {
            block.setBlockBoundsBasedOnState(world, x, y, z);

            for (int i1 = 0; i1 < meta; ++i1)
            {
                double d0 = itemRand.nextGaussian() * 0.02D;
                double d1 = itemRand.nextGaussian() * 0.02D;
                double d2 = itemRand.nextGaussian() * 0.02D;
                world.spawnParticle("happyVillager", (double)((float)x + itemRand.nextFloat()), (double)y + (double)itemRand.nextFloat() * block.getBlockBoundsMaxY(), (double)((float)z + itemRand.nextFloat()), d0, d1, d2);
            }
        }
        else
        {
            for (int i1 = 0; i1 < meta; ++i1)
            {
                double d0 = itemRand.nextGaussian() * 0.02D;
                double d1 = itemRand.nextGaussian() * 0.02D;
                double d2 = itemRand.nextGaussian() * 0.02D;
                world.spawnParticle("happyVillager", (double)((float)x + itemRand.nextFloat()), (double)y + (double)itemRand.nextFloat() * 1.0f, (double)((float)z + itemRand.nextFloat()), d0, d1, d2);
            }
        }
    }

}
