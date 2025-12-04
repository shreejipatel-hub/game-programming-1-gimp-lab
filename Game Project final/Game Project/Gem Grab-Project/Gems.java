import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//testing nifhs
/**
 * Write a description of class Gems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gems extends Actor
{
    /**
     * Act - do whatever the Gems wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkTouch();
        
    }
    
    private void checkTouch(){
        if (isTouching(Player.class)){
            Level1World world = (Level1World) getWorld();
        
            
            
            world.getGemCounter().add(1);
            
            getWorld().removeObject(this);
        }

    }
}
