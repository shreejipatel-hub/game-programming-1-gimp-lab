import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SkinsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SkinsWorld extends World
{

    /**
     * Constructor for objects of class SkinsWorld.
     * 
     */
    public SkinsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 467, 1); 
        prepare();
    }
    
    public void act()
    {
        startParticles();
    }
    
    private void startParticles()
    {
        // 20% chance
        if (Greenfoot.getRandomNumber(10) == 0)
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
        mainMenuButton.setLocation(700,70);
        RedButton redButton = new RedButton();
        addObject(redButton,732,499);
        redButton.setLocation(750,430);
        ThiefSkin thiefSkin = new ThiefSkin();
        addObject(thiefSkin, 128, 379);
        thiefSkin.setLocation(243,0);
        GenericThiefSkin genericThiefSkin = new GenericThiefSkin();
        addObject(genericThiefSkin,128,379);
        genericThiefSkin.setLocation(243,410);
        RedSkin redSkin = new RedSkin();
        addObject(redSkin, 128, 379);
        redSkin.setLocation(425,380);
        ClassicSkin classicSkin = new ClassicSkin();
        addObject(classicSkin,128,379);
        classicSkin.setLocation(416,415);
        Locked lockedIcon = new Locked();
        addObject(lockedIcon,573,350);
        //lockedIcon.setLocation(573,300);
        LockedSkin lockedSkin = new LockedSkin();
        addObject(lockedSkin,128,379);
        lockedSkin.setLocation(573,410);
    }
}
