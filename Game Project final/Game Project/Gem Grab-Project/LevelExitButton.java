import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelExitButton extends Button
{
    
    public LevelExitButton()
    {
        GreenfootImage img = getImage();
        int w = img.getWidth();
        int h = img.getHeight();

        img.scale(w / 8, h / 8);      
        setImage(img);

        prepareHoverImages();  // IMPORTANT: prepare scaled hover image
    }
    /**
     * Act - do whatever the LevelExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();  // handle hover behavior

        if (Greenfoot.mouseClicked(this))
        {
            //create the destination world
            World mainmenu = new MainMenu();
            //create the loading world and tell to go to the next world
            World loader = new LoadingWorld(mainmenu);
            //switch to the loader
            Greenfoot.setWorld(loader);
            
        }
            
    }
}
