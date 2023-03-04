package NGS.NHN.code.day14.first.ball;

public class WalledWorld extends BoundedWorld {
	Region leftWall;
	Region rightWall;
	Region topWall;
	Region bottomWall;

	public WalledWorld(int width, int height) {
		super(width, height);

		leftWall = new Region(-width, -height, width, 3 * height);
		rightWall = new Region(width, -height, width, 3 * height);
		topWall = new Region(-width, height, 3 * width, height);
		bottomWall = new Region(-width, -height, 3 * width, height);
	}

	public void next() {
		super.next();
		for (Ball ball : balls) {
			if (ball instanceof BoundedBall) {
				BoundedBall boundedBall = (BoundedBall) ball;

				if (leftWall.isCollision(boundedBall.getRegion()) || rightWall.isCollision(boundedBall.getRegion())) {
					boundedBall.turnX();
				}

				if (topWall.isCollision(boundedBall.getRegion()) || bottomWall.isCollision(boundedBall.getRegion())) {
					boundedBall.turnY();
				}

				for (Ball otherBall : balls) {
					if (boundedBall != otherBall) {
						if (boundedBall.getRegion().isCollision(otherBall.getRegion())) {
							boundedBall.turnX();
							boundedBall.turnY();
						}
					}
				}

				for (Box box : boxes) {
					if (boundedBall.getRegion().isCollision(box.getRegion())) {
						boundedBall.turnX();
						boundedBall.turnY();
					}
				}

			}
		}

		for (Box box : boxes) {
			if (box instanceof MovableBox) {
				MovableBox movableBox = (MovableBox) box;

				if (leftWall.isCollision(movableBox.getRegion()) || rightWall.isCollision(movableBox.getRegion())) {
					movableBox.turnX();
				}

				if (topWall.isCollision(movableBox.getRegion()) || bottomWall.isCollision(movableBox.getRegion())) {
					movableBox.turnY();
				}

				for (Box otherBox : boxes) {
					if (movableBox != otherBox) {
						if (movableBox.getRegion().isCollision(otherBox.getRegion())) {
							movableBox.turnX();
							movableBox.turnY();
						}
					}
				}
			}
		}

	}
}
