import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameTitle extends MenuDeco
{
    private int counter = 0;
    private int originalY;

    private int alpha = 150;     // starting transparency
    private int direction = 3;   // glow speed

    public GameTitle()
    {
        GreenfootImage img = getImage();
        img.scale(200, 220);
        img.setTransparency(alpha);
        setImage(img);
    }

    protected void addedToWorld(World w)
    {
        originalY = getY();
    }

    public void act()
    {
        floatUpDown();
        glow();
    }

    private void floatUpDown()
    {
        counter++;
        int offset = (int)(Math.sin(counter * 0.1) * 5);
        setLocation(getX(), originalY + offset);
    }

    private void glow()
    {
        alpha += direction;

        // bounce between dim and bright
        if (alpha >= 255 || alpha <= 120)
        {
            direction = -direction;
        }

        getImage().setTransparency(alpha);
    }
}
