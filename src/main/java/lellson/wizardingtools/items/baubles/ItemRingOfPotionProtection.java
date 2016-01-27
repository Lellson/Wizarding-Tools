package lellson.wizardingtools.items.baubles;

import java.util.List;

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
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ItemRingOfPotionProtection extends Item implements IBauble {
	
	public ItemRingOfPotionProtection() {
		this.setMaxStackSize(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}
	
	

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		if (player.isPotionActive(Potion.moveSlowdown)) {
			player.removePotionEffect(Potion.moveSlowdown.id);
		}
		
		if (player.isPotionActive(Potion.wither)) {
			player.removePotionEffect(Potion.wither.id);
		}
		
		if (player.isPotionActive(Potion.weakness)) {
			player.removePotionEffect(Potion.weakness.id);
		}
		
		if (player.isPotionActive(Potion.poison)) {
			player.removePotionEffect(Potion.poison.id);
		}
		
		if (player.isPotionActive(Potion.hunger)) {
			player.removePotionEffect(Potion.hunger.id);
		}
		
		if (player.isPotionActive(Potion.blindness)) {
			player.removePotionEffect(Potion.blindness.id);
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "portal.travel", 0.1F, 1.3f);
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
		list.add("Immunity to almost all negative potion effects.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}
}
