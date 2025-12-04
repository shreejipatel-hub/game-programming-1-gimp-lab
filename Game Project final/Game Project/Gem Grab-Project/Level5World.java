import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5World extends World
{

    /**
     * Constructor for objects of class Level5World.
     * 
     */
    public Level5World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 430, 1); 
        prepare();
    }
  
    private void prepare()
    {
        showText("Shiny Ending",  400,  70);

        // 1. Get selected player from SkinManager
        Actor player = SkinManager.getSelectedPlayer();

        // 2. Spawn player at starting position
        addObject(player, 52,383);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton,756,56);
        levelExitButton.setLocation(779,26);
        levelExitButton.setLocation(775,22);
        levelExitButton.setLocation(784,21);

        SmallPlatform smallPlatform = new SmallPlatform();
        addObject(smallPlatform,268,245);
        SmallPlatform smallPlatform2 = new SmallPlatform();
        addObject(smallPlatform2,497,86);
        smallPlatform.setLocation(447,241);
        smallPlatform.setLocation(263,290);
        smallPlatform.setLocation(261,255);
        smallPlatform2.setLocation(552,78);
        smallPlatform2.setLocation(554,80);
        smallPlatform.setLocation(106,256);
        smallPlatform.setLocation(385,270);
        smallPlatform.setLocation(304,277);
        smallPlatform2.setLocation(436,121);
        smallPlatform2.setLocation(455,135);
        smallPlatform2.setLocation(498,142);
        smallPlatform2.setLocation(505,148);
        smallPlatform2.setLocation(514,135);
        sPlatform sPlatform = new sPlatform();
        addObject(sPlatform,786,351);
        sPlatform sPlatform2 = new sPlatform();
        addObject(sPlatform2,33,187);
        sPlatform2.setLocation(37,205);
        Spike spike = new Spike();
        addObject(spike,15,257);
        Spike spike2 = new Spike();
        addObject(spike2,46,258);
        Spike spike3 = new Spike();
        addObject(spike3,785,413);
        Spike spike4 = new Spike();
        addObject(spike4,210,260);
        Spike spike5 = new Spike();
        addObject(spike5,222,261);
        Spike spike6 = new Spike();
        addObject(spike6,601,257);
        Spike spike7 = new Spike();
        addObject(spike7,392,266);
        smallPlatform.setLocation(401,264);
        spike7.setLocation(404,249);
        smallPlatform.setLocation(244,259);
        smallPlatform.setLocation(212,244);
        smallPlatform.setLocation(235,247);
        smallPlatform.setLocation(58,251);
        smallPlatform.setLocation(21,247);
        smallPlatform.setLocation(57,260);
        smallPlatform.setLocation(54,240);
        spike2.setLocation(54,244);
        smallPlatform.setLocation(607,249);
        spike6.setLocation(603,245);
        smallPlatform.setLocation(393,279);
        smallPlatform.setLocation(322,272);
        smallPlatform.setLocation(321,280);
        spike6.setLocation(603,260);
        spike2.setLocation(43,267);
        spike2.setLocation(37,257);
        spike7.setLocation(398,262);
        spike7.setLocation(398,259);
        Sword sword = new Sword();
        addObject(sword,742,374);
        Sword sword2 = new Sword();
        addObject(sword2,476,304);
        Sword sword3 = new Sword();
        addObject(sword3,177,394);
        sword.setLocation(739,419);
        sword3.setLocation(186,406);
        sword2.setLocation(474,291);
        smallPlatform.setLocation(472,281);
        smallPlatform.setLocation(487,294);
        smallPlatform.setLocation(437,296);
        smallPlatform.setLocation(512,295);
        smallPlatform.setLocation(446,296);
        smallPlatform.setLocation(256,216);
        smallPlatform.setLocation(386,296);
        smallPlatform.setLocation(268,288);
        smallPlatform.setLocation(271,288);
        Beam beam = new Beam();
        addObject(beam,178,33);
        Beam beam2 = new Beam();
        addObject(beam2,298,26);
        Beam beam3 = new Beam();
        addObject(beam3,416,34);
        Beam beam4 = new Beam();
        addObject(beam4,535,30);
        Beam beam5 = new Beam();
        addObject(beam5,646,30);
        beam.turn(180);
        beam2.setLocation(293,43);
        beam2.turn(180);
        beam3.setLocation(411,56);
        beam3.turn(180);
        beam4.setLocation(531,61);
        beam4.turn(180);
        beam5.setLocation(645,43);
        beam5.turn(180);
        beam3.setLocation(414,33);
        beam4.setLocation(540,31);
        beam5.setLocation(652,28);
        beam2.setLocation(300,19);
        beam.setLocation(180,37);
        beam.setLocation(173,40);
        beam.setLocation(171,38);
        beam.setLocation(192,32);
        beam.setLocation(182,27);
        Sword sword4 = new Sword();
        addObject(sword4,777,125);
        Sword sword5 = new Sword();
        addObject(sword5,14,38);
        Sword sword6 = new Sword();
        addObject(sword6,154,40);
        Sword sword7 = new Sword();
        addObject(sword7,355,36);
        sword7.setLocation(365,119);
        sword6.setLocation(220,120);
        sword5.setLocation(599,119);
        sword6.fasterSpeed();
        sword7.fasterSpeed();
        sword5.fasterSpeed();
        sword4.fasterSpeed();
        beam.setLocation(182,28);
        beam.interval1();
        beam2.interval2();
        beam3.interval3();
        beam4.interval4();
        beam5.interval2();
        smallPlatform2.setLocation(313,291);
        smallPlatform2.setLocation(117,289);
        removeObject(sword5);
        removeObject(sword4);
        sword6.setLocation(663,427);
        SmallPlatform smallPlatform3 = new SmallPlatform();
        addObject(smallPlatform3,518,121);
        smallPlatform3.setLocation(523,127);
        smallPlatform3.setLocation(429,152);
        smallPlatform3.setLocation(532,147);
        Gem1 gem1 = new Gem1();
        addObject(gem1,774,324);
        Gem2 gem2 = new Gem2();
        addObject(gem2,122,266);
        RedGem redGem = new RedGem();
        addObject(redGem,603,111);
        Door door = new Door();
        addObject(door,769,110);
        door.setLocation(759,123);
        door.setLocation(720,155);
        door.setLocation(744,156);
        door.setLocation(742,125);
        door.setLocation(740,114);
        removeObject(redGem);
        Gem3 gem3 = new Gem3();
        addObject(gem3,598,106);
        removeObject(sword3);
    }

}
