package NGS.NHN.practice.day14.first.ball;

public class MovableWorld extends World {
	long interval;
	
	public MovableWorld(int width, int height) {
		super(width, height);
		interval = 0;
	}
	
	public double getInterval() {
		return interval;
	}
	
	public void setInterval(long interval) {
		this.interval = interval;
	}
	
	public void next() {
		for (Ball ball : balls) {
			if (ball instanceof MovableBall) {
				((MovableBall)ball).next();
			}
		}
		
		for (Box box: boxes) {  
			if (box instanceof MovableBox) {
				((MovableBox)box).next();
			}
		}
	}
	
	public void run(long seconds) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		while(System.currentTimeMillis() < startTime + seconds * 1000) {
			next();
			repaint();
			Thread.sleep(10);
		}
	}
	
	
	
	
}
