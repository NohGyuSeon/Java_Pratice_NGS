package NGS.NHN.practice.day13.fifth.ball;

import java.awt.Color;

public class CannonBall extends MovableBall {

    public CannonBall(Point location, double radius, Color color) {
        super(location, radius, color);
    }

    public CannonBall(Point location, double radius) {
        super(location, radius);
    }

    @Override
    public void move() {
        super.move();
        if (location.getY() < radius) {
            location.moveTo(location.getX(), radius);
            this.motion.setVelocity(0);
            this.acceleration.setVelocity(0);
        }
    }
}
