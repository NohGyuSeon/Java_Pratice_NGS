package NGS.NHN.practice.day14.first.ball;

import java.awt.Color;

public class MovableBox extends Box {
	
	Motion motion; 
	
	public MovableBox(Point location, double radius, Color color) {
		super(location, radius, color);
		motion = new Motion();
	}
	
	public MovableBox(Point location, double radius) {
		this(location, radius, Color.BLACK);
	}

	public double getVelocity() {
		return motion.getVelocity();
	}

	public void setVelocity(double velocity) {
		this.motion.setVelocity(velocity);
	}

	public double getAngle() {
		return motion.getAngle();
	}

	public void setAngle(double angle) {
		this.motion.setAngle(angle);
	}
	
	public void next() {
		location.move(motion.getDX(), motion.getDY());
	}

	public void turnX() {
		motion.setDX(-motion.getDX());
	}

	public void turnY() {
		motion.setDY(-motion.getDY());
	}
	

}
