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
    }
}
