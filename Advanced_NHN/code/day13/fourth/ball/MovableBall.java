package NGS.NHN.code.day13.fourth.ball;

import java.awt.Color;

public class MovableBall extends Ball {
    Motion motion;
    Motion acceleration;

    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
        motion = new Motion();
        acceleration = new Motion();
    }

    public MovableBall(Point location, double radius) {
        super(location, radius);
        motion = new Motion();
        acceleration = new Motion();
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void setAcceleration(Motion acceleration) {
        this.acceleration = acceleration;
    }

    public void addAcceleration(Motion acceleration) {
        this.acceleration.add(acceleration);
    }

    public void move() {
        motion.add(acceleration);
        location.move(motion.getDX(), motion.getDY());
    }

    public void turnX() {
        motion.turnX();
    }

    public void turnY() {
        motion.turnY();
    }
}
