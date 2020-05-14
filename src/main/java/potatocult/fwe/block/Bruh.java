
package potatocult.fwe.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Material;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

public class Bruh extends Block {
	public Bruh() {
		super(FabricBlockSettings.of(Material.STONE).breakByHand(true).sounds(BlockSoundGroup.GRASS).strength(1f, 10f).build());
	}
}
