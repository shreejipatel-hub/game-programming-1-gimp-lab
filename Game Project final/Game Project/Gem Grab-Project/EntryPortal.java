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
    }
}
