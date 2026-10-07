package net.mexicanfurry.backrooms.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Level0EventsProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (BackroomsModVariables.WorldVariables.get(world).Level0Events == true) {
			if (BackroomsModVariables.WorldVariables.get(world).Level0EventsTimer == 0 && BackroomsModVariables.WorldVariables.get(world).Level0EventBlackout == false
					&& BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLights == false) {
				BackroomsModVariables.WorldVariables.get(world).Level0EventsTimer = 6000;
				BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				if (Math.random() < 0.25) {
					BackroomsModVariables.WorldVariables.get(world).Level0EventBlackout = true;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				} else if (Math.random() < 0.25) {
					BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLights = true;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				}
			} else {
				BackroomsModVariables.WorldVariables.get(world).Level0EventsTimer = BackroomsModVariables.WorldVariables.get(world).Level0EventsTimer - 1;
				BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
			}
			if (BackroomsModVariables.WorldVariables.get(world).Level0EventBlackout == true) {
				if (BackroomsModVariables.WorldVariables.get(world).Level0EventBlackoutTimer == 0) {
					BackroomsModVariables.WorldVariables.get(world).Level0EventBlackoutTimer = Mth.nextInt(RandomSource.create(), 1200, 6000);
					BackroomsModVariables.WorldVariables.get(world).Level0EventBlackout = false;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				} else {
					BackroomsModVariables.WorldVariables.get(world).Level0EventBlackoutTimer = BackroomsModVariables.WorldVariables.get(world).Level0EventBlackoutTimer - 1;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				}
			}
			if (BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLights == true) {
				if (BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLightsTimer == 0) {
					BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLightsTimer = Mth.nextInt(RandomSource.create(), 600, 1200);
					BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLights = false;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				} else {
					BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLightsTimer = BackroomsModVariables.WorldVariables.get(world).Level0EventFlickeringLightsTimer - 1;
					BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
				}
			}
		}
	}
}