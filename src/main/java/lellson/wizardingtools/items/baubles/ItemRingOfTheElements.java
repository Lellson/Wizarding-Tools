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
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ItemRingOfTheElements extends Item implements IBauble {
	
	public ItemRingOfTheElements() {
		this.setMaxStackSize(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}
	
	

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
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
			player.worldObj.playSoundAtEntity(player, "liquid.splash", 0.1F, 1.0f);
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
		list.add("Immunity to lava and fire Damage.");
		list.add("Grants water breathing, if you are in water.");
		list.add("Grants regeneration while burning or being in water.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}
}
