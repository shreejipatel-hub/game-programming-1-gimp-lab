import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gem2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gem2 extends Gems
{
    /**
     * Act - do whatever the Gem2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        GreenfootImage Gem2 = getImage();
        Gem2.scale(40, 40); 
        setImage(Gem2);
        
        super.floatUpDown();
        super.glow();
    }
}
