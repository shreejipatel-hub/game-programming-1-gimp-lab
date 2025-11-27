import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MusicBar is the draggable knob for the volume slider.
 * It moves along the MusicSlider and updates the MainMenu volume.
 */
public class MusicBar extends Actor
{
    private MusicSlider bar;  // Reference to the slider bar

    /**
     * Constructor receives the slider bar so the knob knows where to stay.
     */
    public MusicBar(MusicSlider bar)
    {
        this.bar = bar;

        // Visual knob: white circle
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.WHITE);
        img.fillOval(0, 0, 20, 20);
        setImage(img);
    }

    /**
     * Handles dragging the knob and converting position into volume (0.0–1.0).
     */
    public void act()
    {
        // Check if THIS knob is being dragged by the mouse
        if (Greenfoot.mouseDragged(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int x = mouse.getX();

            // Limit knob movement to the slider bar range
            int min = bar.getX() - 100;   // left limit
            int max = bar.getX() + 100;   // right limit

            // Clamp X position between min and max
            x = Math.max(min, Math.min(max, x));

            // Update knob position
            setLocation(x, getY());

            // Convert knob position → volume (0.0 to 1.0)
            double volume = (x - min) / 200.0;

            // Tell MainMenu to adjust music volume
            MainMenu.setMusicVolume(volume);
        }
    }
}
