
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

public class CopperIngot extends Item {
	public CopperIngot() {
		super(new Settings().group(ItemGroup.MISC).maxCount(64));
	}
}
