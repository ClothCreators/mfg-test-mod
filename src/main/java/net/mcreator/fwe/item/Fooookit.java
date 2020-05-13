
package net.mcreator.fwe.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.FoodComponent;

public class Fooookit extends Item {
	public Fooookit() {
		super(new Settings().group(ItemGroup.FOOD).maxCount(64)
				.food(new FoodComponent.Builder().hunger(8).saturationModifier(0.6f).alwaysEdible().build()));
	}
}
