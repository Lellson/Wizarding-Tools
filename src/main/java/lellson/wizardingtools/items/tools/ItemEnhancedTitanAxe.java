package lellson.wizardingtools.items.tools;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import lellson.wizardingtools.entity.entityAxeProjectile;
import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEnhancedTitanAxe extends ItemAxe {

	public ItemEnhancedTitanAxe(ToolMaterial material) {
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
	public boolean showDurabilityBar (ItemStack item) {
		
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
		
		--item.stackSize;
			
        world.playSoundAtEntity(player, "mob.blaze.hit", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!world.isRemote)
        {
            world.spawnEntityInWorld(new entityAxeProjectile(world, player));
        }          
        
		return item;
    }
	

	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Rightclick: Axe Throw.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}
