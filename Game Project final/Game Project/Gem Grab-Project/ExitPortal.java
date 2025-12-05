import greenfoot.*;

public class ExitPortal extends Portals
{
    private GreenfootImage portalImage;

    public ExitPortal()
    {
        portalImage = new GreenfootImage(getImage());
        portalImage.scale(60, 60);
        setImage(portalImage);
    }

    public void act()
    {
        turn(-3);

        if (canTeleport)
        {
            Player p = (Player)getOneIntersectingObject(Player.class);
            if (p != null)
            {
                EntryPortal entryPortal = (EntryPortal)getWorld().getObjects(EntryPortal.class).get(0);

                teleportPlayer(p, entryPortal);
            }
        }

        if (getOneIntersectingObject(Player.class) == null)
        {
            canTeleport = true;
        }
    }
}
