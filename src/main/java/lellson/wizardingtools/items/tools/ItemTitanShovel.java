package lellson.wizardingtools.items.tools;

import lellson.wizardingtools.items.WizardingItems;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemTitanShovel extends ItemSpade {

	public ItemTitanShovel(ToolMaterial material) {
		super(material);
	}
	
	public boolean getIsRepairable(ItemStack item, ItemStack item2) {
	      return WizardingItems.itemTitaniumIngot == item2.getItem() ? true : super.getIsRepairable(item, item2);
	   }

}
