package NGS.NHN.code.day13.first.ball;

/**
 * 좌표를 표시하기 위한 Point class.
 */
public class Point {
    double x0;
    double y0;

    public Point(double x, double y) {
        this.x0 = x;
        this.y0 = y;
    }

    public double getX() {
        return  x0;
    }

    public double getY() {
        return  y0;
    }

    public void move(double dx, double dy) {
        x0 += dx;
        y0 += dy;
    }
}
