package lellson.wizardingtools.items.tools;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;

public class ItemEnhancedTitaniumChestplate extends ItemArmor {

	public ItemEnhancedTitaniumChestplate(ArmorMaterial material, int texture, int armorType) {
		super(material, texture, armorType);
		
	}
	
	@Override
	public String getArmorTexture(ItemStack item, Entity entity, int slot, String type) {
		
		if(this.armorType == 2)
		{
			return "wt:textures/models/armor/titaniumlayer2.png";
		}
		return "wt:textures/models/armor/titaniumlayer1.png";
	}
	
	public boolean hasEffect(ItemStack Item) {
		return true;
	}
	
	@Override
	public void onUpdate(ItemStack item, World world, Entity entity, int i, boolean b)
    {
		if (!world.isRemote) {
			if (!item.isItemEnchanted()) {
				item.addEnchantment(Enchantment.thorns, 5);
				item.addEnchantment(Enchantment.fireProtection, 4);
			}
		}
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack item)
    {
		if (item.isItemDamaged()) {
			item.setItemDamage(0);
		}	
    }

}
