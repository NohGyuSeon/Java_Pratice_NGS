package NGS.NHN.code.day15.first.ball;

public class Motion {
	double dx;	//
	double dy;	//
	double velocity;
	double angle; 
	
	public Motion() {	//
		dx = 0; 
		dy = 0;
		velocity = 0;
		angle = 0;
	}
	
	public double getDX() {
		return dx;
	}

	public void setDX(double dx) {
		this.dx = dx;
		updateVelocityAndAngle();
	}

	public double getDY() {
		return dy;
	}

	public void setDY(double dy) {
		this.dy = dy;
		updateVelocityAndAngle();
	}
	
	public void setDXDY(double dx, double dy) {
		setDX(dx);
		setDY(dy);
		updateVelocityAndAngle();
	}
	
	public double getVelocity() {
		return velocity;
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
		UpdateDXDY();
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
		UpdateDXDY();
	}
	
	public void UpdateDXDY() {
		double radian = Math.toRadians(angle);
		dx = velocity * Math.cos(radian);	//
		dy = velocity * Math.cos(radian);	//
	}
	
	public void updateVelocityAndAngle() {
		velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)); //
		angle = Math.toDegrees(Math.asin(dy / this.velocity)); //
	}

}
