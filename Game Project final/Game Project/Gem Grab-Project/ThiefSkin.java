import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThiefSkin extends SkinsDeco
{
    private int counter = 0;
    private int originalY;

    private int alpha = 150;     // starting transparency
    private int direction = 3;   // glow speed
    
    public ThiefSkin()
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
    
        /**
     * Act - do whatever the RedSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
