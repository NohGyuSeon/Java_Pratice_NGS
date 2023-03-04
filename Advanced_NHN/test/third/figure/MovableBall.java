package NGS.NHN.test.third.figure;

import java.awt.Color;

public class MovableBall extends Ball implements Movable {
	Motion motion;
	Vector vector;
	
	public MovableBall(Point location, double radius, Color color, Vector vector) {
		super(location, radius, color);
		this.vector = vector;
	}
	
	public MovableBall(Point location, double radius, Color color) {
		super(location, radius, color);
		motion = new Motion();
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
	
	@Override
	public void next() {
		location.move(motion.getDX(), motion.getDX());	
	}
	
}
