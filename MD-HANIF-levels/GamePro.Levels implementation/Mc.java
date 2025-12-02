import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class Mc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mc extends Actor
{
    private double state = 0;
    private double gravity = 0.1;
    private boolean touchGround = false;
    
    // have gravity always apply 
    public void gravity(){
        state += gravity;
        setLocation(getX(), getY() + (int)state);
    }
    /**
     * Act - do whatever the Mc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movements();
        resize();
        gravity();
        jump();
        ifOnPlateform();
    }
    private void jump(){
        if (Greenfoot.isKeyDown("space")&& touchGround){
            state = -5;   
            touchGround = false;
        }
    }
    // left and right movements
    public void movements(){
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + 3, getY());
        }
        
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() - 3, getY());
        }
    }
    //adjusting the size of the image
    public void resize(){
        GreenfootImage mc = getImage();
        mc.scale(40,40);
        setImage(mc);
    }
    
    private void ifOnPlateform(){
       Actor platform = getOneIntersectingObject(platform.class);
        
       //checkin if mc is on the platform : true or false
        if (platform != null && state >= 0){
            while (getOneIntersectingObject(platform.class) != null){
                setLocation(getX(), getY() -1 );
            }
            state = 0;
            touchGround = true; 
            }else if (platform == null) {
                touchGround = false;
            }
        }

    }
