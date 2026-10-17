package net.mexicanfurry.backrooms.procedures;

import net.minecraft.world.entity.Entity;

public class IsolationOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setInvisible(true);
	}
}