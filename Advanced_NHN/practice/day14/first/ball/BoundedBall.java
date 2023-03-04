package NGS.NHN.practice.day14.first.ball;

import java.awt.Color;

public class BoundedBall extends MovableBall {
	Region bounds;

	public BoundedBall(Point location, double radius, Color color) {
		super(location, radius, color);
		bounds = null;
	}

	public BoundedBall(Point location, double radius) {
		this(location, radius, Color.RED);
	}

	public void setBounds(Region bounds) {
		this.bounds = bounds;
	}
	
	public void turnX() {
		motion.setDX(-motion.getDX());
	}

	public void turnY() {
		motion.setDY(-motion.getDY());
	}
	
	@Override
	public void next() {
		super.next();
		
		if(bounds != null || !bounds.isCollision(getRegion())) {
			if (getX() < bounds.getX() || (bounds.getX() + bounds.getWidth() < getX())) {
				turnX();
			}
			
			if (getY() < bounds.getY() || (bounds.getY() + bounds.getWidth() < getY())) {
				turnY();
			}
			
			
		}
	}

}
