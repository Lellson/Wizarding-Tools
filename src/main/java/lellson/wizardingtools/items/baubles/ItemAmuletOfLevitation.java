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
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ItemAmuletOfLevitation extends Item implements IBauble {
	
	public ItemAmuletOfLevitation() {
		this.setMaxStackSize(1);
		this.setMaxDamage(6400);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}
	
	

	@Override
	public void onWornTick(ItemStack item, EntityLivingBase player) {
	
	if (!(item.getItemDamage() >= 6400)) {
		if (!player.onGround) {
			if (Keyboard.isKeyDown(Keyboard.KEY_SPACE)) {
			
				player.setVelocity((-MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * 0.2), 0.2, (MathHelper.cos(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * 0.2));
			
				item.damageItem(1, player);
			
				player.fallDistance = 0F;
				
				player.worldObj.spawnParticle("witchMagic", player.posX, player.posY - 1, player.posZ, 0, 0, 0);
				player.worldObj.spawnParticle("witchMagic", player.posX + 0.2, player.posY - 1, player.posZ, 0, 0, 0);
				player.worldObj.spawnParticle("witchMagic", player.posX, player.posY - 1, player.posZ + 0.2, 0, 0, 0);
				player.worldObj.spawnParticle("witchMagic", player.posX - 0.2, player.posY - 1, player.posZ, 0, 0, 0);
				player.worldObj.spawnParticle("witchMagic", player.posX, player.posY - 1, player.posZ - 0.2, 0, 0, 0);
				}
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
		list.add("I believe i can fly!");
		list.add("Wears out slowly.");
		list.add("Craft together with 3 Feathers to recharge the item.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
			
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
