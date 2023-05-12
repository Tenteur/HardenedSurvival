package me.tenteur.hardenedsurvival.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class UpgradeCommand implements CommandExecutor {

    ItemStack mineralLuck = new ItemStack(Material.COAL_ORE, 1);

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = ((Player) sender).getPlayer();
            player.sendMessage("You wrote the command 'upgrade'");
            if (player.getItemInHand().getType() == new ItemStack(Material.NETHERITE_SWORD).getType()) {
                Inventory myInventory = Bukkit.createInventory(null, 54, "§0UPGRADE PICKAXE");
                myInventory.setItem(0, mineralLuck);
                player.openInventory(myInventory);
            }
        }
        return false;
    }
}