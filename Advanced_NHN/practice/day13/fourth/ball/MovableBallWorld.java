package NGS.NHN.practice.day13.fourth.ball;

/**
 * MovableBallWorld class.
 */
public class MovableBallWorld extends BallWorld {
    long interval;

    public MovableBallWorld(int width, int height) {
    	super(width, height);
    	interval = 100;
    }
    
    public long getInterval() {
    	return interval;
    }
    
    public void setInterval(long interval) {
    	this.interval = interval;
    }

    /**
     * 공간에서 단위 시간만큼 진행 시킨다.
     */
    public void next() {
    	for(Ball ball: balls) {
    		if(ball instanceof MovableBall) {
    			((MovableBall) ball).move();
    		}
    	}
    }

    /**
     * 단위 시간단위로 동작 시간동안 움직이도록 반복함.
     *
     * @param seconds 동작 시간
     * @throws InterruptedException sleep 중 예외 발생
     */
    public void run(long seconds) throws InterruptedException {
    	long startTime = System.currentTimeMillis();
    	while (System.currentTimeMillis() < startTime + seconds * 1000) {
    		next();
    		repaint();
    		Thread.sleep(interval);
    	}
    }
}
