package NGS.NHN.practice.day13.fifth.ball;

public class BoundedWorld extends MovableBallWorld {
    Region leftWall;
    Region rightWall;
    Region topWall;
    Region bottomWall;

    public BoundedWorld(BallWorldView view) {
        super(view);
        leftWall = new Region(-view.getWidth() - 1.0, 0, view.getWidth(), view.getHeight());
        rightWall = new Region(view.getWidth() + 1.0, 0, view.getWidth(), view.getHeight());
        topWall = new Region(0, view.getHeight() + 1.0, view.getWidth(), view.getHeight());
        bottomWall = new Region(0, -view.getHeight() - 1.0, view.getWidth(), view.getHeight());
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
