package NGS.NHN.code.day15.first.ball;

import java.awt.Color;

public class BoundedBall extends MovableBall implements Bounded {
	Region bounds;	//
	
	public BoundedBall(Point location, double radius, Color color) {	//
		super(location, radius, color);	//
		bounds = null;	//
	}
	
	public BoundedBall(Point location, double radius) {	//
		super(location, radius, Color.RED);	//
	}
	
	@Override
	public void setBounds(Region bounds) {	//
		this.bounds = new Region((int)(bounds.getX() + radius), (int)(bounds.getY() + radius),	// 
				(int) (bounds.getWidth()-2*radius), (int) (bounds.getHeight() -2*radius));
	}
	
	@Override
	public void turnX() {
		motion.setDX(-motion.getDX());	//
	}

	@Override
	public void turnY() {
		motion.setDY(-motion.getDY());	//
	}
	
	public void next() {	//
		super.next();	//
		
		if ((bounds != null) && !bounds.isCollision(getRegion())) {	//
			if (getX() < bounds.getX() || (bounds.getX() + bounds.getWidth() < getX())) {	//
				turnX();
			}
			
			if (getY() < bounds.getY() || (bounds.getY() + bounds.getHeight() < getY())) {	//
				turnY();
			}
		}
	}
	
	
}
