import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Particle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Particle extends Actor
{
    private int speed;
    private int life;
    
    public Particle()
    {
        GreenfootImage img = new GreenfootImage(6, 6);
        img.setColor(new Color(255, 255, 255, 120)); // white, transparent
        img.fillOval(0, 0, 6, 6);
        setImage(img);

        // Random speed & lifespan
        speed = Greenfoot.getRandomNumber(2) + 1;
        life = Greenfoot.getRandomNumber(200) + 100;
    }
    /**
     * Act - do whatever the Particle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() - speed);  
        life--;
        
        if (life <= 0 || getY() < 0)
        {
            getWorld().removeObject(this);
        }    
        // Add your action code here.
    }
}
