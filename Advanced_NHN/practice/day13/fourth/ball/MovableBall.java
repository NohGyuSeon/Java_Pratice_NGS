package NGS.NHN.practice.day13.fourth.ball;

import java.awt.Color;

/**
 * MovableBall class.
 */
public class MovableBall extends Ball {
	Motion motion;
	Motion acceleration;
	
	public MovableBall(Point location, double radius, Color color) {
		super(location, radius, color);
		motion = new Motion();
		acceleration = new Motion();
	}
	
	public MovableBall(Point location, double radius) {
		super(location, radius);
		motion = new Motion();
		acceleration = new Motion();
	}
	
	// setMotion
	public void setMotion(Motion motion) {
		this.motion = motion;
	}
	
	public void setAcceleration(Motion accleration) {
		this.acceleration = accleration;
	}
	
	public void addAcceleration(Motion accleration) {
		this.acceleration.add(accleration);
	}
	
    /**
     * 단위 시간동안 움직임.
     */
	public void move() {
		motion.add(acceleration);
		location.move(this.motion.getDX(), this.motion.getDY());
	}
	
    /**
     * 볼의 X축 진행 방향을 반대로 뒤집다.
     */
    public void turnX() {
    	motion.turnx();
    }

    /**
     * 볼의 Y축 진행 방향을 반대로 뒤집다.
     */
    public void turnY() {
    	motion.turnY();
    }
}
