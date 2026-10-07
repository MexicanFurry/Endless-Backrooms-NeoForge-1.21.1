/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mexicanfurry.backrooms.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mexicanfurry.backrooms.potion.StomachDiscomfortMobEffect;
import net.mexicanfurry.backrooms.potion.HandsInTheDarkMobEffect;
import net.mexicanfurry.backrooms.BackroomsMod;

public class BackroomsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, BackroomsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> HANDS_IN_THE_DARK = REGISTRY.register("hands_in_the_dark", HandsInTheDarkMobEffect::new);
	public static final DeferredHolder<MobEffect, MobEffect> STOMACH_DISCOMFORT = REGISTRY.register("stomach_discomfort", StomachDiscomfortMobEffect::new);
}