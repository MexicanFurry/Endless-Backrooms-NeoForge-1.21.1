package net.mexicanfurry.backrooms.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mexicanfurry.backrooms.init.BackroomsModFluids;

public class NotWaterItem extends BucketItem {
	public NotWaterItem() {
		super(BackroomsModFluids.NOT_WATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}