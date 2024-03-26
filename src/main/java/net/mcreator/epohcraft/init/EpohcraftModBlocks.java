
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epohcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.epohcraft.block.SlimerBlock;
import net.mcreator.epohcraft.EpohcraftMod;

public class EpohcraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EpohcraftMod.MODID);
	public static final RegistryObject<Block> SLIMER = REGISTRY.register("slimer", () -> new SlimerBlock());
}
