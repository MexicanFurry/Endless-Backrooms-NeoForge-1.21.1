/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mexicanfurry.backrooms.block.*;
import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(BackroomsMod.MODID);
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WALLPAPER_BLOCK;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WET_CARPET_BLOCK;
	public static final DeferredBlock<Block> WOOD_BLOCK;
	public static final DeferredBlock<Block> WOOD_STAIRS;
	public static final DeferredBlock<Block> WOOD_SLAB;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WALLPAPER_STAIRS;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WALLPAPER_SLAB;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WET_CARPET_STAIRS;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WET_CARPET_SLAB;
	public static final DeferredBlock<Block> FLUORESCENT_LAMP;
	public static final DeferredBlock<Block> LEVEL_0_FLUORESCENT_LAMP;
	public static final DeferredBlock<Block> LEVEL_0_CEILING;
	public static final DeferredBlock<Block> LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE;
	public static final DeferredBlock<Block> WOOD_BOARDS;
	public static final DeferredBlock<Block> FLASHLIGHT_LIGHT;
	public static final DeferredBlock<Block> NOT_WATER;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_WALLPAPER_BLOCK;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_WALLPAPER_STAIRS;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_WALLPAPER_SLAB;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_WALLPAPER_BLOCK_1;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_WALLPAPER_BLOCK_2;
	public static final DeferredBlock<Block> LEVEL_0_MANILA_ROOM_FLUORESCENT_LAMP;
	static {
		LEVEL_0_YELLOW_WALLPAPER_BLOCK = REGISTRY.register("level_0_yellow_wallpaper_block", Level0YellowWallpaperBlockBlock::new);
		LEVEL_0_YELLOW_WET_CARPET_BLOCK = REGISTRY.register("level_0_yellow_wet_carpet_block", Level0YellowWetCarpetBlockBlock::new);
		WOOD_BLOCK = REGISTRY.register("wood_block", WoodenBlockBlock::new);
		WOOD_STAIRS = REGISTRY.register("wood_stairs", WoodenStairsBlock::new);
		WOOD_SLAB = REGISTRY.register("wood_slab", WoodenSlabBlock::new);
		LEVEL_0_YELLOW_WALLPAPER_STAIRS = REGISTRY.register("level_0_yellow_wallpaper_stairs", Level0YellowWallpaperStairsBlock::new);
		LEVEL_0_YELLOW_WALLPAPER_SLAB = REGISTRY.register("level_0_yellow_wallpaper_slab", Level0YellowWallpaperSlabBlock::new);
		LEVEL_0_YELLOW_WET_CARPET_STAIRS = REGISTRY.register("level_0_yellow_wet_carpet_stairs", Level0YellowWetCarpetStairsBlock::new);
		LEVEL_0_YELLOW_WET_CARPET_SLAB = REGISTRY.register("level_0_yellow_wet_carpet_slab", Level0YellowWetCarpetSlabBlock::new);
		FLUORESCENT_LAMP = REGISTRY.register("fluorescent_lamp", FluorescentLampBlock::new);
		LEVEL_0_FLUORESCENT_LAMP = REGISTRY.register("level_0_fluorescent_lamp", Level0FluorescentLampBlock::new);
		LEVEL_0_CEILING = REGISTRY.register("level_0_ceiling", Level0CeilingBlock::new);
		LEVEL_0_YELLOW_WALLPAPER_BLOCK_BASE = REGISTRY.register("level_0_yellow_wallpaper_block_base", Level0YellowWallpaperBlockBaseBlock::new);
		WOOD_BOARDS = REGISTRY.register("wood_boards", WoodBoardsBlock::new);
		FLASHLIGHT_LIGHT = REGISTRY.register("flashlight_light", FlashlightLightBlock::new);
		NOT_WATER = REGISTRY.register("not_water", NotWaterBlock::new);
		LEVEL_0_MANILA_WALLPAPER_BLOCK = REGISTRY.register("level_0_manila_wallpaper_block", Level0ManilaWallpaperBlockBlock::new);
		LEVEL_0_MANILA_WALLPAPER_STAIRS = REGISTRY.register("level_0_manila_wallpaper_stairs", Level0ManilaWallpaperStairsBlock::new);
		LEVEL_0_MANILA_WALLPAPER_SLAB = REGISTRY.register("level_0_manila_wallpaper_slab", Level0ManilaWallpaperSlabBlock::new);
		LEVEL_0_MANILA_WALLPAPER_BLOCK_1 = REGISTRY.register("level_0_manila_wallpaper_block_1", Level0ManilaWallpaperBlock1Block::new);
		LEVEL_0_MANILA_WALLPAPER_BLOCK_2 = REGISTRY.register("level_0_manila_wallpaper_block_2", Level0ManilaWallpaperBlock2Block::new);
		LEVEL_0_MANILA_ROOM_FLUORESCENT_LAMP = REGISTRY.register("level_0_manila_room_fluorescent_lamp", Level0ManilaRoomFluorescentLampBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}