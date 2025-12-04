import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2World extends World
{

    /**
     * Constructor for objects of class Level2World.
     * 
     */
    public Level2World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1); 
        prepare();
    }
    
    private void prepare(){
        showText("You get one life",  400,  70);
        
        // 1. Get selected player from SkinManager
        Actor player = SkinManager.getSelectedPlayer();

        // 2. Spawn player at starting position
        addObject(player, 20, 10);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton,756,56);
        levelExitButton.setLocation(779,26);
        levelExitButton.setLocation(775,22);
        levelExitButton.setLocation(784,21);

        sPlatform sPlatform = new sPlatform();
        addObject(sPlatform,4,62);
        sPlatform sPlatform2 = new sPlatform();
        addObject(sPlatform2,120,120);
        sPlatform sPlatform3 = new sPlatform();
        addObject(sPlatform3,215,160);
        sPlatform sPlatform4 = new sPlatform();
        addObject(sPlatform4,288,220);
        sPlatform sPlatform5 = new sPlatform();
        addObject(sPlatform5,356,276);
        sPlatform sPlatform6 = new sPlatform();
        addObject(sPlatform6,580,234);
        sPlatform6.setLocation(522,227);
        sPlatform sPlatform7 = new sPlatform();
        addObject(sPlatform7,464,170);
        sPlatform sPlatform8 = new sPlatform();
        addObject(sPlatform8,379,112);
        sPlatform sPlatform9 = new sPlatform();
        addObject(sPlatform9,585,113);
        sPlatform sPlatform10 = new sPlatform();
        addObject(sPlatform10,781,159);
        sPlatform sPlatform11 = new sPlatform();
        addObject(sPlatform11,176,325);
        sPlatform sPlatform12 = new sPlatform();
        addObject(sPlatform12,35,272);
        sPlatform sPlatform13 = new sPlatform();
        addObject(sPlatform13,762,253);
        sPlatform sPlatform14 = new sPlatform();
        addObject(sPlatform14,495,321);
        sPlatform sPlatform15 = new sPlatform();
        addObject(sPlatform15,675,299);
        sPlatform sPlatform16 = new sPlatform();
        addObject(sPlatform16,288,367);
        sPlatform sPlatform17 = new sPlatform();
        addObject(sPlatform17,374,416);
        sPlatform sPlatform18 = new sPlatform();
        addObject(sPlatform18,613,380);
        sPlatform sPlatform19 = new sPlatform();
        addObject(sPlatform19,767,480);
        sPlatform sPlatform20 = new sPlatform();
        addObject(sPlatform20,536,460);
        sPlatform sPlatform21 = new sPlatform();
        addObject(sPlatform21,116,501);
        Door door = new Door();
        addObject(door,110,453);
        door.setLocation(142,439);
        door.setLocation(119,493);
        door.setLocation(130,496);
        door.setLocation(126,470);
        sPlatform21.setLocation(122,501);
        door.setLocation(137,464);
        door.setLocation(114,461);
        Spike spike = new Spike();
        addObject(spike,789,532);
        Spike spike2 = new Spike();
        addObject(spike2,738,534);
        Spike spike3 = new Spike();
        addObject(spike3,685,534);
        Spike spike4 = new Spike();
        addObject(spike4,617,535);
        Spike spike5 = new Spike();
        addObject(spike5,548,533);
        Spike spike6 = new Spike();
        addObject(spike6,473,536);
        Spike spike7 = new Spike();
        addObject(spike7,397,534);
        Spike spike8 = new Spike();
        addObject(spike8,318,532);
        Spike spike9 = new Spike();
        addObject(spike9,246,535);
        Spike spike10 = new Spike();
        addObject(spike10,167,535);
        Spike spike11 = new Spike();
        addObject(spike11,102,536);
        Spike spike12 = new Spike();
        addObject(spike12,19,539);
        Lazer lazer = new Lazer();
        addObject(lazer,433,532);
        Beam beam = new Beam();
        addObject(beam,436,406);
        beam.setLocation(434,433);
        removeObject(beam);
        removeObject(lazer);
        Spike spike13 = new Spike();
        addObject(spike13,509,530);
        Spike spike14 = new Spike();
        addObject(spike14,431,534);
        Spike spike15 = new Spike();
        addObject(spike15,354,530);
        Spike spike16 = new Spike();
        addObject(spike16,279,534);
        Gem1 gem1 = new Gem1();
        addObject(gem1,769,137);
        Gem2 gem2 = new Gem2();
        addObject(gem2,760,459);
        gem2.setLocation(766,439);
        Gem3 gem3 = new Gem3();
        addObject(gem3,40,254);
        gem2.setLocation(756,432);
        sPlatform sPlatform22 = new sPlatform();
        addObject(sPlatform22,276,461);
        sPlatform22.setLocation(250,484);
        sPlatform sPlatform23 = new sPlatform();
        addObject(sPlatform23,268,434);
        gem2.setLocation(186,442);
        door.setLocation(776,423);
        gem2.setLocation(117,429);
        sPlatform22.setLocation(68,463);
        gem2.setLocation(214,469);
        gem2.setLocation(136,482);
        door.setLocation(761,324);
        door.setLocation(791,414);
        gem1.setLocation(783,170);
        gem1.setLocation(774,153);
        gem1.setLocation(774,136);
        gem2.setLocation(33,465);
        sPlatform21.setLocation(102,496);
        gem2.setLocation(51,420);
        sPlatform21.setLocation(159,493);
        gem2.setLocation(60,451);
        gem2.setLocation(33,430);
        door.setLocation(741,445);
        door.setLocation(718,429);
        door.setLocation(731,424);
        door.setLocation(750,436);
        door.setLocation(773,446);
        sPlatform17.setLocation(403,426);
        sPlatform17.setLocation(413,410);
        sPlatform16.setLocation(308,362);
        sPlatform16.setLocation(314,346);
        sPlatform sPlatform24 = new sPlatform();
        addObject(sPlatform24,32,118);
    }
}
