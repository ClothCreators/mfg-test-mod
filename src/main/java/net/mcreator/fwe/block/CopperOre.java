
package net.mcreator.fwe.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Material;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;

public class CopperOre extends Block {
	public CopperOre() {
		super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.PICKAXES).breakByHand(true).sounds(BlockSoundGroup.STONE)
				.strength(2, 4f).build());
	}
}
