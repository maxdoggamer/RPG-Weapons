
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftrpgweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.minecraftrpgweapons.enchantment.BaningEnchantment;
import net.mcreator.minecraftrpgweapons.MinecraftRpgweaponsMod;

public class MinecraftRpgweaponsModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, MinecraftRpgweaponsMod.MODID);
	public static final RegistryObject<Enchantment> BANING = REGISTRY.register("baning", () -> new BaningEnchantment());
}
