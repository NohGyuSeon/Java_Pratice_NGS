package NGS.NHN.code.day13.third.ball;

import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.awt.Graphics;

public class BallWorld extends Frame {
    Logger logger;
    List<Ball>  balls;

    public BallWorld(int width, int height) {
        super();

        logger = Logger.getLogger("global");
        balls = new LinkedList<>();

        setSize(width, height);
    }

    public void add(Ball ball) {
        balls.add(ball);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        for(Ball ball : balls) {
            ball.draw(graphics);
        }
    }
}
