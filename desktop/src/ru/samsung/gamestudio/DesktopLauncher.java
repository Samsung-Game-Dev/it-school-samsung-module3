package ru.samsung.gamestudio;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import ru.samsung.gamestudio.MyGdxGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setForegroundFPS(60);
        config.setTitle("Space cleaner");
        config.setWindowedMode(GameSettings.SCREEN_WIDTH, GameSettings.SCREEN_HEIGHT);
        new Lwjgl3Application(new MyGdxGame(), config);
    }
}
