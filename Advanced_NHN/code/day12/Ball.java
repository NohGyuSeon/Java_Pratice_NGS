package NGS.NHN.code.day12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball {
	private Point location;
	private Color color;
	private double radius;
	private double x, y;
	
	Ball(Point location, double radius) {
		this.location = location;
		this.radius = radius;
		this.color = Color.black;
	}
	
	Ball(Point location, double radius, Color color) {
		this(location, radius);
		this.color = color;
	}
	
	public Point getLocation() {
		return location;
	}
	
	public void setLocation(Point location) {
		this.location = location;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(Color newColor) {
		color = newColor;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void paint(Graphics graphics) {
		Color oldColor = graphics.getColor();
		graphics.setColor(color);
		graphics.fillOval((int) (location.getX() - getRadius()), (int) (location.getY() - getRadius()),
                (int) (getRadius() * 2), (int) (getRadius() * 2));
	}
	
	public void setDisplacementX(double x) {
		this.x = x;
	}
	
	public void setDisplacementY(double y) {
		this.y = y;
	}
	
	public void setDisplacementXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveX(double x) {
		location.moveX(x);
	}
	
	public void moveY(double y) {
		location.moveX(y);
	}
	
	public void moveXY(double i, double j) {
		location.moveX(this.x);
		location.moveY(this.y);
	}


}
