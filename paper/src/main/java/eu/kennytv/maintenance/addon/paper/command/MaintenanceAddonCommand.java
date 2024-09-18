package eu.kennytv.maintenance.addon.paper.command;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class MaintenanceAddonCommand implements CommandExecutor {

    @Override
    public boolean onCommand(final @NotNull CommandSender sender, final @NotNull Command command, final @NotNull String s, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }

        final OfflinePlayer player = (OfflinePlayer) sender;
        final String server = args.length != 0 ? args[0] : "server1";
        sender.sendMessage(PlaceholderAPI.setPlaceholders(player, "Global status: %maintenance_status% §r- Status of " + server + ": %maintenance_server_" + server + "%"));
        return true;
    }
}
