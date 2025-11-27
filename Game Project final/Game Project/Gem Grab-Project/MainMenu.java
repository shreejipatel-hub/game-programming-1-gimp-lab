import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    private GreenfootSound music = new GreenfootSound("menumusic.mp3");

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1);
        music.playLoop();
        prepare();
    }

    public void act()
    {
        startParticles();
    }

    public void musicStart()
    {
        music.playLoop();
    }

    public void musicStop()
    {
        music.pause();
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
        PlayButton playButton = new PlayButton();
        addObject(playButton,128,379);
        playButton.setLocation(118,391);
        SkinsButton skinsButton = new SkinsButton();
        addObject(skinsButton,123,437);
        SettingsButton settingsButton = new SettingsButton();
        addObject(settingsButton,122,479);
        playButton.setLocation(142,378);
        skinsButton.setLocation(117,411);
        playButton.setLocation(99,367);
        settingsButton.setLocation(118,452);
        CreditsButton creditsButton = new CreditsButton();
        addObject(creditsButton,108,496);
        playButton.setLocation(125,353);
        playButton.setLocation(95,345);
        skinsButton.setLocation(114,397);
        settingsButton.setLocation(96,443);
        creditsButton.setLocation(89,489);
        skinsButton.setLocation(90,396);
        playButton.setLocation(84,348);
        settingsButton.setLocation(79,440);
        settingsButton.setLocation(86,438);
        playButton.setLocation(88,346);
        playButton.setLocation(92,345);
        playButton.setLocation(88,346);
        RedButton redButton = new RedButton();
        addObject(redButton,732,499);
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle,399,120);
    }
}
