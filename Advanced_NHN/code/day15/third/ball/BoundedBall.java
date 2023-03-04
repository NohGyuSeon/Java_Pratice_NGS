package NGS.NHN.code.day15.third.ball;

import java.awt.Color;
import java.util.List;

public class BoundedBall extends MovableBall implements Bounded {
    Region bounds;

    public BoundedBall(Point location, double radius, Color color) {
        super(location, radius, color);
        bounds = null;
    }

    public BoundedBall(Point location, double radius) {
        this(location, radius, Color.RED);
    }

    public void setBounds(Region bounds) {
        this.bounds = new Region((int) (bounds.getX() + radius), (int) (bounds.getY() + radius),
                (int) (bounds.getWidth() - 2 * radius), (int) (bounds.getHeight() - 2 * radius));
    }

    @Override
    public void next(List<Motion> effects) {
        super.next(effects);

        if ((bounds != null) && !bounds.isCollision(getRegion())) {
            if (getX() < bounds.getX() || (bounds.getX() + bounds.getWidth() < getX())) {
                turnX();
            }

            if (getY() < bounds.getY() || (bounds.getY() + bounds.getHeight() < getY())) {
                turnY();
            }
        }
    }

}
