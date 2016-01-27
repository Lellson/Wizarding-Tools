package lellson.wizardingtools.items.baubles;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import baubles.api.BaubleType;
import baubles.api.IBauble;

public class ItemEnhancedLifeforcePendant extends Item implements IBauble {
	
	public ItemEnhancedLifeforcePendant() {
		this.setMaxStackSize(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.isPotionActive(Potion.field_76434_w))
		player.addPotionEffect(new PotionEffect(Potion.field_76434_w.id, Integer.MAX_VALUE, 1, true));
		
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.levelup", 0.1F, 1.0f);
		}
		
		player.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1, true));
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		
		player.removePotionEffect(Potion.field_76434_w.id);
		
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
		list.add("Gives you 4 extra hearts.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
