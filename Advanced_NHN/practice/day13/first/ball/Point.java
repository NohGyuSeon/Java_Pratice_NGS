package NGS.NHN.practice.day13.first.ball;

/**
 * 좌표를 표시하기 위한 Point class.
 */
public class Point {
	double x;
	double y;
	
    public Point(double x, double y) {
    	this.x = x;
    	this.y = y;
    }

    public double getX() {
    	return x;
    }

    public double getY() {
    	return y;
    }

    public void move(double dx, double dy) {
    	x += dx;
    	y += dy; 
    }
}
