
package potatocult.fwe.item;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class OnyxShovelItem extends ShovelItem {
	public OnyxShovelItem(OnyxShovelMaterial OnyxShovel) {
		super(OnyxShovel, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
