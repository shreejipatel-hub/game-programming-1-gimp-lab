import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThiefPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThiefPlayer extends Player
{
    /**
     * Act - do whatever the ThiefPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        
    }
    
    public ThiefPlayer()
    {
        GreenfootImage img = getImage();
        img.scale(50, 50);
        
        setImage(img);
    }
}
