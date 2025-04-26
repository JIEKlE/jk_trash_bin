package jiekie.command;

import jiekie.TrashBinPlugin;
import jiekie.util.ChatUtil;
import jiekie.util.GuiUtil;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class TrashBinCommand implements CommandExecutor {
    private final TrashBinPlugin plugin;

    public TrashBinCommand(TrashBinPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)) {
            ChatUtil.notPlayer(sender);
            return true;
        }

        Player player = (Player) sender;
        Inventory inventory = Bukkit.createInventory(null, 54, GuiUtil.CHEST_NAME);
        player.openInventory(inventory);

        return true;
    }
}
