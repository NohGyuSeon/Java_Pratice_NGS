package NGS.NHN.practice.day13.fifth.ball;

import java.awt.Color;

public class Ball {
    Point   location;
    double  radius;
    Color   color;

    public Ball(Point location, double radius, Color color) {
        this.location = location;
        this.radius = radius;
        this.color = color;
    }

    public Ball(Point locPoint, double raduis) {
        this(locPoint, raduis, Color.BLACK);
    }

    public Point getLocation() {
        return  location;
    }

    public double getRadius() {
        return  radius;
    }

    public Color getColor() {
        return  color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Region getRegion() {
        return  new Region(location.x - radius, location.y - radius, 2 * radius, 2 * radius);
    }
}
