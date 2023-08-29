
package net.mcreator.minecraftrpgweapons.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BattleAxeOfcItem extends AxeItem {
	public BattleAxeOfcItem() {
		super(new Tier() {
			public int getUses() {
				return 2000;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -3.5f, new Item.Properties());
	}
}
