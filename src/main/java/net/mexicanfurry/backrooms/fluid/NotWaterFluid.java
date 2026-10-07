package net.mexicanfurry.backrooms.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mexicanfurry.backrooms.init.BackroomsModItems;
import net.mexicanfurry.backrooms.init.BackroomsModFluids;
import net.mexicanfurry.backrooms.init.BackroomsModFluidTypes;
import net.mexicanfurry.backrooms.init.BackroomsModBlocks;

public abstract class NotWaterFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> BackroomsModFluidTypes.NOT_WATER_TYPE.get(), () -> BackroomsModFluids.NOT_WATER.get(), () -> BackroomsModFluids.FLOWING_NOT_WATER.get())
			.explosionResistance(100f).tickRate(10).bucket(() -> BackroomsModItems.NOT_WATER_BUCKET.get()).block(() -> (LiquidBlock) BackroomsModBlocks.NOT_WATER.get());

	private NotWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends NotWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NotWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}