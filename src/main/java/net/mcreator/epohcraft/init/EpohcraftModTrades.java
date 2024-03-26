
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.epohcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EpohcraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == EpohcraftModVillagerProfessions.EXCHANGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.DIAMOND, 6), new ItemStack(Blocks.NETHERRACK, 3), new ItemStack(Items.NETHERITE_SCRAP), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.DIAMOND_BLOCK), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.NETHERITE_BLOCK), new ItemStack(Blocks.CHORUS_FLOWER), new ItemStack(Items.NETHER_STAR), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT, 64), new ItemStack(Blocks.DIAMOND_BLOCK, 64), new ItemStack(Blocks.CHORUS_FLOWER), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),

					new ItemStack(Blocks.END_STONE), 10, 5, 0.05f));
		}
	}
}
