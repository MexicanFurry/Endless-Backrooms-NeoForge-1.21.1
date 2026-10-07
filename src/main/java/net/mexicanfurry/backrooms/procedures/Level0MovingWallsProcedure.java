package net.mexicanfurry.backrooms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class Level0MovingWallsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (BackroomsModVariables.WorldVariables.get(world).Level0MovingWallsTimer == 0) {
			BackroomsModVariables.WorldVariables.get(world).Level0MovingWallsTimer = 600;
			BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
			if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0"))) {
				if (Math.random() <= 0.8) {
					if (entity.getLookAngle().x > 0 && entity.getLookAngle().z > 0) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (entity.getLookAngle().x < 0 && entity.getLookAngle().z > 0) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() - 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (entity.getLookAngle().x > 0 && entity.getLookAngle().z < 0) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() - 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (entity.getLookAngle().x < 0 && entity.getLookAngle().z < 0) {
						if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_wall10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											BlockPos.containing(entity.getX() + 5, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor, entity.getZ() + 5),
											new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
				} else {
					if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_room1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					} else if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_room2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					} else if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_room3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:lights_on")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					} else if (Math.random() < 0.25) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_room4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										BlockPos.containing(entity.getX() - 8, entity.getData(BackroomsModVariables.PLAYER_VARIABLES).Level0PlayerCurrentFloor - 2, entity.getZ() - 8),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
		} else {
			BackroomsModVariables.WorldVariables.get(world).Level0MovingWallsTimer = BackroomsModVariables.WorldVariables.get(world).Level0MovingWallsTimer - 1;
			BackroomsModVariables.WorldVariables.get(world).markSyncDirty();
		}
		if ((entity.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("backrooms:level_0"))) {
			if (entity.getY() == 230) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 230;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 220) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 220;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 210) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 210;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 200) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 200;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 190) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 190;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 180) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 180;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 170) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 170;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 160) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 160;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 150) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 150;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 140) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 140;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 130) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 130;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 120) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 120;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 110) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 110;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 100) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 100;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 90) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 90;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 80) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 80;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 70) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 70;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 60) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 60;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 50) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 50;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 40) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 40;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 30) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 30;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 20) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 20;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 10) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 10;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == 0) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = 0;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -10) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -10;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -20) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -20;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -30) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -30;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -40) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -40;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -50) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -50;
					_vars.markSyncDirty();
				}
			}
			if (entity.getY() == -60) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.Level0PlayerCurrentFloor = -60;
					_vars.markSyncDirty();
				}
			}
		}
	}
}