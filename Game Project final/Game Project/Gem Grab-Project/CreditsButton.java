import greenfoot.*;

public class CreditsButton extends Button
{
    public CreditsButton()
    {
        GreenfootImage img = getImage();
        int w = img.getWidth();
        int h = img.getHeight();

        img.scale(w / 2, h / 2);      
        setImage(img);

        prepareHoverImages();  // IMPORTANT: prepare scaled hover image
    }

    public void act()
    {
        super.act();  // handle hover behavior

        if (Greenfoot.mouseClicked(this))
        {
            //create the destination world
            World credits = new CreditsWorld();
            //create the loading world and tell to go to the next world
            World loader = new LoadingWorld(credits);
            //switch to the loader
            Greenfoot.setWorld(loader);
        }
    }
}
