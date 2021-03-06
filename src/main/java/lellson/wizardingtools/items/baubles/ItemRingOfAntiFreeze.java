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

public class ItemRingOfAntiFreeze extends Item implements IBauble {
	
	public ItemRingOfAntiFreeze() {
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
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "mob.wolf.shake", 0.1F, 1.3f);
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
		list.add("Immunity to slowness.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
