package lellson.wizardingtools.items.tools;

import java.util.List;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

public class ItemEnhancedTitanSword extends ItemSword {

	public ItemEnhancedTitanSword(ToolMaterial material) {
		super(material);
		
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
		
	}
	
	@Override
    public EnumAction getItemUseAction (ItemStack item)
    {
        return EnumAction.bow;
    }
	
	@Override
    public ItemStack onItemRightClick (ItemStack item, World world, EntityPlayer player)
    {
        if (player.onGround)
        {
            player.setItemInUse(item, this.getMaxItemUseDuration(item));
        }
        return item;
    }
    
    @Override
    public void onPlayerStoppedUsing (ItemStack stack, World world, EntityPlayer player, int useCount)
    {
    if (player.onGround)
    {
        int time = this.getMaxItemUseDuration(stack) - useCount;
        if (time > 1)
        {
            player.setSprinting(true);

            float speed = 0.15F * time;
            if (speed > 6f)
                speed = 6f;
            player.motionX = (double) (-MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * speed);
            player.motionZ = (double) (MathHelper.cos(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * speed);
        	}
    	}
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
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Hold Rightclick: Charge Attack.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}
