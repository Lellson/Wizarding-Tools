package lellson.wizardingtools.items.baubles;

import java.util.List;

import lellson.wizardingtools.util.WizardingConfig;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemOPRing extends Item implements IBauble {
	
	private int cooldown = 140;

	public ItemOPRing() {
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
		
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 0, true));
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 20, 1, true));
		
		if(cooldown   >=1){
			 cooldown--;
		 }
		 else if(cooldown <= 0){
			 player.heal(1.0F);
			 cooldown = 140;
		 }
		
		if (player.isInWater()) {
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 20, 0, true));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 120, 0, true));
		}
		
		if (player.isBurning()) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 20, 0, true));
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 120, 0, true));
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.levelup", 0.1F, 1.3f);
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
		list.add("Unite the abilities of all wizarding rings together.");
			if (!WizardingConfig.enableOPRing) {
			list.add("Recipe can be enabled in the config file!");	
			}
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
