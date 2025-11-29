import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** YOYOYO Test2 by Credo */
/**yoyoyo test 3 by shreeji
 * sup people test 4 shreeji
 */
/** Test3
/**
 * Main menu for the game.
 */
public class MainMenu extends World
{
    private static GreenfootSound music = new GreenfootSound("menumusic.mp3");
    private static double volume = 1.0;

    /**
     * Constructor for objects of class MainMenu.
     */
    public MainMenu()
    {    
        super(810, 540, 1);

        // Play menu music only once
        if (!music.isPlaying()) {
            music.playLoop();
        }
        music.setVolume((int)(volume * 100));

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
    
    public static void setMusicVolume(double v)
    {
        volume = v;
        music.setVolume((int)(volume * 100));
    }

    private void startParticles()
    {
        if (Greenfoot.getRandomNumber(5) == 0)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = getHeight() + 10;
            addObject(new Particle(), x, y);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * Add UI elements, buttons, and the volume slider.
     */
    private void prepare()
    {
        // --- TITLE ---
        GameTitle gameTitle = new GameTitle();
        addObject(gameTitle, 399, 120);

        // --- BUTTONS ---
        PlayButton playButton = new PlayButton();
        addObject(playButton, 392, 255);

        SkinsButton skinsButton = new SkinsButton();
        addObject(skinsButton, 393, 312);

        SettingsButton settingsButton = new SettingsButton();
        addObject(settingsButton, 392, 368);

        CreditsButton creditsButton = new CreditsButton();
        addObject(creditsButton, 395, 428);

        RedButton redButton = new RedButton();
        addObject(redButton, 732, 499);

        // --- VOLUME SLIDER LABEL ---
        VolumeLabel label = new VolumeLabel();      // use your volume.png image
        addObject(label, getWidth() / 2, 460);

        // --- VOLUME SLIDER BAR ---
        MusicSlider slider = new MusicSlider();
        addObject(slider, getWidth() / 2, 500);

        // --- VOLUME SLIDER KNOB ---
        MusicBar knob = new MusicBar(slider);

        // Position knob according to saved volume value
        int min = slider.getX() - 100;
        int xPosition = min + (int)(volume * 200);
        addObject(knob, xPosition, 500);
    }
}
