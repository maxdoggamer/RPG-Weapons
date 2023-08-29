
package net.mcreator.minecraftrpgweapons.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class ScimitarItem extends SwordItem {
	public ScimitarItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
