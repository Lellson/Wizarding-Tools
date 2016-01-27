package lellson.wizardingtools.items.tools;

import java.util.List;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lellson.wizardingtools.entity.entityLaserProjectile;
import lellson.wizardingtools.util.WizardingConfig;
import net.java.games.input.Keyboard;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemLaserGun extends Item {
	
	public ItemLaserGun() {
		this.setMaxDamage(8);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
	if (item.getItemDamage() == 8) {
		if (!player.inventory.hasItemStack(new ItemStack(Items.redstone))) {
			player.addChatMessage(new ChatComponentText("Player has no redstone"));
		}
		if (player.inventory.hasItemStack(new ItemStack(Items.redstone))) {
			player.inventory.consumeInventoryItem(Items.redstone);
			item.setItemDamage(0);
			}
		}
	if (!(item.getItemDamage() == 8)) {	
		item.damageItem(1, player);
		
        world.playSoundAtEntity(player, "wt:lasergun", 0.5F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new entityLaserProjectile(world, player));
        }

    }
	return item;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Shoots laser projectiles.");
		list.add("Consumes redstone from your inventory to reload itself.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}
