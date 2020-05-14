
package potatocult.fwe.item;

import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.entity.EquipmentSlot;

public class OnyxArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private static final int[] PROTECTION_AMOUNTS = new int[]{6, 18, 15, 6};
	@Override
	public int getDurability(EquipmentSlot arg0) {
		return BASE_DURABILITY[arg0.getEntitySlotId()] * 45;
	}

	@Override
	public int getProtectionAmount(EquipmentSlot arg0) {
		return PROTECTION_AMOUNTS[arg0.getEntitySlotId()];
	}

	@Override
	public int getEnchantability() {
		return &{data.enchantability};
	}

	@Override
	public SoundEvent getEquipSound() {
				return SoundEvents.;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.EMPTY;
	}

	@Override
	public String getName() {
		return "onyx_armor";
	}

	@Override
	public float getToughness() {
		return 0f;
	}
}
