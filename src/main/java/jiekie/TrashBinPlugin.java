package jiekie;

import jiekie.command.TrashBinCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TrashBinPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // 명령어 등록
        getCommand("쓰레기통").setExecutor(new TrashBinCommand(this));

        getLogger().info("쓰레기통 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
