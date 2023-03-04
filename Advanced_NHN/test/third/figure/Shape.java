package NGS.NHN.test.third.figure;

import java.awt.Graphics;

public abstract class Shape {
	Point location;
	
	Shape(Point location) {
		this.location = location;	//
	}
	
	public double getX() {
		return location.x;
	}
	
	public double getY() {
		return location.y;
	}
	
	public abstract Region getRegion();	//
	public abstract void draw(Graphics graphics);
	
	
}
