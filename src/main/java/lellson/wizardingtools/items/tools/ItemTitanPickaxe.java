package lellson.wizardingtools.items.tools;

import lellson.wizardingtools.items.WizardingItems;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemTitanPickaxe extends ItemPickaxe {

	public ItemTitanPickaxe(ToolMaterial material) {
		super(material);
	}
	
	public boolean getIsRepairable(ItemStack item, ItemStack item2) {
	      return WizardingItems.itemTitaniumIngot == item2.getItem() ? true : super.getIsRepairable(item, item2);
	   }

}
