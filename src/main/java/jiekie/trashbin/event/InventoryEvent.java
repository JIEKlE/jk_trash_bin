package jiekie.trashbin.event;

import jiekie.trashbin.model.TrashBinInventoryHolder;
import jiekie.trashbin.util.SoundUtil;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public class InventoryEvent implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryCloseEvent e) {
        HumanEntity humanEntity = e.getPlayer();
        if(!(humanEntity instanceof Player player)) return;

        Inventory inventory = e.getInventory();
        if(inventory == null) return;
        if(!(inventory.getHolder() instanceof TrashBinInventoryHolder)) return;

        SoundUtil.playTrashCanLid(player);
    }
}
