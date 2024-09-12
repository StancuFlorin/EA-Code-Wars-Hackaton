package ea.codewars.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import ea.codewars.core.PongGame;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "GameofPong";
		cfg.useGL30 = false;
		cfg.width = 800;
		cfg.height = 480;
		
		new LwjglApplication(new PongGame(), cfg);
	}
}
