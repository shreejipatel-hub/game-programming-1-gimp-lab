import greenfoot.*;
//yooo credo the goat gangy
public class Level1World extends World
{
    public Level1World()
    {
        super(810, 540, 1);

        prepare();
    }

    private void prepare()
    {
        // 1. Get selected player from SkinManager
        Actor player = SkinManager.getSelectedPlayer();

        // 2. Spawn player at starting position
        addObject(player, 89, 463);

        // 3. (Optional) Add traps/platforms later
        // addObject(new SpikeTrap(), 400, 500);
        LevelExitButton levelExitButton = new LevelExitButton();
        addObject(levelExitButton,756,56);
        levelExitButton.setLocation(779,26);
        levelExitButton.setLocation(775,22);
        levelExitButton.setLocation(784,21);
        PlatForm1 platForm1 = new PlatForm1();
        addObject(platForm1,140,486);
        PlatForm1 platForm12 = new PlatForm1();
        addObject(platForm12,426,446);
        PlatForm2 platForm2 = new PlatForm2();
        addObject(platForm2,599,415);
        platForm12.setLocation(344,274);
        platForm2.setLocation(426,454);
        platForm2.setLocation(560,440);
        platForm12.setLocation(243,385);
        platForm12.setLocation(564,259);
        PlatForm2 platForm22 = new PlatForm2();
        addObject(platForm22,146,379);
        platForm2.setLocation(357,462);
        platForm2.setLocation(489,471);
        platForm22.setLocation(300,331);
        platForm22.setLocation(255,333);
        platForm22.setLocation(215,333);
        platForm2.setLocation(464,470);
        platForm2.setLocation(513,471);
        platForm2.setLocation(530,471);
        platForm2.setLocation(543,470);
        platForm12.setLocation(691,399);
        platForm12.setLocation(691,399);
        platForm12.setLocation(712,405);
        platForm22.setLocation(387,69);
        PlatForm1 platForm13 = new PlatForm1();
        addObject(platForm13,456,345);
        platForm22.setLocation(176,256);
        platForm22.setLocation(241,295);
        platForm22.setLocation(176,272);
        platForm22.setLocation(148,290);
        platForm22.setLocation(262,285);
        platForm22.setLocation(224,291);
        platForm22.setLocation(138,291);
        platForm2.setLocation(419,465);
        platForm2.setLocation(495,471);
        Spike spike = new Spike();
        addObject(spike,5,537);
        Spike spike2 = new Spike();
        addObject(spike2,21,536);
        Spike spike3 = new Spike();
        addObject(spike3,39,535);
        Spike spike4 = new Spike();
        addObject(spike4,69,536);
        Spike spike5 = new Spike();
        addObject(spike5,100,536);
        Spike spike6 = new Spike();
        addObject(spike6,136,535);
        Spike spike7 = new Spike();
        addObject(spike7,159,536);
        Spike spike8 = new Spike();
        addObject(spike8,176,537);
        Spike spike9 = new Spike();
        addObject(spike9,200,536);
        Spike spike10 = new Spike();
        addObject(spike10,229,536);
        Spike spike11 = new Spike();
        addObject(spike11,250,536);
        Spike spike12 = new Spike();
        addObject(spike12,279,537);
        Spike spike13 = new Spike();
        addObject(spike13,303,538);
        Spike spike14 = new Spike();
        addObject(spike14,329,539);
        Spike spike15 = new Spike();
        addObject(spike15,344,538);
        Spike spike16 = new Spike();
        addObject(spike16,352,536);
        Spike spike17 = new Spike();
        addObject(spike17,383,536);
        Spike spike18 = new Spike();
        addObject(spike18,410,537);
        Spike spike19 = new Spike();
        addObject(spike19,437,537);
        Spike spike20 = new Spike();
        addObject(spike20,464,535);
        Spike spike21 = new Spike();
        addObject(spike21,485,535);
        Spike spike22 = new Spike();
        addObject(spike22,514,534);
        Spike spike23 = new Spike();
        addObject(spike23,537,537);
        Spike spike24 = new Spike();
        addObject(spike24,587,538);
        Spike spike25 = new Spike();
        addObject(spike25,604,533);
        Spike spike26 = new Spike();
        addObject(spike26,555,538);
        Spike spike27 = new Spike();
        addObject(spike27,634,536);
        Spike spike28 = new Spike();
        addObject(spike28,624,537);
        Spike spike29 = new Spike();
        addObject(spike29,657,536);
        Spike spike30 = new Spike();
        addObject(spike30,690,535);
        Spike spike31 = new Spike();
        addObject(spike31,730,533);
        Spike spike32 = new Spike();
        addObject(spike32,764,535);
        Spike spike33 = new Spike();
        addObject(spike33,789,535);
        Spike spike34 = new Spike();
        addObject(spike34,808,536);
        Spike spike35 = new Spike();
        addObject(spike35,709,538);
        spike11.setLocation(265,518);
        Lazer lazer = new Lazer();
        addObject(lazer,265,518);
        Beam beam = new Beam();
        addObject(beam,264,408);
        RotatedPlatform rotatedPlatform = new RotatedPlatform();
        addObject(rotatedPlatform,623,169);
        PlatForm2 platForm23 = new PlatForm2();
        addObject(platForm23,806,218);
    }
}
