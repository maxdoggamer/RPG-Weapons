
package net.mcreator.minecraftrpgweapons.enchantment;

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
