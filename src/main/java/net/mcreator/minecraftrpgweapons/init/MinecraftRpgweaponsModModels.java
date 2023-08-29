
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftrpgweapons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.minecraftrpgweapons.client.model.ModelSpear;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MinecraftRpgweaponsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSpear.LAYER_LOCATION, ModelSpear::createBodyLayer);
	}
}
