/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mexicanfurry.backrooms.fluid.types.NotWaterFluidType;
import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, BackroomsMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> NOT_WATER_TYPE = REGISTRY.register("not_water", NotWaterFluidType::new);
}