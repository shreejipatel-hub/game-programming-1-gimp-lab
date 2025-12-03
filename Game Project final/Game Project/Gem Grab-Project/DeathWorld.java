import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeathWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeathWorld extends World
{
    private int timer = 180; // 180 acts = approx 3 seconds wait tim
    /**
     * Constructor for objects of class DeathWorld.
     * 
     */
    public DeathWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(784, 608, 1); 
        showText("YOU DIED", getWidth()/2, getHeight()/2);
        prepare();
    }
    
    public void act()
    {
        timer--;
        if(timer<=0)
        {
            Greenfoot.setWorld(new LevelMenu());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RedButton redButton = new RedButton();
        addObject(redButton,391,233);
    }
}
