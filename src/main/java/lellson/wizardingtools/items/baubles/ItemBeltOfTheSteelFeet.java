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

public class ItemBeltOfTheSteelFeet extends Item implements IBauble {
	
	public ItemBeltOfTheSteelFeet() {
		this.setMaxStackSize(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}
	
	

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.onGround) {
			player.fallDistance = 0F;
		}
		
		if (!player.isSneaking()) {
			player.stepHeight = 1.0F;
		}
		
		if (player.isSneaking()) {
			player.stepHeight = 0.5F;
		}
		
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "random.anvil_land", 0.1F, 1.0f);
		}
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		
			player.stepHeight = 0.5F;
		
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
		list.add("Increase step height to 1 block and negates fall damage completely.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
			
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
