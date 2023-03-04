package NGS.NHN.code.day13.second.ball;

import java.awt.Rectangle;

public class Region extends Rectangle {
    public Region() {
        super();
    }

    public Region(double x, double y, double width, double height) {
        super((int) x, (int) y, (int) width, (int) height);
    }

    public boolean isCollision(Region region) {
        return  intersects(region);
    }
}
