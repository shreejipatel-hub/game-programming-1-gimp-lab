import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends LevelButton
{
private int counter = 0;
    private int originalY;

    private int alpha = 150;     // starting transparency
    private int direction = 3;  // glow speed
      

    public Level4()
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
        checkClick();
    }

    private void floatUpDown()
    {
        counter++;
        int offset = (int)(Math.sin(counter * 0.1) * 4);
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
    
               /**
     * When clicked, go to Level 4 World.
     */
    private void checkClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level4World());
        }
    }
}
