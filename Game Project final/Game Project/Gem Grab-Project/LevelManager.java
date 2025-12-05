import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class LevelManager  
{
    public static int currentLevel = 1;

    public static void goToNextLevel()
    {
        currentLevel++;

        switch (currentLevel)
        {
            case 1: Greenfoot.setWorld(new Level1World()); break;
            case 2: Greenfoot.setWorld(new Level2World()); break;
            case 3: Greenfoot.setWorld(new Level3World()); break;
            case 4: Greenfoot.setWorld(new Level4World()); break;
            case 5: Greenfoot.setWorld(new Level5World()); break;

            default:
                Greenfoot.setWorld(new MainMenu()); // or "You Win" world
                break;
        }
    }
}
