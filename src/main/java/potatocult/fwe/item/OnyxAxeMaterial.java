
package potatocult.fwe.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;

public class OnyxAxeMaterial implements ToolMaterial {
	@Override
	public float getAttackDamage() {
		return 5f;
	}

	@Override
	public int getDurability() {
		return 1164;
	}

	@Override
	public int getEnchantability() {
		return 42;
	}

	@Override
	public int getMiningLevel() {
		return 6;
	}

	@Override
	public float getMiningSpeed() {
		return 12f;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.EMPTY;
	}
}
