import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3World extends World
{
    private int levelNumber = 3;
    private HealthBar healthBar;
    private Counter gemCounter;

    /**
     * Constructor for objects of class Level3World.
     */
    public Level3World()
    {    
        super(840, 540, 1); 
        prepare();
    }

    public int getLevelNumber()
    {
        return levelNumber;
    }


    /**
     * Prepare the world for the start of the program.
     */
    private void prepare()
    {
        showText("Time to time yourself...", 400, 100);
    
        // --- HEALTH ---
        healthBar = new HealthBar(3);
        addObject(healthBar, 230, 20);
    
        // --- GEM COUNTER ---
        gemCounter = new Counter("Gems: ");
        addObject(gemCounter, 50, 25);
    
        // --- PLAYER ---
        Actor player = SkinManager.getSelectedPlayer();
        ((Player)player).health = 3;
        addObject(player, 30, 30);
    
        // ✅ Sync health bar with player
        getHealthBar().setHealth(3);
    
        // --- UI ---
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton, 756, 56);
    
        // --- PLATFORMS ---
        RotatedPlatform rotatedPlatform = new RotatedPlatform();
        addObject(rotatedPlatform, 150, 161);
    
        RotatedPlatform rotatedPlatform2 = new RotatedPlatform();
        addObject(rotatedPlatform2, 118, 248);
    
        RotatedPlatform rotatedPlatform3 = new RotatedPlatform();
        addObject(rotatedPlatform3, 117, 442);
    
        sPlatform sPlatform = new sPlatform();
        addObject(sPlatform, 546, 488);
    
        sPlatform sPlatform2 = new sPlatform();
        addObject(sPlatform2, 449, 443);
    
        sPlatform sPlatform3 = new sPlatform();
        addObject(sPlatform3, 353, 403);
    
        sPlatform sPlatform4 = new sPlatform();
        addObject(sPlatform4, 813, 499);
    
        sPlatform sPlatform5 = new sPlatform();
        addObject(sPlatform5, 737, 451);
    
        sPlatform sPlatform6 = new sPlatform();
        addObject(sPlatform6, 800, 393);
    
        sPlatform sPlatform7 = new sPlatform();
        addObject(sPlatform7, 719, 343);
    
        sPlatform sPlatform8 = new sPlatform();
        addObject(sPlatform8, 802, 301);
    
        sPlatform sPlatform9 = new sPlatform();
        addObject(sPlatform9, 705, 250);
    
        sPlatform sPlatform10 = new sPlatform();
        addObject(sPlatform10, 792, 203);
    
        sPlatform sPlatform11 = new sPlatform();
        addObject(sPlatform11, 706, 159);
    
        sPlatform sPlatform12 = new sPlatform();
        addObject(sPlatform12, 792, 114);
    
        sPlatform sPlatform13 = new sPlatform();
        addObject(sPlatform13, 80, 46);
    
        sPlatform sPlatform14 = new sPlatform();
        addObject(sPlatform14, 522, 301);
    
        sPlatform sPlatform15 = new sPlatform();
        addObject(sPlatform15, 92, 479);
    
        // --- PORTALS ---
        EntryPortal entryPortal = new EntryPortal();
        addObject(entryPortal, 67, 433);
    
        ExitPortal exitPortal = new ExitPortal();
        addObject(exitPortal, 239, 56);
    
        // --- TRAPS ---
        Spike spike = new Spike();
        addObject(spike, 15, 509);
    
        Spike spike2 = new Spike();
        addObject(spike2, 68, 516);
    
        Spike spike3 = new Spike();
        addObject(spike3, 834, 377);
    
        Spike spike4 = new Spike();
        addObject(spike4, 832, 280);
    
        Spike spike5 = new Spike();
        addObject(spike5, 833, 187);
    
        Beam beam = new Beam();
        addObject(beam, 374, 474);
    
        Beam beam2 = new Beam();
        addObject(beam2, 453, 473);
    
        Beam beam3 = new Beam();
        addObject(beam3, 535, 476);
    
        Beam beam4 = new Beam();
        addObject(beam4, 617, 481);
    
        // --- GEMS ---
        Gem1 gem1 = new Gem1();
        addObject(gem1, 75, 248);
    
        Gem2 gem2 = new Gem2();
        addObject(gem2, 530, 232);
    
        Gem3 gem3 = new Gem3();
        addObject(gem3, 796, 84);
    
        // --- DOOR ---
        Door door = new Door();
        addObject(door, 540, 300);
    
        sPlatform3.setLocation(338, 402);
    }

    public HealthBar getHealthBar()
    {
        return healthBar;  // player will use this
    }
}
