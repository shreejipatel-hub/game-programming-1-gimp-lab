import greenfoot.*;

public class Door extends Actor
{
    private boolean scaled = false;

    public void act()
    {
        // scale only once
        if (!scaled)
        {
            GreenfootImage img = getImage();
            img.scale(60, 60);
            setImage(img);
            scaled = true;
        }
    }

  
}
