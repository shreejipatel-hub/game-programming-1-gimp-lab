import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends LevelButton
{
    private int counter = 0;
    private int originalY;

    private int alpha = 150;     // starting transparency
    private int direction = 3;  // glow speed
    public Level1()
    {
        GreenfootImage img = getImage();
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
        int offset = (int)(Math.sin(counter * 0.1) * 10);
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
