package lellson.wizardingtools.items.tools;

import java.util.List;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.IGrowable;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.FakePlayerFactory;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class ItemEnhancedTitanHoe extends ItemHoe {

	public ItemEnhancedTitanHoe(ToolMaterial material) {
		super(material);
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}
	
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int i, boolean b)
    {
		if (!world.isRemote) {
			if (!item.isItemEnchanted()) {
				item.addEnchantment(Enchantment.fortune, 3);
				item.addEnchantment(Enchantment.looting, 3);
			}
		}
		
		if (item.isItemDamaged()) {
			item.setItemDamage(0);
		}	
	}
    
    
	@Override
	public boolean itemInteractionForEntity(ItemStack item, EntityPlayer player, EntityLivingBase entity) {
		
		if (player.isSneaking()) {
			
		player.addPotionEffect(new PotionEffect(Potion.harm.id, 1, 0));
		entity.addPotionEffect(new PotionEffect(Potion.heal.id, 1, 1));
	
		}
		return true;
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Shift-Rightclick: Life Transmission.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}
