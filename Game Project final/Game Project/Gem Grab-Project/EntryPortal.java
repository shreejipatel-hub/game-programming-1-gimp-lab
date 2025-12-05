import greenfoot.*;

public class EntryPortal extends Portals
{
    private GreenfootImage portalImage;

    public EntryPortal()
    {
        portalImage = new GreenfootImage(getImage());
        portalImage.scale(60, 60);
        setImage(portalImage);
    }

    public void act()
    {
        turn(3);

        if (canTeleport)
        {
            Player p = (Player)getOneIntersectingObject(Player.class);
            if (p != null)
            {
                ExitPortal exitPortal = (ExitPortal)getWorld().getObjects(ExitPortal.class).get(0);

                teleportPlayer(p, exitPortal);
            }
        }

        // re-enable teleport after player leaves portal
        if (getOneIntersectingObject(Player.class) == null)
        {
            canTeleport = true;
        }
    }
}
