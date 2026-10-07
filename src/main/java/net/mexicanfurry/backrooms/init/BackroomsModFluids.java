/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mexicanfurry.backrooms.fluid.NotWaterFluid;
import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, BackroomsMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> NOT_WATER = REGISTRY.register("not_water", NotWaterFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_NOT_WATER = REGISTRY.register("flowing_not_water", NotWaterFluid.Flowing::new);

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(NOT_WATER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NOT_WATER.get(), RenderType.translucent());
		}
	}
}