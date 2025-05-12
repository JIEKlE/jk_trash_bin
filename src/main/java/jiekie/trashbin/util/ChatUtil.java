package jiekie.trashbin.util;

import org.bukkit.command.CommandSender;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "\uA003 ";
    }

    public static void notPlayer(CommandSender sender) {
        sender.sendMessage(getWarnPrefix() + "플레이어가 아닙니다.");
    }
}
