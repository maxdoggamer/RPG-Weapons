
package net.mcreator.minecraftrpgweapons.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class KatanaOfcItem extends SwordItem {
	public KatanaOfcItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 3, -1.3f, new Item.Properties());
	}
}
