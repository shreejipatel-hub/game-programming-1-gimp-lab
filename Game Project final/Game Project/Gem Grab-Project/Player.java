import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Base Player class containing movement, gravity, jumping,
 * health system, and collision checks.
 */
public class Player extends Actor
{
    // -------- MOVEMENT + GRAVITY --------
    protected double ySpeed = 0;
    protected double gravity = 0.8;
    protected int jumpStrength = -12;
    protected int moveSpeed = 4;

    protected boolean onGround = false;
    protected boolean crouching = false;

    // -------- HEALTH SYSTEM --------
    protected int health = 3;

    public void act()
    {
        applyGravity();
        handleMovement();
        handleJump();
        handleCrouch();
        checkTrapCollision();
        ;
    }

    // ===================================================================
    //                  PLATFORM + GROUND COLLISION SYSTEM
    // ===================================================================

    private void applyGravity()
    {
        ySpeed += gravity;

        // Move vertically
        setLocation(getX(), (int)(getY() + ySpeed));

        onGround = false;

        // ----- COLLISION BELOW (LANDING) -----
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if (platformBelow != null && ySpeed >= 0)
        {
            // snap onto the platform perfectly
            int platformTop = platformBelow.getY() - platformBelow.getImage().getHeight()/2;
            int playerHalf = getImage().getHeight()/2;

            setLocation(getX(), platformTop - playerHalf);

            ySpeed = 0;
            onGround = true;
        }

        // ----- COLLISION ABOVE (HEAD BUMP) -----
        Actor platformAbove = getOneObjectAtOffset(0, -getImage().getHeight()/2, Platform.class);
        if (platformAbove != null && ySpeed < 0)
        {
            ySpeed = 0; // stop going upward

            // push player down slightly so they unstick
            setLocation(getX(), getY() + 2);
        }

        // ----- COLLISION WITH GROUND (bottom of world) -----
        int bottomLimit = getWorld().getHeight() - getImage().getHeight()/2;
        if (getY() > bottomLimit)
        {
            setLocation(getX(), bottomLimit);
            ySpeed = 0;
            onGround = true;
        }
    }

    // ===================================================================
    //                         LEFT + RIGHT MOVEMENT
    // ===================================================================

  
    
private void handleMovement()
{
    int oldX = getX();

    // Move left
    if (Greenfoot.isKeyDown("left"))
    {
        setLocation(getX() - moveSpeed, getY());

        // check LEFT collision only
        if (getOneObjectAtOffset(-getImage().getWidth()/2, 0, Platform.class) != null)
        {
            setLocation(oldX, getY());
        }
    }

    // Move right
    if (Greenfoot.isKeyDown("right"))
    {
        setLocation(getX() + moveSpeed, getY());

        // check RIGHT collision only
        if (getOneObjectAtOffset(getImage().getWidth()/2, 0, Platform.class) != null)
        {
            setLocation(oldX, getY());
        }
    }
}

    // ===================================================================
    //                              JUMPING
    // ===================================================================

    private void handleJump()
    {
        if (Greenfoot.isKeyDown("space") && onGround)
        {
            ySpeed = jumpStrength;
            onGround = false;
        }
    }

    // ===================================================================
    //                            CROUCHING
    // ===================================================================

    private void handleCrouch()
    {
        if (Greenfoot.isKeyDown("down"))
        {
            crouching = true;
        }
        else
        {
            crouching = false;
        }
    }

    // ===================================================================
    //                       HEALTH + TRAP DAMAGE
    // ===================================================================

    private void checkTrapCollision()
    {
        Trap hitTrap = (Trap) getOneIntersectingObject(Trap.class);
        if (hitTrap != null && hitTrap.isDangerous())
        {
            takeDamage();
            
        }
        
    }

    public void takeDamage()
    {
        health--;

        if (health <= 0)
        {
            die();
        }
        else
        {
            setLocation(89, 463); // respawn point for now
        }
    }

    private void die()
    {
        Greenfoot.setWorld(new DeathWorld());
        getWorld().removeObject(this);
    }
}
