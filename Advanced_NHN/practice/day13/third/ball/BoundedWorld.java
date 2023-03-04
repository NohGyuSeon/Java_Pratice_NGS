package NGS.NHN.practice.day13.third.ball;

/**
 * BoundedWorld 클래스.
 */
public class BoundedWorld extends MovableBallWorld {
	Region leftWall;
	Region rightWall;
	Region topWall;
	Region bottomWall;

	public BoundedWorld(int width, int height) {
		super(width, height);
		leftWall = new Region(-width, 0, width, height);
		rightWall = new Region(width, 0, width, height);
		topWall = new Region(0, height, width, height);
		bottomWall = new Region(0, -height, width, height);
	}

	/**
	 * BoundedWorld의 영역 반환.
	 *
	 * @return 영역
	 */
	public Region getRegion(double radius) {
		return new Region(2 * radius, 2 * radius, getWidth() - 4 * radius, getHeight() - 4 * radius);
	}

	@Override
	public void next() {
		for (Ball ball : balls) {
			if (ball instanceof MovableBall) {
				MovableBall movableBall = (MovableBall) ball;

				movableBall.move();

				if (leftWall.isCollision(movableBall.getRegion()) || rightWall.isCollision(movableBall.getRegion())) {
					movableBall.turnX();
				}

				if (topWall.isCollision(movableBall.getRegion()) || bottomWall.isCollision(movableBall.getRegion())) {
					movableBall.turnY();
				}

			}

		}

	}
}
