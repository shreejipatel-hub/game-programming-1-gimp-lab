import greenfoot.*;

public class HealthBar extends Actor
{
    private GreenfootImage heart1 = new GreenfootImage("Heart_1.png");
    private GreenfootImage heart2 = new GreenfootImage("Heart_2.png");
    private GreenfootImage heart3 = new GreenfootImage("Heart_3.png");

    private int health = 3;

    public HealthBar()
    {
        updateImage();
    }

    public void setHealth(int h)
    {
        health = h;
        updateImage();
    }

    private void updateImage()
    {
        switch(health)
        {
            case 3: setImage(heart3); break;
            case 2: setImage(heart2); break;
            case 1: setImage(heart1); break;
            case 0: 
                setImage(new GreenfootImage(1,1)); 
                break;
        }
    }
}
