import greenfoot.*;

public class SkinManager
{
    public static String currentSkin = "red";

    public static void setSkin(String skin)
    {
        currentSkin = skin;
    }

    public static Actor getSelectedPlayer()
    {
        switch(currentSkin)
        {
            case "thief": return new ThiefPlayer();
            case "classic": return new RedPlayer();
            default: return new RedPlayer();
        }
    }
}
