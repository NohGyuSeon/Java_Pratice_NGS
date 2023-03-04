package NGS.NHN.code.day13.third.ball;

public class MovableBallWorld extends BallWorld {
    long interval;

    public MovableBallWorld(int width, int height) {
        super(width, height);
        interval = 100;
    }

    public long getInterval() {
        return  interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public void next() {
        for(Ball ball : balls) {
            if (ball instanceof MovableBall) {
                ((MovableBall)ball).move();
            }
        }
    }

    public void run(long seconds) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() < startTime + seconds * 1000) {
            next();
            repaint();
            Thread.sleep(interval);
        }
    }
}
