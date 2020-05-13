
package net.mcreator.fwe.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Material;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;

public class Bruh extends Block {
	public Bruh() {
		super(FabricBlockSettings.of(Material.STONE).breakByTool(FabricToolTags.AXES).breakByHand(true).sounds(BlockSoundGroup.GRASS).strength(1, 10f)
				.build());
	}
}
