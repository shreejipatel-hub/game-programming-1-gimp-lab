import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//testing nifhs
/**
 * Write a description of class Gems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gems extends Actor
{
    protected int counter = 0;
    protected int originalY;

    protected int alpha = 150;     // starting transparency
    protected int direction = 3;   // glow speed

    /**
     * Act - do whatever the Gems wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
     {
        floatUpDown();
        glow();
    }
    protected void floatUpDown()
    {
        counter++;
        int offset = (int)(Math.sin(counter * 0.1) * 10);
        
    }
    protected void addedToWOrld(World world) {
       originalY = getY(); 
    }
    protected void glow()
    {
        alpha += direction;

        if (alpha >= 255 || alpha <= 120)
        {
            direction = -direction;
        }

        getImage().setTransparency(alpha);
    }
}
