import greenfoot.*;

public class HealthBar extends Actor
{
    private GreenfootImage heart1 = new GreenfootImage("Heart_1.png");
    private GreenfootImage heart2 = new GreenfootImage("Heart_2.png");
    private GreenfootImage heart3 = new GreenfootImage("Heart_3.png");

    private int maxHealth = 3;

    public HealthBar(int max)
    {
        maxHealth = max;
        setHealth(maxHealth);   // start full
    }

    public void setHealth(int health)
    {
        if (health >= 3 && maxHealth >= 3)
            setImage(heart3);
        else if (health == 2 && maxHealth >= 2)
            setImage(heart2);
        else if (health == 1)
            setImage(heart1);
        else
            setImage(new GreenfootImage(1,1));
    }

    public int getMaxHealth()
    {
        return maxHealth;
    }
}
