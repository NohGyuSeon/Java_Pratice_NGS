package NGS.NHN.code.day15.first.ball;

import java.awt.Color;

public class MovableBall extends Ball implements Movable {
	Motion motion;	//
	
	public MovableBall(Point location, double radius, Color color) {
		super(location, radius, color);
		motion = new Motion();
	}
	
	public MovableBall(Point location, double radius) {
		this(location, radius, Color.DARK_GRAY);	//
	}
	
	public double getVelocity() {	//
		return motion.getVelocity();		//
	}
	
	public void setVelocity(double velocity) {	//
		this.motion.setVelocity(velocity);	// *
	}
	
	public double getAngle() {	//
		return motion.getAngle();	//
	}
	
	public void setAngle(double angle) {	//
		this.motion.setAngle(angle);	// *			 
	}
	
	@Override
	public void next() {
		location.move(motion.getDX(), motion.getDX());	//
	}
	
}
