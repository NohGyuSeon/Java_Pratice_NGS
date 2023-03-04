package NGS.NHN.code.day13.first.ball;

/**
 * BoundedWorld 클래스.
 */
public class BoundedWorld extends MovableBallWorld {

    public BoundedWorld(int width, int height) {
        super(width, height);
    }

    /**
     * BoundedWorld의 영역 반환.
     *
     * @return 영역
     */
    public Region getRegion(double radius) {
        return  new Region(2 * radius, 2 * radius, getWidth() - 4 * radius, getHeight() - 4 * radius);
    }

    @Override
    public void next() {
        balls.stream()
            .filter(MovableBall.class::isInstance)
            .map(MovableBall.class::cast)
            .forEach(ball -> {
                ball.move();

                if (!getRegion(ball.getRadius()).isCollision(ball.getRegion())) {
                    if ((ball.getLocation().getX() < ball.getRadius())
                            || (getWidth() - ball.getRadius() < ball.getLocation().getX())) {
                        ball.turnX();
                    }

                    if ((ball.getLocation().getY() < ball.getRadius())
                            || (getHeight() - ball.getRadius() < ball.getLocation().getY())) {
                        ball.turnY();
                    }
                }
            });
    }
}
