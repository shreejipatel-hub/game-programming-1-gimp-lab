import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sPlatform extends Platform
{
    /**
     * Act - do whatever the sPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage sPlatform = getImage();
        sPlatform.scale(100, 15); 
        setImage(sPlatform);
    }
}
