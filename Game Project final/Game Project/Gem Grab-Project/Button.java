import greenfoot.*;  

public class Button extends Actor
{
    private GreenfootImage baseImage;
    private GreenfootImage hoverImage;
    private boolean isHovering = false;

    private GreenfootSound hoverSound = new GreenfootSound("buttonhover.mp3");

    public Button() { }

    public void prepareHoverImages()
    {
        baseImage = new GreenfootImage(getImage());

        hoverImage = new GreenfootImage(baseImage);
        hoverImage.scale(
            (int)(baseImage.getWidth() * 1.12),
            (int)(baseImage.getHeight() * 1.12)
        );
    }

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
}
