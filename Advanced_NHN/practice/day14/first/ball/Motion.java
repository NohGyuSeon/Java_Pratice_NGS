package NGS.NHN.practice.day14.first.ball;

public class Motion {
	double velocity;
	double angle;
	double dx;
	double dy;

	public Motion() {
		this.velocity = 0;
		this.angle = 0;
		this.dx = 0;
		this.dy = 0;
	}
	
	public double getVelocity() {
		return this.velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
		updateDXDY();
	}

	public double getAngle() {
		return this.angle;
	}

	public void setAngle(double angle) {
		this.angle = angle;
		updateDXDY();
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
		this.dx = dx;
		this.dy = dy;
		updateVelocityAndAngle();
	}

	public void add(Motion motion) {
		this.dx += motion.getDX();
		this.dy += motion.getDY();
		updateVelocityAndAngle();
	}

	protected void updateDXDY() {
		double radian = Math.toRadians(angle);
		dx = velocity * Math.cos(radian);
		dy = velocity * Math.sin(radian);
	}

	protected void updateVelocityAndAngle() {
		velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		angle = Math.toDegrees(Math.asin(dy / velocity));
	}
	
}
