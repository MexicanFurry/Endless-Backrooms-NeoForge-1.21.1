package net.mexicanfurry.backrooms.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;

public class Level0FluorescentLampLuminanceProcedure {
	public static double execute(BlockState blockstate) {
		double LightLevel = 0;
		if ((getPropertyByName(blockstate, "light_event") instanceof BooleanProperty _getbp1 && blockstate.getValue(_getbp1)) == true) {
			LightLevel = 15;
		} else {
			LightLevel = 0;
		}
		return LightLevel;
	}

	private static Property<?> getPropertyByName(BlockState state, String name) {
		for (Property<?> property : state.getProperties()) {
			if (property.getName().equals(name)) {
				return property;
			}
		}
		return null;
	}
}