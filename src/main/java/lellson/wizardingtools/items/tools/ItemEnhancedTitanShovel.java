package lellson.wizardingtools.items.tools;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import scala.reflect.api.Trees.SuperApi;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ItemEnhancedTitanShovel extends ItemSpade {
	
	static final int COST = 75;

	public ItemEnhancedTitanShovel(ToolMaterial material) {
		super(material);
		
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}
	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		return place(par1ItemStack, par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10, Blocks.dirt, COST, 0.35F, 0.2F, 0.05F);
	}

	
	
	public static boolean place(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10, Block block, int cost, float r, float g, float b) {

			ForgeDirection dir = ForgeDirection.getOrientation(par7);
			int entities = par3World.getEntitiesWithinAABB(EntityLivingBase.class, AxisAlignedBB.getBoundingBox(par4 + dir.offsetX, par5 + dir.offsetY, par6 + dir.offsetZ, par4 + dir.offsetX + 1, par5 + dir.offsetY + 1, par6 + dir.offsetZ + 1)).size();
			if(entities == 0) {
				ItemStack stackToPlace = new ItemStack(block);
				stackToPlace.tryPlaceItemIntoWorld(par2EntityPlayer, par3World, par4, par5, par6, par7, par8, par9, par10);
			}
			

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
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack item, EntityPlayer player, List list, boolean b) {
		if(GuiScreen.isShiftKeyDown()){
		list.add("Rightclick: Summon Dirt.");
		}
		if(!GuiScreen.isShiftKeyDown()){
		list.add("Press shift for more informations.");
		}
	}
}