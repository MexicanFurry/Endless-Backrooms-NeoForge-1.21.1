package net.mexicanfurry.backrooms.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mexicanfurry.backrooms.network.BackroomsModVariables;
import net.mexicanfurry.backrooms.init.BackroomsModItems;

public class FlashlightOffRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == itemstack.getItem()) {
			if (entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergy > 0) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack5 = new ItemStack(BackroomsModItems.FLASHLIGHT_ON.get()).copy();
					_setstack5.setCount(itemstack.getCount());
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:flashlight_click")), SoundSource.PLAYERS, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("backrooms:flashlight_click")), SoundSource.PLAYERS, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Battery: " + entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergy + "%")), true);
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Battery: 0%"), true);
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == BackroomsModItems.BATTERY.get()) {
				if (entity.getData(BackroomsModVariables.PLAYER_VARIABLES).FlashlightEnergy < 100) {
					{
						BackroomsModVariables.PlayerVariables _vars = entity.getData(BackroomsModVariables.PLAYER_VARIABLES);
						_vars.FlashlightEnergy = 100;
						_vars.markSyncDirty();
					}
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Battery: 100%"), true);
				}
			}
		}
	}
}