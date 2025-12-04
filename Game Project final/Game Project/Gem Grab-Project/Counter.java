import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    private int value = 0;
    private int totalGems = 0;
    private String Count;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Counter(String Count)
    {
        this.Count = Count;
        updateImage();
        
    }
    
    public void add(int amount){
        value += amount;
        updateImage();
    }
    
    private void updateImage(){
        GreenfootImage pic = new GreenfootImage(400, 10);
        setImage(pic);
        
    }
    public int getValue(){
        return value;
    }
}
