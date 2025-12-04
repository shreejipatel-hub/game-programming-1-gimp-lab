import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Trap
{
     private int speed = 2;
     private int direction = 1;
    /**
     * Act - do whatever the Sword wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(-20);
        moveHorizontally();
        
        checkEdge();
        
        GreenfootImage GreenGem = getImage();
        GreenGem.scale(15, 60); 
        setImage(GreenGem);
    }
    
     private void checkEdge()
    {
        if  (isAtEdge())
        {
            direction *= -1; // Reverse direction
        }
    }
       private void moveHorizontally()
    {
        int newX = getX() + (speed * direction);
        setLocation(newX, getY());
    }
    
    public void fasterSpeed(){
        speed= 5;
    }
}
