package NGS.NHN.code.day13.fifth.ball;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class BallWorld {
    Logger logger;
    List<Ball>  balls;
    BallWorldView view;

    public BallWorld(BallWorldView view) {
        super();

        logger = Logger.getLogger("global");
        balls = new LinkedList<>();
        this.view = view;
        this.view.setController(this);
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return      balls;
    }

    public void run(long seconds) throws InterruptedException {
        view.setVisible(true);
        Thread.sleep(seconds * 1000);
    }
}
