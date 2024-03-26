
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.epohcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.epohcraft.world.inventory.ConvertermenuMenu;
import net.mcreator.epohcraft.EpohcraftMod;

public class EpohcraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EpohcraftMod.MODID);
	public static final RegistryObject<MenuType<ConvertermenuMenu>> CONVERTERMENU = REGISTRY.register("convertermenu", () -> IForgeMenuType.create(ConvertermenuMenu::new));
}
