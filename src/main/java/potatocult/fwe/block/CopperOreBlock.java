
package potatocult.fwe.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Material;
import net.minecraft.block.Block;

import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.fabricmc.fabric.api.block.FabricBlockSettings;

public class CopperOreBlock extends Block {
	public CopperOreBlock() {
		super(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES).sounds(BlockSoundGroup.METAL).strength(5f, 10f).build());
	}
}
