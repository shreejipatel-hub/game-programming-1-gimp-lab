import greenfoot.*;

public class RedPlayer extends Player
{
    public RedPlayer()
    {
        // Load original image
        GreenfootImage img = getImage();

        img.scale(img.getWidth() / 2, img.getHeight() / 2);

        setImage(img);
    }

    public void act()
    {
        super.act();
    }
}
