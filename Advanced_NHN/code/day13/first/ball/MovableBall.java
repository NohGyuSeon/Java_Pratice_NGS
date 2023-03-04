package NGS.NHN.code.day13.first.ball;

import java.awt.Color;

/**
 * MovableBall class.
 */
public class MovableBall extends Ball {
    double distance;
    double angle;

    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    public MovableBall(Point location, double radius) {
        super(location, radius);
    }

    public void setMotion(double distance, double angle) {
        this.distance = distance;
        this.angle = angle;
    }

    /**
     * 단위 시간동안 움직임.
     */
    public void move() {
        double radians = Math.toRadians(angle);
        double dx = distance * Math.cos(radians);
        double dy = distance * Math.sin(radians);

        location.move(dx, dy);
    }

    /**
     * 볼의 X축 진행 방향을 반대로 뒤집다.
     */
    public void turnX() {
        angle = 180 - angle;
    }

    /**
     * 볼의 Y축 진행 방향을 반대로 뒤집다.
     */
    public void turnY() {
        angle = -angle;
    }
}
