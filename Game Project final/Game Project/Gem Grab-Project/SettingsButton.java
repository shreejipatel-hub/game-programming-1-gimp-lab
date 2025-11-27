import greenfoot.*;  // World, Actor, GreenfootImage, Greenfoot, MouseInfo

public class SettingsButton extends Button
{
    public SettingsButton()
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
            World settings = new SettingsWorld();
            //create the loading world and tell to go to the next world
            World loader = new LoadingWorld(settings);
            //switch to the loader
            Greenfoot.setWorld(loader);
        }
    }
}
