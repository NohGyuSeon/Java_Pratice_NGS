package NGS.NHN.code.day12;

public class Point {
 	private double x, y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point anotherPoint) {
		this.x = anotherPoint.getX();
		this.x = anotherPoint.getY();
	}
	
	public double getX() { 
		return this.x;
	}
	
	public void setX(double x) { 
		this.x = x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void moveX(double x) {
		this.x += x;
	}
	
	public void moveY(double y) {
		this.y += y;
	}
	
    public void move(double distacne, double angle) {
    	x += distacne * Math.cos(Math.toRadians(angle));
    	y += distacne * Math.sin(Math.toRadians(angle));
    }
    
    
}
