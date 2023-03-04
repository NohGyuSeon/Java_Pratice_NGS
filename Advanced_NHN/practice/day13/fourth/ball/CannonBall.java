package NGS.NHN.practice.day13.fourth.ball;

import java.awt.Color;

public class CannonBall extends MovableBall {
	
	public CannonBall(Point location, double radius, Color color) {
		super(location, radius, color);
	}
	
	public CannonBall(Point location, double radius) {
		super(location, radius);
	}
	
	public void move() {
		super.move();
		if (location.getY() < radius) {
			location.moveTo(location.getX(), radius);
			motion.setDXDY(0, 0);
			acceleration.setDXDY(0, 0);
		}
 		
	}
	

}
