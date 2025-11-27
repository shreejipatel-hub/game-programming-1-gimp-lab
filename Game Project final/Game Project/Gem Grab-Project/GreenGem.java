import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenGem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenGem extends LoadingScreenDeco
{
    public GreenGem(){
        GreenfootImage GreenGem = getImage();
        GreenGem.scale(75, 75); 
        setImage(GreenGem);
    }
    
    /**
     * Act - do whatever the GreenGem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() +3);
        turn(1);
        if (getY() == 399) {
            getWorld().removeObject(this);
        }
    }
}
