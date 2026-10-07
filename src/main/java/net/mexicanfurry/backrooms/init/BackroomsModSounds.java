/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, BackroomsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LEVEL0_AMBIENT = REGISTRY.register("level0_ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "level0_ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GLITCH = REGISTRY.register("glitch", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "glitch")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STOMACH_DISCOMFORT = REGISTRY.register("stomach_discomfort", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "stomach_discomfort")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FLASHLIGHT_CLICK = REGISTRY.register("flashlight_click", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "flashlight_click")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHTS_ON = REGISTRY.register("lights_on", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "lights_on")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_ON = REGISTRY.register("light_on", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "light_on")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LIGHT_OFF = REGISTRY.register("light_off", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("backrooms", "light_off")));
}