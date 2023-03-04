package NGS.NHN.practice.day15.second.ball;

import java.awt.Color;
import java.awt.Graphics;

public class Box extends Shape {
    double width;
    double height;
    Color color;

    public Box(Point location, double width, double height, Color color) {
        super(location);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Box(Point location, double width, double height) {
        this(location, width, height, Color.RED);
    }

    public double getWidth() {
        return  width;
    }

    public double getHeight() {
        return  height;
    }

    public Color getColor() {
        return  color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Region getRegion() {
        return new Region((int) (getX() - getWidth() / 2), (int) (getY() - getHeight() / 2),
                (int) getWidth(), (int) getHeight());
    }


    public void draw(Graphics graphics) {
        Color oldColor = graphics.getColor();

        graphics.setColor(color);
        graphics.fillRect((int) (getX() - getWidth() / 2), (int) (getY() - getHeight() / 2),
                (int) getWidth(), (int) getHeight());

        graphics.setColor(oldColor);
    }
}
