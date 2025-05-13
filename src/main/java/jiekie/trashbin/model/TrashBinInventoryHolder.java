package jiekie.trashbin.model;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public record TrashBinInventoryHolder(String name) implements InventoryHolder {
    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }
}
