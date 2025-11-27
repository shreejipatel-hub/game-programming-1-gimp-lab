import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GenericThiefSkin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GenericThiefSkin extends SkinsButton
{
    private GreenfootImage baseImage;
    private GreenfootImage hoverImage;
    private boolean isHovering = false;

    private GreenfootSound hoverSound = new GreenfootSound("buttonhover.mp3");
    /**
     * Act - do whatever the GenericThiefSkin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) 
        {
            if (!isHovering)
            {
                hoverSound.play();   // <-- 🔊 plays once per hover
                isHovering = true;
            }
            setImage(hoverImage);
        } 
        else if (Greenfoot.mouseMoved(null)) 
        {
            isHovering = false;
            setImage(baseImage);
        }
    }
    
    public void prepareHoverImages()
    {
        baseImage = new GreenfootImage(getImage());

        hoverImage = new GreenfootImage(baseImage);
        hoverImage.scale(
            (int)(baseImage.getWidth() * 1.12),
            (int)(baseImage.getHeight() * 1.12)
        );
    }
}
