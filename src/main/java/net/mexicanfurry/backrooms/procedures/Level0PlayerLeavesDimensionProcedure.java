package net.mexicanfurry.backrooms.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;

public class Level0PlayerLeavesDimensionProcedure {
	public static void execute(LevelAccessor world) {
		if (world.players().size() == 0
				&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0"))) {
			BackroomsModVariables.WorldVariables.get(world).Level0Events = false;
			BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
		}
	}
}