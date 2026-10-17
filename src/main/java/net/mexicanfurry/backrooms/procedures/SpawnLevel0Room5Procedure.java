package net.mexicanfurry.backrooms.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SpawnLevel0Room5Procedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (BackroomsModVariables.WorldVariables.get(world).isLevel0Room5Present == false) {
			if (world instanceof ServerLevel _origLevel) {
				LevelAccessor _switchworld1 = _origLevel.getServer().getLevel(ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0")));
				if (_switchworld1 != null) {
					worldSwitch1(_switchworld1);
				}
			}
			BackroomsModVariables.WorldVariables.get(world).isLevel0Room5Present = true;
			BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
		}
	}

	private static void worldSwitch1(LevelAccessor world) {
		if (world instanceof ServerLevel _serverworld) {
			StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_room5"));
			if (template != null) {
				template.placeInWorld(_serverworld, new BlockPos(216, 98, 433), new BlockPos(216, 98, 433), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
			}
		}
	}
}