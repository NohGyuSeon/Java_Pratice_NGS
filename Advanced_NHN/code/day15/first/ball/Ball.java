package NGS.NHN.code.day15.first.ball;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Shape {
	double radius;
	Color color;

	public Ball(Point location, double radius, Color color) {
		super(location); //
		this.radius = radius;
		this.color = color;
	}

	public Ball(Point location, double radius) {
		this(location, radius, Color.BLACK); //
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
	
	@Override
	public Region getRegion() {	//
		return new Region((int) (getX() - getRadius()), (int) (getY() - getRadius()), (int) (2 * getRadius()),
				(int) (2 * getRadius()));
	}

	@Override
	void draw(Graphics graphics) {
		Color oldColor = graphics.getColor(); //
		graphics.setColor(color); //

		graphics.fillOval((int) (location.getX() - radius), (int) (location.getY() - radius), (int) (2 * radius),
				(int) (2 * radius)); //

		graphics.setColor(oldColor);
	}

}
