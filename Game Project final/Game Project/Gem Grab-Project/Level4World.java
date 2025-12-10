import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4World extends World
{
    private HealthBar healthBar;
    private int levelNumber = 4;
    private Counter gemCounter;

    /**
     * Constructor for objects of class Level4World.
     * 
     */
    public Level4World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 540, 1); 
        prepare();
    }
    
    public int getLevelNumber()
    {
        return levelNumber;
    }
    
    public HealthBar getHealthBar()
    {
        return healthBar;  // player will use this
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        showText("More is less", 400, 70);
    
        // --- HEALTH (choose number of lives for level 4) ---
        healthBar = new HealthBar(2);
        addObject(healthBar, 230, 20);
    
        // --- PLAYER ---
        Actor player = SkinManager.getSelectedPlayer();
        ((Player)player).health = 2;   // SET LIVES FOR LEVEL 4
        addObject(player, 40, 500);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton,756,56);
        levelExitButton.setLocation(779,26);
        levelExitButton.setLocation(775,22);
        levelExitButton.setLocation(784,21);

        Spike spike = new Spike();
        addObject(spike,138,527);
        Spike spike2 = new Spike();
        addObject(spike2,287,532);
        Spike spike3 = new Spike();
        addObject(spike3,426,533);
        Spike spike4 = new Spike();
        addObject(spike4,444,532);
        Spike spike5 = new Spike();
        addObject(spike5,595,535);
        Spike spike6 = new Spike();
        addObject(spike6,609,532);
        Spike spike7 = new Spike();
        addObject(spike7,621,532);
        Spike spike8 = new Spike();
        addObject(spike8,826,531);
        EntryPortal entryPortal = new EntryPortal();
        addObject(entryPortal,748,522);
        ExitPortal exitPortal = new ExitPortal();
        addObject(exitPortal,387,90);
        sPlatform sPlatform = new sPlatform();
        addObject(sPlatform,394,175);
        PlatForm1 platForm1 = new PlatForm1();
        addObject(platForm1,481,353);
        PlatForm1 platForm12 = new PlatForm1();
        addObject(platForm12,686,352);
        RotatedPlatform rotatedPlatform = new RotatedPlatform();
        addObject(rotatedPlatform,380,273);
        sPlatform sPlatform2 = new sPlatform();
        addObject(sPlatform2,501,216);
        sPlatform sPlatform3 = new sPlatform();
        addObject(sPlatform3,590,278);
        sPlatform sPlatform4 = new sPlatform();
        addObject(sPlatform4,812,346);
        Beam beam = new Beam();
        addObject(beam,305,214);
        Beam beam2 = new Beam();
        addObject(beam2,49,197);
        Beam beam3 = new Beam();
        addObject(beam3,310,304);
        Beam beam4 = new Beam();
        addObject(beam4,54,303);
        Beam beam5 = new Beam();
        addObject(beam5,205,206);
        Beam beam6 = new Beam();
        addObject(beam6,191,298);
        beam3.setLocation(307,311);
        exitPortal.setLocation(305,241);
        exitPortal.setLocation(193,271);
        removeObject(beam5);
        removeObject(beam6);
        removeObject(beam);
        removeObject(beam4);
        removeObject(beam2);
        beam3.setLocation(326,238);
        exitPortal.setLocation(316,223);
        exitPortal.setLocation(78,220);
        beam3.turn(90);
        beam3.setLocation(78,232);
        beam3.setLocation(41,242);

        addObject(beam5,336,240);
        beam.turn(90);
        beam.setLocation(155,236);
        beam.setLocation(137,245);
        beam.setLocation(156,237);
        beam.setLocation(138,239);
        beam2.turn(90);
        exitPortal.setLocation(233,232);
        exitPortal.setLocation(193,315);
        beam4.act();
        beam4.setLocation(205,373);
        exitPortal.setLocation(247,227);
        exitPortal.setLocation(333,257);
        exitPortal.setLocation(321,357);
        removeObject(beam5);
        beam4.setLocation(205,389);
        removeObject(beam4);
        exitPortal.setLocation(221,241);
        exitPortal.setLocation(312,259);
        exitPortal.setLocation(233,259);
        beam.setLocation(161,256);
        beam3.setLocation(69,257);
        exitPortal.setLocation(406,140);
        exitPortal.setLocation(421,107);
        exitPortal.setLocation(794,287);
        beam3.setLocation(64,257);
        Beam beam7 = new Beam();
        addObject(beam7,263,242);
        beam7.setLocation(261,269);
        beam7.turn(270);
        beam7.setLocation(295,254);
        beam7.setLocation(245,258);
        beam7.setLocation(263,251);
        beam7.setLocation(270,258);
        beam3.setLocation(73,258);
        beam3.setLocation(101,264);
        beam3.setLocation(99,259);
        sPlatform sPlatform5 = new sPlatform();
        addObject(sPlatform5,253,169);
        sPlatform sPlatform6 = new sPlatform();
        addObject(sPlatform6,100,158);
        sPlatform6.setLocation(85,164);
        sPlatform6.setLocation(88,172);
        Gem1 gem1 = new Gem1();
        addObject(gem1,423,312);
        Gem2 gem2 = new Gem2();
        addObject(gem2,79,145);
        PlatForm2 platForm2 = new PlatForm2();
        addObject(platForm2,190,374);
        platForm2.setLocation(292,359);
        platForm2.setLocation(178,359);
        platForm2.setLocation(353,363);
        platForm2.setLocation(183,376);
        platForm2.setLocation(191,374);
        Spike spike9 = new Spike();
        addObject(spike9,356,350);
        Spike spike10 = new Spike();
        addObject(spike10,19,352);
        Door door = new Door();
        addObject(door,193,341);
        door.setLocation(238,355);
        door.setLocation(187,323);
        door.setLocation(111,340);
        Gem3 gem3 = new Gem3();
        addObject(gem3,402,144);
        sPlatform sPlatform7 = new sPlatform();
        addObject(sPlatform7,605,161);
        sPlatform sPlatform8 = new sPlatform();
        addObject(sPlatform8,795,98);
        sPlatform sPlatform9 = new sPlatform();
        addObject(sPlatform9,716,100);
        gem3.setLocation(817,66);
        sPlatform9.setLocation(725,177);
        gem3.setLocation(797,140);
        gem3.setLocation(792,179);
        exitPortal.setLocation(797,177);
        exitPortal.setLocation(807,137);
        removeObject(sPlatform9);
        removeObject(sPlatform8);
        PlatForm2 platForm22 = new PlatForm2();
        addObject(platForm22,387,88);
        Beam beam8 = new Beam();
        addObject(beam8,569,1);
        Beam beam9 = new Beam();
        addObject(beam9,197,7);
        beam9.sleepFor(2);
        removeObject(platForm22);
        removeObject(beam8);
        removeObject(beam9);
        sPlatform sPlatform10 = new sPlatform();
        addObject(sPlatform10,778,237);
        Spike spike11 = new Spike();
        addObject(spike11,640,327);
        exitPortal.setLocation(812,311);
        exitPortal.setLocation(801,316);
        Beam beam10 = new Beam();
        addObject(beam10,502,151);
        Beam beam11 = new Beam();
        addObject(beam11,608,66);
        beam10.setLocation(502,138);
        Beam beam12 = new Beam();
        addObject(beam12,502,138);
        beam10.setLocation(489,109);
        beam10.setLocation(788,148);
        beam10.setLocation(500,127);
        beam12.setLocation(788,98);
        beam10.setLocation(496,97);
        beam11.setLocation(605,58);
        beam12.setLocation(782,70);
        beam12.setLocation(774,82);
        beam12.setLocation(783,107);
        beam12.setLocation(788,97);
        beam12.setLocation(782,116);
        Spike spike12 = new Spike();
        addObject(spike12,565,330);
        Beam beam13 = new Beam();
        addObject(beam13,224,255);
        beam13.act();
        beam13.setLocation(564,116);
        beam10.setLocation(493,107);
        removeObject(beam10);
        removeObject(beam11);
        beam13.setLocation(603,167);
        removeObject(beam13);
    }
}
