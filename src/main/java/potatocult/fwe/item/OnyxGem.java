
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class OnyxGem extends Item {
	public OnyxGem() {
		super(new Settings().group(ItemGroup.MISC).maxCount(64));
	}
}
