package NGS.NHN.practice.day14.first.ball;

import java.awt.Color;
import java.awt.Graphics;

public class Box {
	Point location;
	Color color;
	double radius;
	
	public Box(Point location, double radius, Color color) {
		this.location = location;
		this.radius = radius;
		this.color = color;
	}
	
	public double getX() {
		return location.getX();
	}

	public void setX(double x) {
		location.x = x;
	}

	public double getY() {
		return location.getY();
	}

	public void setY(double y) {
		location.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Region getRegion() {
		return new Region(
				(int) (getX() - getRadius()),
				(int) (getY() - getRadius()), 
				(int) (2 * getRadius()),
				(int) (2 * getRadius()));
	}

	public void draw(Graphics graphics) {
		Color oldColor = graphics.getColor();

		graphics.setColor(color);
		graphics.fillRect((int) (location.getX() - radius), (int) (location.getY() - radius), (int) (2 * getRadius()),
				(int) (2 * getRadius()));

		graphics.setColor(oldColor);
	}

}
