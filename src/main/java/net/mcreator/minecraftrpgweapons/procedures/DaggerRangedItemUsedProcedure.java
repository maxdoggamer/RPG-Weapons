package net.mcreator.minecraftrpgweapons.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DaggerRangedItemUsedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
	}
}
