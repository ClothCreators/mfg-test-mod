
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

public class OnyxHoeItem extends HoeItem {
	public OnyxHoeItem(OnyxHoeMaterial OnyxHoe) {
		super(OnyxHoe, 0, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
