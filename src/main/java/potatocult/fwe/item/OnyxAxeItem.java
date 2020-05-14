
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;

public class OnyxAxeItem extends AxeItem {
	public OnyxAxeItem(OnyxAxeMaterial OnyxAxe) {
		super(OnyxAxe, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
