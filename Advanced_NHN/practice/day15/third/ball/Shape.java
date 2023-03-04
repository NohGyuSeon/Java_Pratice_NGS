package NGS.NHN.practice.day15.third.ball;

import java.awt.Graphics;
import java.util.function.UnaryOperator;

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
    abstract void draw(Graphics graphics, UnaryOperator<Point> translate);
}
