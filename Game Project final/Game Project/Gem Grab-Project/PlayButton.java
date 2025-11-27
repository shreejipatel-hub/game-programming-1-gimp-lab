import greenfoot.*;  // World, Actor, GreenfootImage, Greenfoot, MouseInfo

public class PlayButton extends Button
{
    public PlayButton()
    {
        GreenfootImage img = getImage();
        int w = img.getWidth();
        int h = img.getHeight();

        img.scale(w / 2, h / 2);
        setImage(img);

        prepareHoverImages();
    }

    public void act()
    {
        super.act();  // hover behavior

        if (Greenfoot.mouseClicked(this))
        {
            //create the destination world
            World levels = new LevelMenu();
            //create the loading world and tell to go to the next world
            World loader = new LoadingWorld(levels);
            //switch to the loader
            Greenfoot.setWorld(loader);
        }
    }
}
