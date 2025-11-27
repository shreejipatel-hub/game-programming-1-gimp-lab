import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditsWorld extends World
{

    /**
     * Constructor for objects of class CreditsWorld.
     * 
     */
    public CreditsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(821, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        startParticles();
    }
    
    private void startParticles()
    {
        // 20% chance
        if (Greenfoot.getRandomNumber(30) == 0)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = getHeight() + 10; // start below screen
            addObject(new Particle(), x, y);
        }
    }
    
       private void prepare()
    {
        MainMenuButton mainMenuButton = new MainMenuButton();
        addObject(mainMenuButton,128,379);
        mainMenuButton.setLocation(750,60);
    }
}
