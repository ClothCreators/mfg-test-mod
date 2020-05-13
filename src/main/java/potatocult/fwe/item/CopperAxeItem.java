
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

public class CopperAxeItem extends AxeItem {
	public CopperAxeItem(CopperAxeMaterial CopperAxe) {
		super(CopperAxe, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
