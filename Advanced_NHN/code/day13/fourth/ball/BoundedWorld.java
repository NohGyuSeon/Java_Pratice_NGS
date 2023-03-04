package NGS.NHN.code.day13.fourth.ball;

public class BoundedWorld extends MovableBallWorld {
    Region leftWall;
    Region rightWall;
    Region topWall;
    Region bottomWall;

    public BoundedWorld(int width, int height) {
        super(width, height);
        leftWall = new Region(-width - 1.0, 0, width, height);
        rightWall = new Region(width + 1.0, 0, width, height);
        topWall = new Region(0, height + 1.0, width, height);
        bottomWall = new Region(0, -height - 1.0, width, height);
    }


    @Override
    public void next() {
        for(Ball ball : balls) {
            if (ball instanceof MovableBall) {
                MovableBall movableBall = (MovableBall)ball;

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
