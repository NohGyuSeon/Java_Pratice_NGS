package NGS.NHN.test.third.figure;

public class Point {
	double x;
	double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.x = y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
//    public void setPoint(Vector vector) {
//        this.x += vector.getDX();
//        this.y += vector.getDY();
//    }
    
	public void move(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	} 
	
    public void setPoint(Vector vector) {
        this.x += vector.getDX();
        this.y += vector.getDY();
    }
	
}

