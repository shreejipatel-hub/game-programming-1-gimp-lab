import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelMenu extends World
{

    /**
     * Constructor for objects of class LevelMenu.
     * 
     */
    public LevelMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        startParticles();
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Level1 level1 = new Level1();
        addObject(level1,141,99);
        Level2 level2 = new Level2();
        addObject(level2,672,91);
        Level3 level3 = new Level3();
        addObject(level3,244,219);
        Level4 level4 = new Level4();
        addObject(level4,654,219);
        Level5 level5 = new Level5();
        addObject(level5,400,145);
        MainMenuButton mainMenuButton = new MainMenuButton();
        addObject(mainMenuButton,690,25);
        mainMenuButton.setLocation(732,29);
        RedButton redButton = new RedButton();
        addObject(redButton,750,350);
        
    }
}
