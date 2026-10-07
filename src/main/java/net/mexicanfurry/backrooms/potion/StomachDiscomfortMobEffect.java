package net.mexicanfurry.backrooms.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mexicanfurry.backrooms.procedures.StomachDiscomfortOnEffectActiveTickProcedure;
import net.mexicanfurry.backrooms.procedures.StomachDiscomfortEffectStartedappliedProcedure;

public class StomachDiscomfortMobEffect extends MobEffect {
	public StomachDiscomfortMobEffect() {
		super(MobEffectCategory.HARMFUL, -3345037);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		StomachDiscomfortEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		StomachDiscomfortOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}