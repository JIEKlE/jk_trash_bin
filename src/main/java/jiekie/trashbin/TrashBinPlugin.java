package jiekie.trashbin;

import jiekie.trashbin.command.TrashBinCommand;
import jiekie.trashbin.event.InventoryEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TrashBinPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // command
        getCommand("쓰레기통").setExecutor(new TrashBinCommand(this));

        // event
        getServer().getPluginManager().registerEvents(new InventoryEvent(), this);

        getLogger().info("쓰레기통 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
