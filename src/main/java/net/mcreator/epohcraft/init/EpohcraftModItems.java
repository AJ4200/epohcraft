
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epohcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.epohcraft.item.SlimerchunkerItem;
import net.mcreator.epohcraft.item.SlimechunkItem;
import net.mcreator.epohcraft.EpohcraftMod;

public class EpohcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EpohcraftMod.MODID);
	public static final RegistryObject<Item> SLIMECHUNK = REGISTRY.register("slimechunk", () -> new SlimechunkItem());
	public static final RegistryObject<Item> SLIMER = block(EpohcraftModBlocks.SLIMER);
	public static final RegistryObject<Item> SLIMERCHUNKER = REGISTRY.register("slimerchunker", () -> new SlimerchunkerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
