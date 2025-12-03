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
    }
}
