package lellson.wizardingtools.items.baubles;

import java.util.List;

import org.lwjgl.input.Keyboard;

import lellson.wizardingtools.entity.entityEnderBeltProjectile;
import lellson.wizardingtools.entity.entityRailProjectile;
import lellson.wizardingtools.util.WizardingConfig;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;

public class ItemBeltOfEnder extends Item implements IBauble {

	private int counter = 60;

	public ItemBeltOfEnder() {
		this.setMaxStackSize(1);
		this.setMaxDamage(16);
	}

	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}
	
	

	@Override
	public void onWornTick(ItemStack item, EntityLivingBase player) {
	EntityPlayer player2 = (EntityPlayer) player;	
	
	if (!(item.getItemDamage() >= 15)) {	
		if (player.isSneaking()) {
		
			if(counter  >=1){
				counter--;
			}
			else if(counter <= 0){
			 
			 player.worldObj.playSoundAtEntity(player, "mob.endermen.portal", 0.6F, 0.5F / (itemRand.nextFloat() * 0.8F + 1.2F));
			 player.worldObj.spawnParticle("portal", player.posX, player.posY + itemRand.nextDouble() * 2.0D, player.posZ, itemRand.nextGaussian(), 0.0D, itemRand.nextGaussian());
			 
			 item.damageItem(1, player);
			 
			 player.fallDistance = 0F;

	            if (!player.worldObj.isRemote)
	            {
	            	player.worldObj.spawnEntityInWorld(new entityEnderBeltProjectile(player.worldObj, player));
	            }
			 
			 counter = 60;
		 			}
				}
			}
		}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		
		if (!player.worldObj.isRemote) {
			player.worldObj.playSoundAtEntity(player, "mob.endermen.death", 0.1F, 1.0f);
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
		list.add("Sneak to teleport you in the direction you are looking");
		list.add("Teleports damage the item (2 Uses per teleport).");
		list.add("Craft together with 1 Enderpearl to recharge the item.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
			
	}
	
	public void onWornTick2(ItemStack item, EntityPlayer player) {
		
		
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}

}
