package lellson.wizardingtools.items.baubles;

import java.util.List;

import lellson.wizardingtools.util.WizardingConfig;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;

public class ItemAmuletOfReborn extends Item implements IBauble {
	
	public ItemAmuletOfReborn() {
		this.setMaxStackSize(1);
		this.setMaxDamage(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}
	
	

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
	
		if (player.getHealth() <= 3) {
			if (!itemstack.isItemDamaged()) {
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 40, 5));
			player.worldObj.playSoundAtEntity(player, "portal.portal", 0.2F, 1.0f);
			player.worldObj.spawnParticle("portal", player.posX, player.posY, player.posZ, 0, 0, 0);
			itemstack.damageItem(1, player);
			}
		}

	}
	
	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.orb", 0.1F, 1.0f);
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		
	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Gives you great regeneration, if you are below 1.5 hearts.");
		list.add("Can only be used once. restore with 1 Gold Apple and 1 Crystal Dust.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
			
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
