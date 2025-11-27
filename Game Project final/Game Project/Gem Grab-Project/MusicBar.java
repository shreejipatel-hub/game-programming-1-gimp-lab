import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MusicBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicBar extends Actor
{
    private MusicSlider bar;
    
    public MusicBar(MusicSlider bar)
    {
        this.bar = bar;
        GreenfootImage img = new GreenfootImage(20, 20);
        img.setColor(Color.WHITE);
        img.fillOval(0,0,20,20);
        setImage(img);
    }
    
}
