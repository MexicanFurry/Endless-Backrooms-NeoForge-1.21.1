package net.mexicanfurry.backrooms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.init.BackroomsModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Level0IsolationEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0"))
				&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0"))
				&& world.players().size() > 1
				|| (entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:the_red_rooms"))
						&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION,
								ResourceLocation.parse("backrooms:the_red_rooms"))
						&& world.players().size() > 1)
				&& (entity != null ? entity.distanceTo(entity) : -1) >= 1 && (entity != null ? entity.distanceTo(entity) : -1) <= 100 && new Vec3(58, 100, 58).distanceTo(new Vec3((entity.getX()), (entity.getY()), (entity.getZ()))) > 5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(BackroomsModMobEffects.ISOLATION, 100, 0, false, false));
		}
	}
}