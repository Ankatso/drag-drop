package mg.facedev.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends Form {
	
	private static final Color BACKGROUND = Color.GREEN;
	
	public Ball(int x, int y, int width, int height) {
		rect = new Rectangle(x, y, width, height);
	}

	@Override
	public void draw(Graphics drawer) {
		
		Color lastColor = drawer.getColor();
		drawer.setColor(BACKGROUND);
		drawer.fillOval(rect.x, rect.y, rect.width, rect.height);
		drawer.setColor(lastColor);
	}

}
