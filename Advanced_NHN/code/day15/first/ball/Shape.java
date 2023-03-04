package NGS.NHN.code.day15.first.ball;

import java.awt.Graphics;

abstract public class Shape {
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
	
	abstract Region getRegion();	//
	abstract void draw(Graphics graphics);
	
	
}
