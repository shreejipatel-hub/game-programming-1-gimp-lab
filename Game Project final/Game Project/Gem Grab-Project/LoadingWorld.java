import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LoadingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoadingWorld extends World
{
    private int timer;
    private World nextWorld;
    /**
     * Constructor for objects of class LoadingWorld.
     * 
     */
    public LoadingWorld(World targetWorld)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 463, 1);
        prepare();
        //store the world we want to go to
        nextWorld = targetWorld;
        //2 seconds *  60 acts = 600
        timer = 120;
    }
    
    public void act(){
        timer--;
        if (timer <= 0)
        {   
            Greenfoot.setWorld(nextWorld);
        }
        if (Greenfoot.getRandomNumber(100)<3){
            addObject(new GreenGem(), Greenfoot.getRandomNumber(852),1);
        }
        if (Greenfoot.getRandomNumber(100)<1){
            addObject(new RedGem(), Greenfoot.getRandomNumber(852),1);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Loading loading = new Loading();
        addObject(loading,281,208);
        loading.setLocation(425, 230);
        
    }
}
