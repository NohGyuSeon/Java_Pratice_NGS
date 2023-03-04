package NGS.NHN.test.third.figure;

import java.awt.Color;
import java.awt.Graphics;

public class Pentagon {
    protected Point location;
    private double radius;
    private Color color;
    Vector vector;

    public Pentagon(Point location, double radius, Color color, Vector vector) {
        this.location = location;
        this.radius = radius;
        this.color = color;
        this.vector = vector;
    }

    public double getX() {
        return location.getX();
    }

    public double getY() {
        return location.getY();
    }

    public Point getLocation() {
        return location;
    }

    public double getRadius() {
        return radius;
    }

    public void draw(Graphics pen) {
        Color oldColor = pen.getColor();
        pen.setColor(color);

        // int xArray[] = { (int) (location.getX()) + 30,
        //         (int) (location.getX()) + 60,
        //         (int) (location.getX()) + 90,
        //         (int) (location.getX()) + 78,
        //         (int) (location.getX()) + 42 };

        // int yArray[] = { (int) (location.getY()) + 60,
        //         (int) (location.getY()) + 37,
        //         (int) (location.getY()) + 60,
        //         (int) (location.getY()) + 90,
        //         (int) (location.getY()) + 90 };

        int xArray[] = { (int) (location.getX() +  getRadius()),
                (int) (location.getX() + getRadius()) + 30,
                (int) (location.getX() + getRadius()) + 60,
                (int) (location.getX() + getRadius()) + 48,
                (int) (location.getX() + getRadius()) + 12 };

        int yArray[] = { (int) (location.getY() + getRadius()) + 30,  
                (int) (location.getY() + getRadius()) + 7,
                (int) (location.getY() + getRadius()) + 30,
                (int) (location.getY() + getRadius()) + 60,
                (int) (location.getY() + getRadius()) + 60 };

        pen.fillPolygon(xArray, yArray, 5);

        pen.setColor(oldColor);
    }

    public void move(Region barrier) {
        if (location.getY() + 2*getRadius() >= barrier.getBottom()) {
            vector.setDY(-vector.getDY());
        }
        if (location.getX() + 2*getRadius() >= barrier.getRight()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getX() + getRadius() <= barrier.getLeft()) {
            vector.setDX(-vector.getDX());
        }
        if (location.getY() + 2*getRadius() <= barrier.getTop()) {
            vector.setDY(-vector.getDY());
        }
        location.setPoint(vector);
    }

}