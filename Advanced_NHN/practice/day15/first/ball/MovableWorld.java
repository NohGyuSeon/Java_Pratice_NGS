package NGS.NHN.practice.day15.first.ball;

public class MovableWorld extends World {
	long interval;	//
	
	public MovableWorld(int width, int height) {
		super(width, height);
		this.interval = 100;
	}
	
	public double getInterval() {	//
		return interval;
	}
	
	public void setInterval(long interval) {
		this.interval = interval;
	}
	
	public void next() {	//
		for (Shape shape : shapes) {
			if (shape instanceof Movable) {	//
				((Movable)shape).next();
			}
		}
	}
	
	public void run(long seconds) throws InterruptedException {		//
		long startTime = System.currentTimeMillis();	//
		while(System.currentTimeMillis() < startTime + seconds * 1000) {	//
			next();		//
			repaint();		//
			Thread.sleep(interval);	//
		}
	}
	
	
	

}
