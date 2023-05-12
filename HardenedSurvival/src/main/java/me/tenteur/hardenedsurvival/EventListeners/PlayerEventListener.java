package me.tenteur.hardenedsurvival.EventListeners;

import me.tenteur.hardenedsurvival.UtilityFunction;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;


public class PlayerEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        UtilityFunction.alertServer("§aSay hello to the player §c[§1" + event.getPlayer().getName() + "§c]§a.");
    }

    @EventHandler
    public void onPlayerBreak(BlockBreakEvent event) {
        Material blockType = event.getBlock().getType();
        int probabilityToDrop = (int) UtilityFunction.pickRandomNumber(0, 100, 0);
        if (event.getPlayer().getGameMode() != GameMode.CREATIVE) {
            if (blockType.equals(Material.IRON_ORE) && probabilityToDrop <= 50 || blockType.equals(Material.DEEPSLATE_IRON_ORE) && probabilityToDrop <= 50) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.COAL_ORE) && probabilityToDrop <= 50 || blockType.equals(Material.DEEPSLATE_COAL_ORE) && probabilityToDrop <= 50) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.GOLD_ORE) && probabilityToDrop <= 30 || blockType.equals(Material.DEEPSLATE_GOLD_ORE) && probabilityToDrop <= 30) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.DIAMOND_ORE) && probabilityToDrop <=20 || blockType.equals(Material.DEEPSLATE_DIAMOND_ORE) && probabilityToDrop <=20) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.REDSTONE_ORE) && probabilityToDrop <= 50 || blockType.equals(Material.DEEPSLATE_REDSTONE_ORE) && probabilityToDrop <= 50) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.LAPIS_ORE) && probabilityToDrop <= 20 || blockType.equals(Material.DEEPSLATE_LAPIS_ORE) && probabilityToDrop <= 20) {
                event.setDropItems(false);
            } else if (blockType.equals(Material.EMERALD_ORE) && probabilityToDrop <= 15 || blockType.equals(Material.DEEPSLATE_EMERALD_ORE) && probabilityToDrop <= 15) {
                event.setDropItems(false);
            }
        }
    }

    @EventHandler
    public void onPlayerClick(InventoryClickEvent event) {
        if (event.getView().getTitle() == "§0UPGRADE PICKAXE") {
            ItemStack clickedItem = event.getCurrentItem();
            UtilityFunction.alertServer("Item clicked");
            event.setCancelled(true);
        }
    }
}
