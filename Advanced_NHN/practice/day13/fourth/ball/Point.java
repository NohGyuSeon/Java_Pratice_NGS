package NGS.NHN.practice.day13.fourth.ball;

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
    
    public void move(Motion motion) {
    	x += motion.getDX();
    	y += motion.getDY();
    }
    
    public void moveTo(double x, double y) {
    	this.x = x;
    	this.y = y;
    }
}
