package NGS.NHN.practice.day13.fifth.ball;

import java.awt.Rectangle;

public class Region extends Rectangle {
    public Region() {
        super();
    }

    public Region(double x, double y, double width, double height) {
        super((int) x, (int) y, (int) width, (int) height);
    }

    public void move(Motion motion) {
        x += motion.getDX();
        y += motion.getDY();
    }

    public boolean isCollision(Region region) {
        return  intersects(region);
    }
}
