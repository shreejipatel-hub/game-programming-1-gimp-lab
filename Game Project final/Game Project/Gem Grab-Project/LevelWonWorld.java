import greenfoot.*;

public class LevelWonWorld extends World
{
    private int timer = 180;  // 3 seconds

   

    // Constructor used by Player: accepts message + score
    public LevelWonWorld(String message, int score)
    {      
        
        super(612, 612, 1);
        
        MainMenu.stopMenuMusic();
        GreenfootSound celebration = new GreenfootSound("celebration.mp3");
        celebration.play();

        GreenfootImage bg = getBackground();

        int titleSize = 60;
        int statSize  = 40;

        // Draw text
        GreenfootImage titleImg = new GreenfootImage(message, titleSize, Color.BLACK, new Color(0,0,0,0));
        GreenfootImage scoreImg = new GreenfootImage("Gems Collected: " + score, statSize, Color.BLACK, new Color(0,0,0,0));
        GreenfootImage totalImg = new GreenfootImage("Total Stash: " + Player.totalGems, statSize, Color.BLACK, new Color(0,0,0,0));

        bg.drawImage(titleImg, (getWidth() - titleImg.getWidth())/2, 120);
        bg.drawImage(scoreImg, (getWidth() - scoreImg.getWidth())/2, 220);
        bg.drawImage(totalImg, (getWidth() - totalImg.getWidth())/2, 270);
    }

    public void act()
    {
        timer--;
        if (timer <= 0)
        {
            Greenfoot.setWorld(new LevelMenu());
        }
    }

    private void prepare()
    {
        RedButton redButton = new RedButton();
        addObject(redButton, getWidth()/2, 350);
        redButton.setLocation(421,470);
        redButton.setLocation(422,483);
    }
}
