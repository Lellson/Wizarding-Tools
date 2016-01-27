package lellson.wizardingtools.items.tools;

import java.util.List;

import lellson.wizardingtools.entity.entityLaserProjectile;
import lellson.wizardingtools.entity.entityRailProjectile;
import lellson.wizardingtools.items.WizardingItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemRailGun extends Item {

	public ItemRailGun() {
		this.setMaxDamage(1);
		this.setMaxStackSize(1);
	}
	
	public void onPlayerStoppedUsing(ItemStack item, World world, EntityPlayer player, int i)
    {
        int j = this.getMaxItemUseDuration(item) - i;

        ArrowLooseEvent event = new ArrowLooseEvent(player, item, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return;
        }
        j = event.charge;

        boolean flag = player.capabilities.isCreativeMode;

        if (flag || player.inventory.hasItem(WizardingItems.itemRailProjectile))
        {
            float f = (float)j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if ((double)f < 0.95D)
            {
                return;
            }

            if (f > 1.0F)
            {
                f = 1.0F;
            }

            world.playSoundAtEntity(player, "wt:railgun", 1.0F, 1.0F / (itemRand.nextFloat() * 0.8F + 1.2F) + f * 0.5F);
            
            player.inventory.consumeInventoryItem(WizardingItems.itemRailProjectile);
        	}

            if (!world.isRemote)
            {
            	world.spawnEntityInWorld(new entityRailProjectile(world, player));
            }
    	}

    public ItemStack onEaten(ItemStack item, World world, EntityPlayer player)
    {
        return item;
    }

    public int getMaxItemUseDuration(ItemStack item)
    {
        return 72000;
    }

    public EnumAction getItemUseAction(ItemStack item)
    {
        return EnumAction.bow;
    }

    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        ArrowNockEvent event = new ArrowNockEvent(player, item);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return event.result;
        }

        if (player.capabilities.isCreativeMode || player.inventory.hasItem(WizardingItems.itemRailProjectile))
        {
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
            world.playSoundAtEntity(player, "wt:railgun2", 1.0F, 1.0F / (itemRand.nextFloat() * 0.8F + 1.2F));
        }
        
        return item;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Shoots fast moving, explosive Projectiles.");
		list.add("Consumes Titan Projectiles from your inventory.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}
