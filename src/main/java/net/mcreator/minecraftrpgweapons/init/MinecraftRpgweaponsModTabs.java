
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftrpgweapons.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.minecraftrpgweapons.MinecraftRpgweaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftRpgweaponsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftRpgweaponsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MinecraftRpgweaponsModItems.KATANA.get());
			tabData.accept(MinecraftRpgweaponsModItems.DAGGER.get());
			tabData.accept(MinecraftRpgweaponsModItems.BROADSWORD.get());
			tabData.accept(MinecraftRpgweaponsModItems.BATTLE_SPEAR.get());
			tabData.accept(MinecraftRpgweaponsModItems.KATANA_OFC.get());
			tabData.accept(MinecraftRpgweaponsModItems.DAGGER_OFC.get());
			tabData.accept(MinecraftRpgweaponsModItems.BATTLESHIELD.get());
			tabData.accept(MinecraftRpgweaponsModItems.BROADSWORD_OFC.get());
			tabData.accept(MinecraftRpgweaponsModItems.SCIMITAR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MinecraftRpgweaponsModItems.BATTLE_AXE.get());
			tabData.accept(MinecraftRpgweaponsModItems.BATTLE_AXE_OFC.get());
		}
	}
}
