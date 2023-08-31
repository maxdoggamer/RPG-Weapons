
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftrpgweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftrpgweapons.entity.DaggerOfcEntity;
import net.mcreator.minecraftrpgweapons.entity.DaggerEntity;
import net.mcreator.minecraftrpgweapons.entity.BattleSpearEntity;
import net.mcreator.minecraftrpgweapons.MinecraftRpgweaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftRpgweaponsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MinecraftRpgweaponsMod.MODID);
	public static final RegistryObject<EntityType<DaggerEntity>> DAGGER = register("projectile_dagger",
			EntityType.Builder.<DaggerEntity>of(DaggerEntity::new, MobCategory.MISC).setCustomClientFactory(DaggerEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BattleSpearEntity>> BATTLE_SPEAR = register("projectile_battle_spear",
			EntityType.Builder.<BattleSpearEntity>of(BattleSpearEntity::new, MobCategory.MISC).setCustomClientFactory(BattleSpearEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DaggerOfcEntity>> DAGGER_OFC = register("projectile_dagger_ofc",
			EntityType.Builder.<DaggerOfcEntity>of(DaggerOfcEntity::new, MobCategory.MISC).setCustomClientFactory(DaggerOfcEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
