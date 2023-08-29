
package net.mcreator.minecraftrpgweapons.world.dimension;

@Mod.EventBusSubscriber
public class BanimentVoidDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class DimensionSpecialEffectsHandler {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0, 0, 0);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};

			event.register(new ResourceLocation("minecraft_rpgweapons:baniment_void"), customEffect);
		}

	}

}
