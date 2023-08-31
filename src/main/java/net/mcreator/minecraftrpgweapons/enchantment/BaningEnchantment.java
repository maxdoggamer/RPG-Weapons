
package net.mcreator.minecraftrpgweapons.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class BaningEnchantment extends Enchantment {
	public BaningEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.MOB_LOOTING).contains(ench);
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
