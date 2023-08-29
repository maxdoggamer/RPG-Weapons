
package net.mcreator.minecraftrpgweapons.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class KatanaItem extends SwordItem {
	public KatanaItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, 0f, new Item.Properties());
	}
}
