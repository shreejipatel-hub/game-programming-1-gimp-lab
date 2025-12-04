import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3World extends World
{

    /**
     * Constructor for objects of class Level3World.
     * 
     */
    public Level3World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 540, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("Time to time yourself...",  400,  100);
        // 1. Get selected player from SkinManager
        Actor player = SkinManager.getSelectedPlayer();

        // 2. Spawn player at starting position
        addObject(player, 30, 30);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();

        addObject(levelExitButton,756,56);

        RotatedPlatform rotatedPlatform = new RotatedPlatform();
        addObject(rotatedPlatform,123,113);
        rotatedPlatform.setLocation(124,101);
        rotatedPlatform.setLocation(150,161);

        rotatedPlatform.setLocation(119,44);
        RotatedPlatform rotatedPlatform2 = new RotatedPlatform();
        addObject(rotatedPlatform2,118,248);
        RotatedPlatform rotatedPlatform3 = new RotatedPlatform();
        addObject(rotatedPlatform3,117,442);
        EntryPortal entryPortal = new EntryPortal();
        addObject(entryPortal,65,409);
        entryPortal.setLocation(81,416);
        entryPortal.setLocation(50,400);
        entryPortal.setLocation(15,509);
        Spike spike = new Spike();
        addObject(spike,15,509);
        entryPortal.setLocation(68,516);
        Spike spike2 = new Spike();
        addObject(spike2,68,516);
        ExitPortal exitPortal = new ExitPortal();
        addObject(exitPortal,174,70);
        exitPortal.setLocation(172,123);
        sPlatform sPlatform = new sPlatform();
        addObject(sPlatform,172,123);
        exitPortal.setLocation(266,206);
        exitPortal.setLocation(386,402);
        sPlatform.setLocation(546,488);
        sPlatform sPlatform2 = new sPlatform();
        addObject(sPlatform2,449,443);
        sPlatform sPlatform3 = new sPlatform();
        addObject(sPlatform3,353,403);
        sPlatform sPlatform4 = new sPlatform();
        addObject(sPlatform4,813,499);
        sPlatform sPlatform5 = new sPlatform();
        addObject(sPlatform5,737,451);
        sPlatform sPlatform6 = new sPlatform();
        addObject(sPlatform6,800,393);
        sPlatform sPlatform7 = new sPlatform();
        addObject(sPlatform7,719,343);
        sPlatform sPlatform8 = new sPlatform();
        addObject(sPlatform8,802,301);
        sPlatform sPlatform9 = new sPlatform();
        addObject(sPlatform9,705,250);
        sPlatform sPlatform10 = new sPlatform();
        addObject(sPlatform10,792,203);
        sPlatform sPlatform11 = new sPlatform();
        addObject(sPlatform11,706,159);
        sPlatform sPlatform12 = new sPlatform();
        addObject(sPlatform12,792,114);
        exitPortal.setLocation(215,24);
        entryPortal.setLocation(7,533);
        entryPortal.setLocation(61,395);
        entryPortal.setLocation(96,444);
        entryPortal.setLocation(13,460);
        entryPortal.setLocation(35,473);
        entryPortal.setLocation(69,537);
        entryPortal.setLocation(69,526);
        entryPortal.setLocation(89,425);
        entryPortal.setLocation(88,432);
        entryPortal.setLocation(50,455);
        Gem1 gem1 = new Gem1();
        addObject(gem1,75,248);
        Gem2 gem2 = new Gem2();
        addObject(gem2,354,348);
        gem2.setLocation(356,373);
        Gem3 gem3 = new Gem3();
        addObject(gem3,796,84);
        exitPortal.setLocation(80,46);
        sPlatform sPlatform13 = new sPlatform();
        addObject(sPlatform13,80,46);

        exitPortal.setLocation(239,56);
        entryPortal.setLocation(49,412);
        entryPortal.setLocation(74,534);
        entryPortal.setLocation(19,533);
        entryPortal.setLocation(25,535);
        entryPortal.setLocation(108,433);
        entryPortal.setLocation(17,464);
        entryPortal.setLocation(61,464);
        entryPortal.setLocation(18,542);
        entryPortal.setLocation(71,540);
        removeObject(entryPortal);

        addObject(entryPortal,68,455);
        entryPortal.setLocation(70,449);
        entryPortal.setLocation(50,450);
        Beam beam = new Beam();
        addObject(beam,374,474);
        Beam beam2 = new Beam();
        addObject(beam2,453,473);
        Beam beam3 = new Beam();
        addObject(beam3,535,476);
        Beam beam4 = new Beam();
        addObject(beam4,617,481);
        Spike spike3 = new Spike();
        addObject(spike3,834,377);
        Spike spike4 = new Spike();
        addObject(spike4,832,280);
        Spike spike5 = new Spike();
        addObject(spike5,833,187);
        PlatForm2 platForm2 = new PlatForm2();
        addObject(platForm2,314,317);
        Door door = new Door();
        addObject(door,184,275);
        entryPortal.setLocation(222,297);
        entryPortal.setLocation(192,304);
        gem2.setLocation(498,309);
        removeObject(platForm2);
        entryPortal.setLocation(496,243);
        sPlatform sPlatform14 = new sPlatform();
        addObject(sPlatform14,522,301);
        door.setLocation(540,293);
        door.setLocation(511,253);
        door.setLocation(516,262);
        door.setLocation(523,269);
        entryPortal.setLocation(-11,479);
        entryPortal.setLocation(126,440);
        entryPortal.setLocation(67,433);
        gem2.setLocation(267,269);
        gem2.setLocation(346,353);
        gem2.setLocation(354,374);
        gem2.setLocation(530,232);
        door.setLocation(523,271);
        door.setLocation(509,269);
        gem2.setLocation(351,369);
        door.setLocation(530,254);
        door.setLocation(553,302);
        door.setLocation(534,300);
        door.setLocation(535,300);
        door.setLocation(526,299);
        door.setLocation(518,300);
        door.setLocation(597,403);
        removeObject(sPlatform14);
        RotatedPlatform rotatedPlatform4 = new RotatedPlatform();
        addObject(rotatedPlatform4,661,257);
        door.setLocation(540,300);
        door.setLocation(516,237);
        door.setLocation(534,201);
        door.setLocation(541,198);
        door.setLocation(552,211);
        door.setLocation(541,239);
    }
}
