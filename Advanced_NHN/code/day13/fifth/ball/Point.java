package NGS.NHN.code.day13.fifth.ball;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return  x;
    }

    public double getY() {
        return  y;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void move(Motion motion) {
        x += motion.getDX();
        y += motion.getDY();
    }

    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
