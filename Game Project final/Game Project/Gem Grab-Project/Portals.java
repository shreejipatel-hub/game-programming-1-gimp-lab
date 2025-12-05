import greenfoot.*;

public class Portals extends Actor
{
    protected boolean canTeleport = true;  // prevents infinite loops

    public void act()
    {
        // nothing here – subclasses handle visuals
    }

    /**
     * Teleport a player to another portal.
     */
    protected void teleportPlayer(Player p, Portals destination)
    {
        if (destination == null) return;

        // Move player to exit portal position
        p.setLocation(destination.getX(), destination.getY());

        // Cooldown so player cannot instantly teleport back
        p.ySpeed = 0;
        canTeleport = false;
        destination.canTeleport = false;
    }
}
