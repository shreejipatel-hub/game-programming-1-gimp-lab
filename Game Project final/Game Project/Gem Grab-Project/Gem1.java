import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem1 extends Gems
{
    /**
     * Act - do whatever the Gem1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage Gem1 = getImage();
        Gem1.scale(40, 40); 
        setImage(Gem1);
    }
}
