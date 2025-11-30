import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClassicSkin here.
 * 
 * @author  
 * @version 
 */
public class ClassicSkin extends SkinsButton
{
    private GreenfootImage baseImage;
    private GreenfootImage hoverImage;
    private boolean isHovering = false;

    private GreenfootSound hoverSound = new GreenfootSound("buttonhover.mp3");

    /**
     * Act - do whatever the ClassicSkin wants to do.
     */
    public void act()
    {
        // ---------- HOVER EFFECT ----------
        if (Greenfoot.mouseMoved(this)) 
        {
            if (!isHovering)
            {
                hoverSound.play();
                isHovering = true;
            }
            setImage(hoverImage);
        } 
        else if (Greenfoot.mouseMoved(null)) 
        {
            isHovering = false;
            setImage(baseImage);
        }

        // ---------- CLICK SELECTS SKIN ----------
        if (Greenfoot.mouseClicked(this))
        {
            SkinManager.setSkin("classic");     // <-- Remember chosen skin
            Greenfoot.setWorld(new MainMenu()); // <-- Return to menu
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
