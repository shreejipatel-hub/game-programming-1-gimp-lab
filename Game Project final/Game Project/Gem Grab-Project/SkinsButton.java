import greenfoot.*;  // World, Actor, GreenfootImage, Greenfoot, MouseInfo

public class SkinsButton extends Button
{
    public SkinsButton()
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
        super.act();  //hover behavior

        if (Greenfoot.mouseClicked(this))
        {
            //create the destination world
            World skins = new SkinsWorld();
            //create the loading world and tell to go to the next world
            World loader = new LoadingWorld(skins);
            //switch to the loader
            Greenfoot.setWorld(loader);
        }
    }
}
