package lellson.wizardingtools.items.tools;

import lellson.wizardingtools.items.WizardingItems;
import lellson.wizardingtools.util.WizardingConfig;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;

public class ItemTitanSword extends ItemSword {

	public ItemTitanSword(ToolMaterial material) {
		super(material);
	}
	
	public boolean getIsRepairable(ItemStack item, ItemStack item2) {
	      return WizardingItems.itemTitaniumIngot == item2.getItem() ? true : super.getIsRepairable(item, item2);
	   }

}
