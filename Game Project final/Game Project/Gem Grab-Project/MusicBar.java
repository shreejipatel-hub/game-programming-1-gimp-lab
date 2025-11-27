import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MusicBar is the draggable knob that the user moves along the MusicSlider.
 * It calculates a volume level (0.0 to 1.0) based on its X-position and 
 * updates the MainMenu's music volume accordingly.
 */
public class MusicBar extends Actor
{
    private MusicSlider bar;  // Reference to the slider bar

    /**
     * Constructor receives the bar so we know the slider's center point.
     */
    public MusicBar(MusicSlider bar)
    {
        this.bar = bar;

        // Visual for the knob (white circle)
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.WHITE);
        img.fillOval(0, 0, 20, 20);
        setImage(img);
    }

    public void act()
    {
        // Check if the user is dragging this knob
        if (Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int x = mouse.getX();

            // Limit the knob between sliderBar.x - 100 and sliderBar.x + 100
            int min = bar.getX() - 100;
            int max = bar.getX() + 100;

            // Clamp the knob position
            x = Math.max(min, Math.min(max, x));

            // Update knob position
            setLocation(x, getY());

            // Convert knob position to a volume between 0.0 and 1.0
            double volume = (x - min) / 200.0;

            // Update menu music volume
            MainMenu.setMusicVolume(volume);
        }
    }
}
