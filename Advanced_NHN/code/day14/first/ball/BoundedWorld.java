package NGS.NHN.code.day14.first.ball;

public class BoundedWorld extends MovableWorld {
	public BoundedWorld(int width, int height) {
		super(width, height);
	}

	public Region getRegion() {
		return new Region(0, 0, getWidth(), getHeight());
	}

	public void add(BoundedBall ball) {
		ball.setBounds(new Region(0, 0, getWidth(), getHeight()));
		super.add(ball);
	}
	
	
}
