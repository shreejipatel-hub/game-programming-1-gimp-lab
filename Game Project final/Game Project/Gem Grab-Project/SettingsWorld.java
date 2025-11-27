import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SettingsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SettingsWorld extends World
{
    
    
    /**
     * Constructor for objects of class SettingsWorld.
     * 
     */
    public SettingsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 420, 1);
        
        prepare();
    }
    
    public void act()
    {
        startParticles();
    }
     
    private void prepare()
    {
        MainMenuButton mainMenuButton = new MainMenuButton();
        addObject(mainMenuButton,128,379);
        mainMenuButton.setLocation(700,70);
        RedButton redButton = new RedButton();
        addObject(redButton,732,499);
        redButton.setLocation(750,390);
    }
    
    private void startParticles()
    {
        // 20% chance
        if (Greenfoot.getRandomNumber(5) == 0)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = getHeight() + 10; // start below screen
            addObject(new Particle(), x, y);
        }
    }
}
