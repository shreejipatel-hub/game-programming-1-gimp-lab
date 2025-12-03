import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class EntryPortal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntryPortal extends Portals
{
    private int teleportCooldown = 0;
    /**
     * Act - do whatever the EntryPortal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage EntryPortal = getImage();
        EntryPortal.scale(60, 60); 
        setImage(EntryPortal);
        turn(3);
    }
}
