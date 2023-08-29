
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftrpgweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.minecraftrpgweapons.item.ScimitarItem;
import net.mcreator.minecraftrpgweapons.item.KatanaOfcItem;
import net.mcreator.minecraftrpgweapons.item.KatanaItem;
import net.mcreator.minecraftrpgweapons.item.DaggerOfcItem;
import net.mcreator.minecraftrpgweapons.item.DaggerItem;
import net.mcreator.minecraftrpgweapons.item.BroadswordOfcItem;
import net.mcreator.minecraftrpgweapons.item.BroadswordItem;
import net.mcreator.minecraftrpgweapons.item.BattleshieldItem;
import net.mcreator.minecraftrpgweapons.item.BattleSpearItem;
import net.mcreator.minecraftrpgweapons.item.BattleAxeOfcItem;
import net.mcreator.minecraftrpgweapons.item.BattleAxeItem;
import net.mcreator.minecraftrpgweapons.MinecraftRpgweaponsMod;

public class MinecraftRpgweaponsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MinecraftRpgweaponsMod.MODID);
	public static final RegistryObject<Item> KATANA = REGISTRY.register("katana", () -> new KatanaItem());
	public static final RegistryObject<Item> DAGGER = REGISTRY.register("dagger", () -> new DaggerItem());
	public static final RegistryObject<Item> BROADSWORD = REGISTRY.register("broadsword", () -> new BroadswordItem());
	public static final RegistryObject<Item> BATTLE_AXE = REGISTRY.register("battle_axe", () -> new BattleAxeItem());
	public static final RegistryObject<Item> BATTLE_SPEAR = REGISTRY.register("battle_spear", () -> new BattleSpearItem());
	public static final RegistryObject<Item> KATANA_OFC = REGISTRY.register("katana_ofc", () -> new KatanaOfcItem());
	public static final RegistryObject<Item> DAGGER_OFC = REGISTRY.register("dagger_ofc", () -> new DaggerOfcItem());
	public static final RegistryObject<Item> BATTLESHIELD = REGISTRY.register("battleshield", () -> new BattleshieldItem());
	public static final RegistryObject<Item> BROADSWORD_OFC = REGISTRY.register("broadsword_ofc", () -> new BroadswordOfcItem());
	public static final RegistryObject<Item> BATTLE_AXE_OFC = REGISTRY.register("battle_axe_ofc", () -> new BattleAxeOfcItem());
	public static final RegistryObject<Item> SCIMITAR = REGISTRY.register("scimitar", () -> new ScimitarItem());
}
