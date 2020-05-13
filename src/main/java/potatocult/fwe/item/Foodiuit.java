
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class Foodiuit extends Item {
	public Foodiuit() {
		super(new Settings().group(ItemGroup.COMBAT).maxCount(12));
	}
}
