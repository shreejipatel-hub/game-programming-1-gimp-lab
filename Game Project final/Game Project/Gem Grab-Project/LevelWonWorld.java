import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelWonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelWonWorld extends World
{
    private int timer = 300;
    /**
     * Constructor for objects of class LevelWonWorld.
     * 
     */
    public LevelWonWorld(String message, int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(612, 612, 1);

        GreenfootImage bg = getBackground();
        
        int titleSize = 60;
        int statSize = 40;

        GreenfootImage titleImg = new GreenfootImage(message, 60, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage levelStatImg = new GreenfootImage("Gems Collected: " + score, statSize, Color.BLACK, new Color(0,0,0,0));
        GreenfootImage totalStatImg = new GreenfootImage("Total Stash: " + Player.totalGems, statSize, Color.BLACK, new Color(0,0,0,0));
        int x = (getWidth() - titleImg.getWidth()) / 2;
        int y = (getHeight() - titleImg.getHeight()) / 2;

        bg.drawImage(titleImg, (getWidth() - titleImg.getWidth())/2, 100);
        bg.drawImage(levelStatImg, (getWidth() - levelStatImg.getWidth())/2, 200);
        bg.drawImage(totalStatImg, (getWidth() - totalStatImg.getWidth())/2, 250);
        prepare();
    }

    public void act()
    {
        timer--;

        if (timer<=0)
        {
            Greenfoot.setWorld(new LevelMenu());
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        RedButton redButton = new RedButton();
        addObject(redButton,304,215);
        redButton.setLocation(306,350);
    }
}
