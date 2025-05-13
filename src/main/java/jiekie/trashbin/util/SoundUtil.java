package jiekie.trashbin.util;

import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;

public class SoundUtil {
    public static void playTrashCanLid(Player player) {
        player.playSound(player.getLocation(), "minecraft:jk.trash_can_lid", SoundCategory.MASTER, 0.3f, 1.0f);
    }
}
