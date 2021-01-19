
package net.mcreator.det.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.Block;

import net.mcreator.det.ElementsDET;

import java.util.Random;

@ElementsDET.ModElement.Tag
public class BlockTestTopDust extends ElementsDET.ModElement {
	@GameRegistry.ObjectHolder("det:testtopdust")
	public static final Block block = null;
	public BlockTestTopDust(ElementsDET instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("testtopdust"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("det:testtopdust", "inventory"));
	}
	public static class BlockCustom extends BlockFalling {
		public BlockCustom() {
			super(Material.GRASS);
			setUnlocalizedName("testtopdust");
			setSoundType(SoundType.GROUND);
			setHarvestLevel("shovel", 1);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			EntityPlayer entity = Minecraft.getMinecraft().player;
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			int i = x;
			int j = y;
			int k = z;
			if (true)
				for (int l = 0; l < 1; ++l) {
					double d0 = (double) ((float) i + 0.5) + (double) (random.nextFloat() - 0.5) * 0.5D;
					double d1 = ((double) ((float) j + 0.7) + (double) (random.nextFloat() - 0.5) * 0.5D) + 0.5;
					double d2 = (double) ((float) k + 0.5) + (double) (random.nextFloat() - 0.5) * 0.5D;
					world.spawnParticle(EnumParticleTypes.SUSPENDED_DEPTH, d0, d1, d2, 0, 0, 0);
				}
		}
	}
}
