
package potatocult.fwe.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;

public class CopperAxeMaterial implements ToolMaterial {
	@Override
	public float getAttackDamage() {
		return 4f;
	}

	@Override
	public int getDurability() {
		return 167;
	}

	@Override
	public int getEnchantability() {
		return 11;
	}

	@Override
	public int getMiningLevel() {
		return 2;
	}

	@Override
	public float getMiningSpeed() {
		return 5f;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.EMPTY;
	}
}
