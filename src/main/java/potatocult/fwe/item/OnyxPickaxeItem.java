
package potatocult.fwe.item;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class OnyxPickaxeItem extends PickaxeItem {
	public OnyxPickaxeItem(OnyxPickaxeMaterial OnyxPickaxe) {
		super(OnyxPickaxe, 0, -1.0f, new Item.Settings().group(ItemGroup.TOOLS));
	}
}
