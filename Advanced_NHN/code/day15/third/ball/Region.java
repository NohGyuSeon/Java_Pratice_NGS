package NGS.NHN.code.day15.third.ball;

import java.awt.Rectangle;

public class Region extends Rectangle {
    public Region(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public boolean isCollision(Region region) {
        return  intersects(region);
    }
}
