package net.mexicanfurry.backrooms.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mexicanfurry.backrooms.procedures.HandsInTheDarkEffectStartedappliedProcedure;

public class HandsInTheDarkMobEffect extends MobEffect {
	public HandsInTheDarkMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		HandsInTheDarkEffectStartedappliedProcedure.execute(entity.level(), entity);
	}
}