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
    public LevelWonWorld(String message)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(612, 612, 1);

        GreenfootImage bg = getBackground();

        GreenfootImage textImg = new GreenfootImage(message, 60, Color.BLACK, new Color(0, 0, 0, 0));

        int x = (getWidth() - textImg.getWidth()) / 2;
        int y = (getHeight() - textImg.getHeight()) / 2;

        bg.drawImage(textImg, x, y);

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
    }
}
