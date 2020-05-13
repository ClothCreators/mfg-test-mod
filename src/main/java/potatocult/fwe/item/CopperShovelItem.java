
package potatocult.fwe.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class CopperShovelItem extends ShovelItem {
	public CopperShovelItem(CopperShovelMaterial CopperShovel) {
		super(CopperShovel, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
