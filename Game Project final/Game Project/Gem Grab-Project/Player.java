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
    private int teleportCooldown = 0;
    public static int totalGems = 0;
    public int levelGems = 0;

    //Health system
    protected int health = 3;

    public void act()
    {
        applyGravity();
        handleMovement();
        handleJump();
        handleCrouch();
        checkTrapCollision();
        checkGemCollection();
        updateScoreBoard();

        checkDoor();

        if(teleportCooldown > 0)
        {
            teleportCooldown--;
        }
        
        if (teleportCooldown==0)
        {
            checkPortals();
        }
    }

    //platform and ground collision

    private void applyGravity()
    {
        ySpeed += gravity;

        // Move vertically
        setLocation(getX(), (int)(getY() + ySpeed));

        onGround = false;

        //Landing
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

        //HeadBump
        Actor platformAbove = getOneObjectAtOffset(0, -getImage().getHeight()/2, Platform.class);
        if (platformAbove != null && ySpeed < 0)
        {
            ySpeed = 0; // stop going upward

            // push player down slightly so they unstick
            setLocation(getX(), getY() + 2);
        }

        // Bottom of world
        int bottomLimit = getWorld().getHeight() - getImage().getHeight()/2;
        if (getY() > bottomLimit)
        {
            setLocation(getX(), bottomLimit);
            ySpeed = 0;
            onGround = true;
        }
    }

    //Movement
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

    private void handleJump()
    {
        if (Greenfoot.isKeyDown("space") && onGround)
        {
            ySpeed = jumpStrength;
            onGround = false;
        }
    }

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
    
    //damage
   private void checkTrapCollision()
    {
        Trap hitTrap = (Trap) getOneIntersectingObject(Trap.class);
        if (hitTrap != null && hitTrap.isDangerous())
        {
            
            
            
            takeDamage();
            
        }
        
    }
    
    //teleportation logic
    public void checkPortals()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            if(isTouching(EntryPortal.class))
            {
                if(!getWorld().getObjects(ExitPortal.class).isEmpty())
                {
                    Actor target = (Actor) getWorld().getObjects(ExitPortal.class).get(0);
                    setLocation(target.getX(), target.getY());
                    teleportCooldown = 60;
                }
            }
            
            else if (isTouching(ExitPortal.class))
            {
                if (!getWorld().getObjects(EntryPortal.class).isEmpty())
                {
                    Actor target = (Actor) getWorld().getObjects(EntryPortal.class).get(0);
                
                    setLocation(target.getX(), target.getY());
                
                    teleportCooldown = 60;
                }
            }
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
        //getWorld().removeObject(this);
    }
    
    //door logic
    public void checkDoor()
    {
        //check interaction and collision
        if(isTouching(Door.class)&& Greenfoot.isKeyDown("up"))
        {
            //Switch to the Level won world
            Greenfoot.setWorld(new LevelWonWorld("You finished level 1!!", levelGems));
        }
    }
    
    //gem collection
    public void checkGemCollection()
    {
        if(isTouching(Gems.class))
        {
            levelGems++;
            totalGems++;
            removeTouching(Gems.class);
        }
    }
    
    public void updateScoreBoard()
    {
       getWorld().showText("Level Gems: " + levelGems, 100, 30);
        getWorld().showText("Total Gems: " + totalGems, 100, 50); 
    }
}
