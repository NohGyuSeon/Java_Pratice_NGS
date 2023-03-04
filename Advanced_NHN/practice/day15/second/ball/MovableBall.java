package NGS.NHN.practice.day15.second.ball;

import java.awt.Color;
import java.util.List;

public class MovableBall extends Ball implements Movable {
    Motion  motion;

    public MovableBall(Point location, double radius, Color color) {
        super(location, radius, color);
        motion = new Motion();
    }

    public MovableBall(Point location, double radius) {
        this(location, radius, Color.BLUE);
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public double getVelocity() {
        return motion.getVelocity();
    }

    public double getAngle() {
        return motion.getAngle();
    }

    public void setVelocity(double velocity) {
        this.motion.setVelocity(velocity);
    }

    public void setAngle(double angle) {
        this.motion.setAngle(angle);
    }

    public void next(List<Motion> effects) {

        if (effects != null) {
            for(Motion effect : effects) {
                motion.add(effect);
            }
        }
        location.move(motion.getDX(), motion.getDY());
    }
}
