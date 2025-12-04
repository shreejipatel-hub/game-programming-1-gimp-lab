import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beam extends Trap
{
    private int timer = 0;
    private int interval = 120;
    private boolean active = true;
    /**
     * Act - do whatever the Beam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage Lazer = getImage();
        Lazer.scale(20, 220); 
        setImage(Lazer);
        timer++;
        
        // Toggle the laser state
        if (timer >= interval)
        {
            timer = 0;
            active = !active; // Switch on/off
            
            // Handle the VISUALS (Invisible vs Visible)
            if (active) {
                getImage().setTransparency(255); // Show it
            } else {
                getImage().setTransparency(0);   // Hide it
            }
        }
    }
    
    public boolean isDangerous()
    {
        return active;
    }
    public void interval1(){
        interval = 100;
    }
        public void interval2(){
        interval = 300;
    }
        public void interval3(){
        interval = 150;
    }
        public void interval4(){
        interval = 75;
    }
}
