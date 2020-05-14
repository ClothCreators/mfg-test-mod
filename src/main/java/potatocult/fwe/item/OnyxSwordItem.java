
package potatocult.fwe.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class OnyxSwordItem extends SwordItem {
	public OnyxSwordItem(OnyxSwordMaterial OnyxSword) {
		super(OnyxSword, 0, -1.0f, new Item.Settings().group(ItemGroup.COMBAT));
	}
}
