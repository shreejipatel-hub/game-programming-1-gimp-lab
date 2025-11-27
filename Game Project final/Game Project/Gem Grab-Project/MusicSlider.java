import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MusicSlider draws the background bar for the volume slider.
 * This is the long horizontal line that the knob slides along.
 */
public class MusicSlider extends Actor
{
    public MusicSlider()
    {
        // Create a horizontal bar (200px wide, 8px tall)
        GreenfootImage img = new GreenfootImage(200, 8);
        img.setColor(Color.GRAY);
        img.fillRect(0, 3, 200, 4);  // centered on the Y-axis
        setImage(img);
    }

    public void act()
    {
        // The slider bar itself does not need to do anything.
    }
}
