package NGS.NHN.code.day13.second.ball;

public class BoundedWorld extends MovableBallWorld {
    /**
     * 왼쪽 벽
     */
    Region leftWall;

    /**
     * 오른쪽 벽
     */
    Region rightWall;

    /**
     * 위쪽 벽
     */
    Region topWall;

    /**
     * 아래쪽 벽
     */
    Region bottomWall;

    /**
     * 영역 설정시 영역 외곽에 벽을 생성한다.
     * @param width
     * @param height
     */
    public BoundedWorld(int width, int height) {
        super(width, height);
        leftWall = new Region(-width, 0, width, height);
        rightWall = new Region(width, 0, width, height);
        topWall = new Region(0, height, width, height);
        bottomWall = new Region(0, -height, width, height);
    }


    /**
     * Ball중에서 MovableBall을 찾아 이동 시킨 후 벽에 부딫혔는지 확인 후 방향 전황.
     */
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
