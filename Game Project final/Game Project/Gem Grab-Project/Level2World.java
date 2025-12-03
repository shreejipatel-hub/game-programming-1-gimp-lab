import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2World extends World
{

    /**
     * Constructor for objects of class Level2World.
     * 
     */
    public Level2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1); 
        prepare();
    }
    
    private void prepare(){
        // 1. Get selected player from SkinManager
        Actor player = SkinManager.getSelectedPlayer();

        // 2. Spawn player at starting position
        addObject(player, 20, 10);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton,756,56);
        levelExitButton.setLocation(779,26);
        levelExitButton.setLocation(775,22);
        levelExitButton.setLocation(784,21);
        PlatForm2 platForm2 = new PlatForm2();
        addObject(platForm2,617,531);
        PlatForm2 platForm22 = new PlatForm2();
        addObject(platForm22,327,533);
        PlatForm2 platForm23 = new PlatForm2();
        addObject(platForm23,179,535);
        PlatForm1 platForm1 = new PlatForm1();
        addObject(platForm1,6,42);
        RotatedPlatform rotatedPlatform = new RotatedPlatform();
        addObject(rotatedPlatform,307,227);
        rotatedPlatform.setLocation(311,222);
        rotatedPlatform.setLocation(251,138);
        platForm1.setLocation(252,55);
        rotatedPlatform.setLocation(305,113);
        platForm1.setLocation(138,43);
        rotatedPlatform.setLocation(238,127);
        rotatedPlatform.setLocation(238,197);
        RotatedPlatform rotatedPlatform2 = new RotatedPlatform();
        addObject(rotatedPlatform2,191,354);
        rotatedPlatform2.setLocation(225,249);
        rotatedPlatform.setLocation(235,256);
        rotatedPlatform.setLocation(239,255);
        rotatedPlatform.setLocation(239,258);
        rotatedPlatform.setLocation(253,201);
        rotatedPlatform.setLocation(239,180);
        rotatedPlatform2.setLocation(239,429);
        rotatedPlatform2.setLocation(259,457);
        rotatedPlatform2.setLocation(234,463);
        rotatedPlatform2.setLocation(242,248);
        rotatedPlatform.setLocation(238,27);
        rotatedPlatform.setLocation(241,177);
        rotatedPlatform.setLocation(243,334);
        rotatedPlatform.setLocation(239,136);
        rotatedPlatform.setLocation(239,96);
        rotatedPlatform2.setLocation(235,230);
        rotatedPlatform2.setLocation(244,381);
        rotatedPlatform2.setLocation(238,334);
        rotatedPlatform2.setLocation(239,291);
    }
}
