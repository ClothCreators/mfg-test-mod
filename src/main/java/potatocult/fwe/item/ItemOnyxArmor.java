
package potatocult.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;

public class ItemOnyxArmor implements ArmorItem {
	public BaseArmor(OnyxArmorMaterial material, EquipmentSlot slot) {
		super(material, slot, new Item.Settings().group(ItemGroup.ItemGroup.COMBAT));
	}
}
