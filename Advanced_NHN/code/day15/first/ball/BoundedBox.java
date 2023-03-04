package NGS.NHN.code.day15.first.ball;

import java.awt.Color;

public class BoundedBox extends MovableBox implements Bounded {
    Region bounds;

    public BoundedBox(Point location, double width, double height, Color color) {
        super(location, width, height, color);
        bounds = null;
    }

    public BoundedBox(Point location, double width, double height) {
        this(location, width, height, Color.RED);
    }

    public void setBounds(Region bounds) {
        this.bounds = new Region((int) (bounds.getX() + width), (int) (bounds.getY() + height),
        (int) (bounds.getWidth() - 2*width), (int) (bounds.getHeight() - 2 * height));
    }

    public void turnX() {
        motion.setDX(-motion.getDX());
    }

    public void turnY() {
        motion.setDY(-motion.getDY());
    }

    @Override
    public void next() {
        super.next();

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
