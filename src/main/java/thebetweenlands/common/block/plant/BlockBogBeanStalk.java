package thebetweenlands.common.block.plant;

import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import thebetweenlands.common.registries.BlockRegistry;
import thebetweenlands.util.AdvancedStateMap;

public class BlockBogBeanStalk extends BlockStackablePlantUnderwater {
	public BlockBogBeanStalk() {
		this.harvestAll = true;
		this.setMaxHeight(1);
		this.setCreativeTab(null);
	}

	@Override
	protected boolean isSamePlant(IBlockState blockState) {
		return super.isSamePlant(blockState) || blockState.getBlock() == BlockRegistry.BOG_BEAN_FLOWER;
	}
	
	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
		return super.canBlockStay(worldIn, pos, state) && worldIn.getBlockState(pos.up()).getBlock() == BlockRegistry.BOG_BEAN_FLOWER;
	}

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
		worldIn.setBlockState(pos, BlockRegistry.BOG_BEAN_STALK.getDefaultState());
		worldIn.setBlockState(pos.up(), BlockRegistry.BOG_BEAN_FLOWER.getDefaultState());
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
		return worldIn.isAirBlock(pos.up()) && super.canPlaceBlockAt(worldIn, pos);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void setStateMapper(AdvancedStateMap.Builder builder) {
		super.setStateMapper(builder);
		builder.ignore(IS_TOP, IS_BOTTOM);
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IWorldReader world, BlockPos pos, int fortune) {
		return ImmutableList.of(new ItemStack(Item.getItemFromBlock(BlockRegistry.BOG_BEAN_FLOWER)));
	}
	
	@Override
	public boolean isFarmable(World world, BlockPos pos, IBlockState state) {
		return true;
	}
	
	@Override
	public boolean canSpreadTo(World world, BlockPos pos, IBlockState state, BlockPos targetPos, Random rand) {
		return super.canSpreadTo(world, pos, state, targetPos, rand) && world.isAirBlock(targetPos.up());
	}
	
	@Override
	public void spreadTo(World world, BlockPos pos, IBlockState state, BlockPos targetPos, Random rand) {
		super.spreadTo(world, pos, state, targetPos, rand);
		world.setBlockState(targetPos.up(), BlockRegistry.BOG_BEAN_FLOWER.getDefaultState());
	}
	
	@Override
	public void decayPlant(World world, BlockPos pos, IBlockState state, Random rand) {
		super.decayPlant(world, pos, state, rand);
		if(world.getBlockState(pos.up()).getBlock() == BlockRegistry.BOG_BEAN_FLOWER) {
			world.removeBlock(pos.up());
		}
	}
	
	@Override
	public ItemBlock getItemBlock() {
		return null;
	}
}
