package NGS.NHN.code.day13.second.ball;

import java.awt.Color;

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

    public void move() {
        double radins = Math.toRadians(angle);
        double dx = distance * Math.cos(radins);
        double dy = distance * Math.sin(radins);

        location.move(dx, dy);
    }

    public void turnX() {
        angle = 180 - angle;
    }

    public void turnY() {
        angle = -angle;
    }
}
