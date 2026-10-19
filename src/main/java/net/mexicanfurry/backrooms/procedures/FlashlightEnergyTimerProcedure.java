package net.mexicanfurry.backrooms.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;
import net.mexicanfurry.backrooms.init.BackroomsModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FlashlightEnergyTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BackroomsModItems.FLASHLIGHT_ON.get()) {
			if (entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergyTimer == 0) {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.FlashlightEnergyTimer = 12000;
					_vars.FlashlightEnergy = entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergy - 1;
					_vars.markSyncDirty();
				}
				if (entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergy == 0) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Battery: 0%"), true);
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack3 = new ItemStack(BackroomsModItems.FLASHLIGHT_OFF.get()).copy();
						_setstack3.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			} else {
				{
					BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
					_vars.FlashlightEnergyTimer = entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergyTimer - 1;
					_vars.markSyncDirty();
				}
			}
		}
	}
}