package mg.facedev.entities;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class Form {

	protected Rectangle rect;

	public Form() {
		super();
		rect = new Rectangle();
	}

	public Rectangle getRect() {
		return (Rectangle) rect.clone();
	}
	
	public abstract void draw(Graphics drawer);
	
	// positions
	public Point getPos() {
		Point pos = new Point();
		pos.x = rect.x + rect.width / 2;
		pos.y = rect.y + rect.height / 2;
		return pos;
	}
	
	public void setPos(Point pos) {
		
		rect.x = pos.x - rect.width / 2;
		rect.y = pos.y - rect.height / 2;
	}
	
}
