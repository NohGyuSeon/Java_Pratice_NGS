package NGS.NHN.code.day13.fifth.ball;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Logger;
import java.awt.Graphics;

public class BallWorldView extends Frame {
    Logger logger;
    BallWorld controller;

    public BallWorldView(int width, int height) {
        super();

        logger = Logger.getLogger("global");
        setSize(width, height);
    }


    public void setController(BallWorld controller) {
        this.controller = controller;
    }

    public int translateY(int y) {
        return  getHeight() - y;
    }

    protected void draw(Graphics graphics, Ball ball) {
        graphics.setColor(ball.getColor());
        graphics.fillOval((int) (ball.getLocation().getX() - ball.getRadius()),
                translateY((int) (ball.getLocation().getY() + ball.getRadius())),
                (int) (2 * ball.getRadius()), (int) (2 * ball.getRadius()));
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);

        if (this.controller != null) {
            for(Ball ball : this.controller.getBalls()) {
                Color oldColor = graphics.getColor();
                draw(graphics, ball);
                graphics.setColor(oldColor);
            }
        }
    }
}
