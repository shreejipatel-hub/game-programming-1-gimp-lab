import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem3 extends Gems
{
    /**
     * Act - do whatever the Gem3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage Gem3 = getImage();
        Gem3.scale(40, 40); 
        setImage(Gem3);
        
        super.floatUpDown();
        super.glow();
    }
}
