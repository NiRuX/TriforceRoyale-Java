package zelda.engine;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author maartenhus
 */
public abstract class Scene implements DrawAble
{
	protected Sprite sprite;
	protected Game game;
	protected ArrayList<GObject> gameObjects = new ArrayList<GObject>();

	public Scene(Game game, String img)
	{
		this.game = game;
		sprite = Sprite.getSprite(img);
	}

	public abstract void handleInput();

	public void draw(Graphics2D g)
	{
		Image img = sprite.getImage();
		g.drawImage(img, 0, 0, game.getWidth(), game.getHeight(), null);
	}

	public void addGObject(GObject gObject)
	{
		gameObjects.add(gObject);
	}

	public ArrayList<GObject> getGObjects()
	{
		return gameObjects;
	}
}
