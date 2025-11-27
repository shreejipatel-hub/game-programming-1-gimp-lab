import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedGem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedGem extends LoadingScreenDeco
{
            public RedGem() {
        GreenfootImage RedGem = getImage();
        RedGem.scale(75, 75); 
        setImage(RedGem);
    }
    
    /**
     * Act - do whatever the RedGem wants to do. This method is called whenever
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
