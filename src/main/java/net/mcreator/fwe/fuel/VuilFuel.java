
package net.mcreator.fwe.fuel;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class VuilFuel {
	public void initialize() {
		FuelRegistry.INSTANCE.add(new ItemStack(Blocks.DANDELION, (int) (1)).getItem(), 1600);
	}
}
