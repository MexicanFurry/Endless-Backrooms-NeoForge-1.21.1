package net.mexicanfurry.backrooms.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class Level0PlayerEntersDimensionProcedure {
	public static void execute(double x, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			double _tx = x;
			double _ty = 100;
			double _tz = z;
			_ent.teleportTo(_tx, _ty, _tz);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(_tx, _ty, _tz, _ent.getYRot(), _ent.getXRot());
		}
	}
}