package me.tenteur.hardenedsurvival.CustomEnchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public abstract class CustomEnchantmentManager extends Enchantment {

    public CustomEnchantmentManager(@NotNull NamespacedKey key) {
        super(key);
    }

    public abstract boolean canEnchantItem(ItemStack item);

    public abstract EnchantmentTarget getItemTarget();

    public abstract int getMaxLevel();

    public abstract String getName();

    public abstract int getEnchantmentTableMinimumLevel();

    public abstract int getEnchantmentTableMaximumLevel();

    public abstract double getEnchantmentChance();

    @Override
    public boolean conflictsWith(Enchantment other) {
        return false;
    }

    @Override
    public int getStartLevel() {
        return 1;
    }

    @Override
    public boolean isCursed() {
        return false;
    }

    @Override
    public boolean isTreasure() {
        return false;
    }

}
