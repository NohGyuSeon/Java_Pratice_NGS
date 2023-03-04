package NGS.NHN.code.day16.first.ball;

import java.awt.Color;
import java.util.List;

public class MovableBox extends Box implements Movable {
    Motion  motion;

    public MovableBox(Point location, double width, double height, Color color) {
        super(location, width, height, color);
        motion = new Motion();
    }

    public MovableBox(Point location, double width, double height) {
        this(location, width, height, Color.BLUE);
    }

    public void setMotion(Motion motion) {
        this.motion = motion;
    }

    public void stop() {
        this.motion.setVelocity(0);
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

    public void turnX() {
        motion.setDX(-motion.getDX());
    }

    public void turnY() {
        motion.setDY(-motion.getDY());
    }

    public void next(List<Motion> effects) {
        if (motion.getVelocity() != 0) {
            if (effects != null) {
                for (Motion effect : effects) {
                    motion.add(effect);
                }
            }
            location.move(motion.getDX(), motion.getDY());
        }
    }

}
