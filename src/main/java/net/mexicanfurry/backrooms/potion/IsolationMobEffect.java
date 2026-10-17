package net.mexicanfurry.backrooms.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mexicanfurry.backrooms.procedures.IsolationOnEffectActiveTickProcedure;

public class IsolationMobEffect extends MobEffect {
	public IsolationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26215);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		IsolationOnEffectActiveTickProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}