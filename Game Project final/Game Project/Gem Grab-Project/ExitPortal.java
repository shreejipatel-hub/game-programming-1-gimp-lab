import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitPortal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitPortal extends Portals
{
    /**
     * Act - do whatever the ExitPortal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage EntryPortal = getImage();
        EntryPortal.scale(60, 60); 
        setImage(EntryPortal);
        turn(-3);
    }
}
