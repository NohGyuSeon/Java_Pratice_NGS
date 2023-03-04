package NGS.NHN.code.day13.third.ball;

import java.awt.Color;

public class MovableBall extends Ball {
    Motion motion;

    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    public MovableBall(Point location, double radius) {
        super(location, radius);
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void move() {
        location.move(this.motion.getDX(), this.motion.getDY());
    }

    public void turnX() {
        motion.turnX();
    }

    public void turnY() {
        motion.turnY();
    }
}
