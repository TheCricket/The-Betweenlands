package thebetweenlands.common.block.structure;

import java.util.Random;

import javax.annotation.Nonnull;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockStateContainer;
import thebetweenlands.common.block.BasicBlock;
import thebetweenlands.common.item.ItemBlockSlab;
import thebetweenlands.common.registries.BlockRegistry;

public class BlockSlabBetweenlands extends BasicBlock implements BlockRegistry.ICustomItemBlock {
	public static final EnumProperty<EnumBlockHalfBL> HALF = EnumProperty.<EnumBlockHalfBL>create("half", EnumBlockHalfBL.class);
	protected static final AxisAlignedBB AABB_BOTTOM_HALF = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D);
	protected static final AxisAlignedBB AABB_TOP_HALF = new AxisAlignedBB(0.0D, 0.5D, 0.0D, 1.0D, 1.0D, 1.0D);

	@SuppressWarnings("deprecation")
	public BlockSlabBetweenlands(Block block) {
		super(block.getMaterial(block.getDefaultState()));
		this.setSoundType(block.getSoundType());
		this.setDefaultState(blockState.getBaseState().with(HALF, EnumBlockHalfBL.BOTTOM));
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.useNeighborBrightness = true;
	}

	@Nonnull
	@Override
	public ItemBlock getItemBlock() {
		return new ItemBlockSlab(this);
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return state.get(HALF).equals(EnumBlockHalfBL.FULL);
	}

	@Override
	public boolean doesSideBlockRendering(IBlockState state, IWorldReader world, BlockPos pos, EnumFacing face) {
		return (state.get(HALF).equals(EnumBlockHalfBL.BOTTOM) && face == EnumFacing.DOWN) || (state.get(HALF).equals(EnumBlockHalfBL.TOP) && face == EnumFacing.UP) || state.get(HALF).equals(EnumBlockHalfBL.FULL);
	}

	@Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		IBlockState state = getStateFromMeta(meta);
		return state.get(HALF).equals(EnumBlockHalfBL.FULL) ? state : (facing != EnumFacing.DOWN && (facing == EnumFacing.UP || (double) hitY <= 0.5D) ? state.with(HALF, EnumBlockHalfBL.BOTTOM) : state.with(HALF, EnumBlockHalfBL.TOP));
	}

	@Override
	public int getItemsToDropCount(IBlockState state, int fortune, World worldIn, BlockPos pos, Random random) {
		return state.get(HALF).equals(EnumBlockHalfBL.FULL) ? 2 : 1;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return state.get(HALF).equals(EnumBlockHalfBL.FULL);
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IWorldReader source, BlockPos pos) {
		EnumBlockHalfBL half = state.get(HALF);
		switch (half) {
			case TOP:
				return AABB_TOP_HALF;
			case BOTTOM:
				return AABB_BOTTOM_HALF;
			default:
				return FULL_BLOCK_AABB;
		}
	}

	@Override
	public boolean isTopSolid(IBlockState state) {
		return state.get(HALF).equals(EnumBlockHalfBL.FULL) || state.get(HALF).equals(EnumBlockHalfBL.TOP);
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IWorldReader worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
        if (state.get(HALF) == EnumBlockHalfBL.FULL) {
            return BlockFaceShape.SOLID;
        } else if (face == EnumFacing.UP && state.get(HALF) == EnumBlockHalfBL.TOP) {
            return BlockFaceShape.SOLID;
        } else {
            return face == EnumFacing.DOWN && state.get(HALF) == EnumBlockHalfBL.BOTTOM ? BlockFaceShape.SOLID : BlockFaceShape.UNDEFINED;
        }
    }

	@Override
    public boolean onBlockActivated(IBlockState state, World worldIn, BlockPos pos, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
	    ItemStack heldItem = playerIn.getHeldItem(hand);
		if (!heldItem.isEmpty() && ((state.get(HALF).equals(EnumBlockHalfBL.TOP) && facing.equals(EnumFacing.DOWN)) || (state.get(HALF).equals(EnumBlockHalfBL.BOTTOM) && facing.equals(EnumFacing.UP)))){
			if (heldItem.getItem() == Item.getItemFromBlock(this)) {
				worldIn.setBlockState(pos, state.with(HALF, EnumBlockHalfBL.FULL));
				if(!playerIn.abilities.isCreativeMode)
					heldItem.setCount(heldItem.getCount() - 1);
				SoundType soundtype = this.getSoundType(state, worldIn, pos, playerIn);
				worldIn.play(playerIn, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
				return true;
			}
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, HALF);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().with(HALF, EnumBlockHalfBL.byMetadata(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.get(HALF).ordinal();
	}

	public static enum EnumBlockHalfBL implements IStringSerializable {
		TOP("top"),
		BOTTOM("bottom"),
		FULL("full");

		private final String name;

		private EnumBlockHalfBL(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return this.name;
		}

		@Override
		public String getName() {
			return this.name;
		}


		public static EnumBlockHalfBL byMetadata(int metadata) {
			if (metadata < 0 || metadata >= values().length) {
				metadata = 0;
			}
			return values()[metadata];
		}
	}
}
