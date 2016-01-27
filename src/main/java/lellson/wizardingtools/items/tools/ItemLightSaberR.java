package lellson.wizardingtools.items.tools;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ItemLightSaberR extends ItemSword {

	public ItemLightSaberR(ToolMaterial material) {
		super(material);
		
	}
	
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int i, boolean b) {	
		if (item.isItemDamaged()) {
			item.setItemDamage(0);
			
		}
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Do you feel the force?");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entity, ItemStack item)
    {
		entity.worldObj.playSoundAtEntity(entity, "wt:lightsaber", 0.5F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
        return false;
    }
	
	

}
