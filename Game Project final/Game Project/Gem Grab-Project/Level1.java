import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 1 selection button.
 */
public class Level1 extends LevelButton
{
    private int counter = 0;
    private int originalY;

    private int alpha = 150;     // starting transparency
    private int direction = 3;   // glow speed

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
        checkClick(); // <-- ADDED
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

        if (alpha >= 255 || alpha <= 120)
        {
            direction = -direction;
        }

        getImage().setTransparency(alpha);
    }

    /**
     * When clicked, go to Level1World.
     */
    private void checkClick()
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level1World());
        }
    }
}
