package lellson.wizardingtools.items.tools;

import lellson.wizardingtools.items.WizardingItems;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTitaniumArmor extends ItemArmor {

	public ArmorMaterial repairmaterial;

	public ItemTitaniumArmor(ArmorMaterial material, int texture, int armorType) {
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
	
	public boolean getIsRepairable(ItemStack item, ItemStack item2) {
	      return WizardingItems.itemTitaniumIngot == item2.getItem() ? true : super.getIsRepairable(item, item2);
	   }
}
