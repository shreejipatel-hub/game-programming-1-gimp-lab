import greenfoot.*;

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
    }
}
