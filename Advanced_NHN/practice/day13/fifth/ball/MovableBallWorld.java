package NGS.NHN.practice.day13.fifth.ball;

public class MovableBallWorld extends BallWorld {
    long interval;

    public MovableBallWorld(BallWorldView view) {
        super(view);
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

    @Override
    public void run(long seconds) throws InterruptedException {
        view.setVisible(true);

        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() < startTime + seconds * 1000) {
            next();
            view.repaint();
            Thread.sleep(interval);
        }
    }
}
