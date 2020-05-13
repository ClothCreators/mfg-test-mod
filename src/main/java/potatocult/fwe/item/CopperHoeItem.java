
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

public class CopperHoeItem extends HoeItem {
	public CopperHoeItem(CopperHoeMaterial CopperHoe) {
		super(CopperHoe, 0, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
