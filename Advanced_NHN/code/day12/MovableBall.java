package NGS.NHN.code.day12;

import java.awt.Color;
import java.awt.Rectangle;

public class MovableBall extends Ball {
	private Point oldLocation;
	private double distance;
	private double angle;

	MovableBall(Point location, double radius) {
		super(location, radius);
	}

	public MovableBall(Point location, double radius, Color color) {
		super(location, radius, color);
	}

	public void setDisplacement(double distance) {
		this.distance = distance;
	}

	public void setDisplacement(double distance, double angle) {
		this.distance = distance;
		this.angle = angle;
	}

	public double getDistance() {
		return distance;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	public void move(double distance, double angle) {
		setDisplacement(distance, angle);
		move();
	}

	public void move() {
		oldLocation = new Point(getLocation());
		getLocation().move(distance, angle);
	}

	public void moveRandom() {
		oldLocation = new Point(getLocation());
		getLocation().move(distance, Math.random() * 10000);
	}

	public void moveBack() {
		setLocation(oldLocation);
	}

	public Boolean isCollided(Rectangle rect) {
		Rectangle region = new Rectangle((int) (getLocation().getX() - getRadius()), (int) (getLocation().getY() - getRadius()),
				(int) (2 * getRadius()), (int) (2 * getRadius()));
		
		return rect.intersects(region);
	}
	
	public Boolean isContains(Rectangle rect) {
		return rect.contains((int) (getLocation().getX() - getRadius()), (int) (getLocation().getY() - getRadius()),
				(int) (2 * getRadius()), (int) (2 * getRadius()));
	}
}
