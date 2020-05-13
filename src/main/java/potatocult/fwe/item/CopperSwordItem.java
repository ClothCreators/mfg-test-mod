
package potatocult.fwe.item;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class CopperSwordItem extends SwordItem {
	public CopperSwordItem(CopperSwordMaterial CopperSword) {
		super(CopperSword, 0, -1.0f, new Item.Settings().group(ItemGroup.COMBAT));
	}
}
