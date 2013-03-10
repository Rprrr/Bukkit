package org.bukkit.scoreboard;

import org.bukkit.ChatColor;

public interface Team {

    public String getName();

    public String getDisplayName();

    public void setDisplayName(String name);

    /*
     * OPTIONS
     */
    public ChatColor getColor();

    public void setColor(ChatColor color);

    public boolean getFriendlyFire();

    public void setFriendlyFire(boolean friendlyfire);

    public boolean getSeeFriendlyInvisibles();

    public void setSeeFriendlyInvisibles(boolean seeFriendlyInvisibles);
}
