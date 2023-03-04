package NGS.NHN.code.day15.second.ball;

import java.awt.Graphics;

public abstract class Shape {
    Point location;

    Shape(Point location) {
        this.location = location;
    }

    public double getX() {
        return  location.getX();
    }

    public double getY() {
        return  location.getY();
    }

    abstract Region getRegion();
    abstract void draw(Graphics graphics);
}
