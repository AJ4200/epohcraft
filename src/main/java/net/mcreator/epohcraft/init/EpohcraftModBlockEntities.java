
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epohcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.epohcraft.block.entity.SlimerBlockEntity;
import net.mcreator.epohcraft.EpohcraftMod;

public class EpohcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, EpohcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SLIMER = register("slimer", EpohcraftModBlocks.SLIMER, SlimerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
