import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RotatedPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RotatedPlatform extends Platform
{
     public RotatedPlatform(){
        GreenfootImage originalImage = getImage();
        originalImage.rotate(90);
        setImage(originalImage);
     }
     
    /**
     * Act - do whatever the RotatedPlatform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage RotatedPlatform = getImage();
        RotatedPlatform.scale(60, 200); 
        setImage(RotatedPlatform);
    }
}
