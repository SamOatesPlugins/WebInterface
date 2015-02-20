package com.samoatesgames.webinterface;

import com.samoatesgames.samoatesplugincore.plugin.SamOatesPlugin;
import org.bukkit.ChatColor;

/**
 * The main plugin class
 *
 * @author Sam Oates <sam@samoatesgames.com>
 */
public final class WebInterface extends SamOatesPlugin {

    /**
     * Class constructor
     */
    public WebInterface() {
        super("Webinterface", "WebInterface", ChatColor.DARK_GREEN);
    }

    /**
     * Called when the plugin is enabled
     */
    @Override
    public void onEnable() {
        super.onEnable();        
        this.logInfo("Succesfully enabled.");
    }

    /**
     * Register all configuration settings
     */
    public void setupConfigurationSettings() { }

    /**
     * Called when the plugin is disabled
     */
    @Override
    public void onDisable() {

    }
}
