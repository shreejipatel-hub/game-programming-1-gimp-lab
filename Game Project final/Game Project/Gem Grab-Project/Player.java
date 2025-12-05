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

    // -------- HEALTH SYSTEM --------
    protected int health = 3;

    // UI reference for the health bar
    private HealthBar healthUI;
    
private GreenfootSound deathSound = new GreenfootSound("deathsound.mp3");

    /**
     * Called automatically when the player is added to a world.
     * This is where we connect the Player to the HealthBar.
     */
    protected void addedToWorld(World world)
    {
        if (world instanceof Level1World)
        {
            healthUI = ((Level1World)world).getHealthBar();
        }
        // Add similar lines here if Level2World, Level3World, etc. also have healthbars.
    }

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
        if (teleportCooldown == 0)
        {
            checkPortals();
        }
    }

    // -------- PLATFORM + GROUND COLLISION --------
    private void applyGravity()
    {
        ySpeed += gravity;

        // Move vertically
        setLocation(getX(), (int)(getY() + ySpeed));

        onGround = false;

        // Landing
        Actor platformBelow = getOneObjectAtOffset(0, getImage().getHeight()/2, Platform.class);
        if (platformBelow != null && ySpeed >= 0)
        {
            int platformTop = platformBelow.getY() - platformBelow.getImage().getHeight()/2;
            int playerHalf = getImage().getHeight()/2;

            setLocation(getX(), platformTop - playerHalf);

            ySpeed = 0;
            onGround = true;
        }

        // Head bump
        Actor platformAbove = getOneObjectAtOffset(0, -getImage().getHeight()/2, Platform.class);
        if (platformAbove != null && ySpeed < 0)
        {
            ySpeed = 0;
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

    // -------- LEFT + RIGHT MOVEMENT --------
    private void handleMovement()
    {
        int oldX = getX();

        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - moveSpeed, getY());

            if (getOneObjectAtOffset(-getImage().getWidth()/2, 0, Platform.class) != null)
            {
                setLocation(oldX, getY());
            }
        }

        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + moveSpeed, getY());

            if (getOneObjectAtOffset(getImage().getWidth()/2, 0, Platform.class) != null)
            {
                setLocation(oldX, getY());
            }
        }
    }

    // -------- JUMP --------
    private void handleJump()
    {
        if (Greenfoot.isKeyDown("space") && onGround)
        {
            ySpeed = jumpStrength;
            onGround = false;
        }
    }

    // -------- CROUCH (optional) --------
    private void handleCrouch()
    {
        crouching = Greenfoot.isKeyDown("down");
    }

    // -------- DAMAGE FROM TRAPS --------
    private void checkTrapCollision()
    {
        Trap hitTrap = (Trap) getOneIntersectingObject(Trap.class);
        if (hitTrap != null && hitTrap.isDangerous())
        {
            takeDamage();
        }
    }

    // -------- TELEPORTATION LOGIC --------
    public void checkPortals()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            if (isTouching(EntryPortal.class))
            {
                if (!getWorld().getObjects(ExitPortal.class).isEmpty())
                {
                    Actor target = getWorld().getObjects(ExitPortal.class).get(0);
                    Greenfoot.playSound("teleportation.mp3");
                    setLocation(target.getX(), target.getY());
                    teleportCooldown = 60;
                }
            }
            else if (isTouching(ExitPortal.class))
            {
                if (!getWorld().getObjects(EntryPortal.class).isEmpty())
                {
                    Actor target = getWorld().getObjects(EntryPortal.class).get(0);
                    Greenfoot.playSound("teleportation.mp3");
                    setLocation(target.getX(), target.getY());
                    teleportCooldown = 60;
                }
            }
        }
    }

    // -------- TAKE DAMAGE & UPDATE HEALTH BAR --------
    public void takeDamage()
    {
        health--;

        // update UI
        if (healthUI != null)
        {
            healthUI.setHealth(health);
        }

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
        deathSound.play();
        Greenfoot.delay(60);
        Greenfoot.setWorld(new DeathWorld());
    }

    // -------- DOOR → LEVEL WON --------
    public void checkDoor()
    {
        if (isTouching(Door.class) && Greenfoot.isKeyDown("up"))
        {
            Greenfoot.setWorld(new LevelWonWorld("You finished level 1!!", levelGems));
        }
    }

    // -------- GEM COLLECTION --------
    public void checkGemCollection()
    {
        if (isTouching(Gems.class))
        {
            levelGems++;
            totalGems++;
            removeTouching(Gems.class);
        }
    }

    // -------- GEM COUNTER ON SCREEN --------
    public void updateScoreBoard()
    {
        getWorld().showText("Level Gems: " + levelGems, 100, 30);
        getWorld().showText("Total Gems: " + totalGems, 100, 50);
    }
}
