package thebetweenlands.common.block.container;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.chunk.BlockStateContainer;
import thebetweenlands.client.tab.BLCreativeTabs;
import thebetweenlands.common.TheBetweenlands;
import thebetweenlands.common.proxy.CommonProxy;
import thebetweenlands.common.registries.ItemRegistry;
import thebetweenlands.common.tile.TileEntityMortar;

public class BlockMortar extends BlockContainer {
	public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

	public BlockMortar() {
		super(Material.ROCK);
		setHardness(2.0F);
		setResistance(5.0F);
		setCreativeTab(BLCreativeTabs.BLOCKS);
		setDefaultState(blockState.getBaseState().with(FACING, EnumFacing.NORTH));
	}

	@Override
	public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {
		return this.getDefaultState().with(FACING, placer.getHorizontalFacing());
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		world.setBlockState(pos, state.with(FACING, placer.getHorizontalFacing()), 2);
	}

	@Override
	public void onBlockClicked(IBlockState state, World worldIn, BlockPos pos, EntityPlayer playerIn) {
		if(!worldIn.isRemote()) {
			if (worldIn.getTileEntity(pos) instanceof TileEntityMortar) {
				TileEntityMortar tile = (TileEntityMortar) worldIn.getTileEntity(pos);

				tile.manualGrinding = true;
				IBlockState state = worldIn.getBlockState(pos);
				worldIn.notifyBlockUpdate(pos, state, state, 3);
			}
		}
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand,EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote())
			return true;
		if (worldIn.getTileEntity(pos) instanceof TileEntityMortar) {
			TileEntityMortar tile = (TileEntityMortar) worldIn.getTileEntity(pos);

			if (!playerIn.getHeldItem(hand).isEmpty()) {
				if (playerIn.getHeldItem(hand).getItem() == ItemRegistry.PESTLE && tile.getStackInSlot(1).isEmpty()) {
					tile.setInventorySlotContents(1, playerIn.getHeldItem(hand));
					tile.hasPestle = true;
					playerIn.setHeldItem(hand, ItemStack.EMPTY);
				} else if (playerIn.getHeldItem(hand).getItem() == ItemRegistry.LIFE_CRYSTAL && tile.getStackInSlot(3).isEmpty()) {
					tile.setInventorySlotContents(3, playerIn.getHeldItem(hand));
					playerIn.setHeldItem(hand, ItemStack.EMPTY);
				} else {
					playerIn.openGui(TheBetweenlands.instance, CommonProxy.GUI_PESTLE_AND_MORTAR, worldIn, pos.getX(), pos.getY(), pos.getZ());
				}
			} else {
				playerIn.openGui(TheBetweenlands.instance, CommonProxy.GUI_PESTLE_AND_MORTAR, worldIn, pos.getX(), pos.getY(), pos.getZ());
			}
		}
		return true;
	}

	@Override
	public void onReplaced(IBlockState state, World world, BlockPos pos, IBlockState newState, boolean isMoving) {
		IInventory tile = (IInventory) world.getTileEntity(pos);
		if (tile != null)
			for (int i = 0; i < tile.getSizeInventory(); i++) {
				ItemStack stack = tile.getStackInSlot(i);
				if (!stack.isEmpty()) {
					if (!world.isRemote() && world.getGameRules().getBoolean("doTileDrops")) {
						float f = 0.7F;
						double d0 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
						double d1 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
						double d2 = world.rand.nextFloat() * f + (1.0F - f) * 0.5D;
						if (stack.getItem() == ItemRegistry.PESTLE){
							stack.getTag().setBoolean("active", false);
						}
						EntityItem entityitem = new EntityItem(world, pos.getX() + d0, pos.getY() + d1, pos.getZ() + d2, stack);
						entityitem.setPickupDelay(10);
						world.spawnEntity(entityitem);
					}
				}
			}
		super.onReplaced(state, world, pos, newState, isMoving);
	}

	@Override
	public void animateTick(IBlockState stateIn, World world, BlockPos pos, Random rand) {
		TileEntityMortar tile = (TileEntityMortar) world.getTileEntity(pos);
		if (tile.progress > 0 && rand.nextInt(3) == 0) {
			float f = pos.getX() + 0.5F;
			float f1 = pos.getY() + 1.1F + rand.nextFloat() * 6.0F / 16.0F;
			float f2 = pos.getZ() + 0.5F;
			world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, f, f1, f2, 0.0D, 0.0D, 0.0D);
		}
	}

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TileEntityMortar();
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.get(FACING).getHorizontalIndex();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().with(FACING, EnumFacing.byHorizontalIndex(meta));
	}
	
	@Override
	public BlockFaceShape getBlockFaceShape(IWorldReader worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.UNDEFINED;
	}
}