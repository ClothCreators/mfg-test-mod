
package net.mcreator.fwe.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class CopperPickaxeItem extends PickaxeItem {
	public CopperPickaxeItem(CopperPickaxeMaterial CopperPickaxe) {
		super(CopperPickaxe, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
