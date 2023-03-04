package NGS.NHN.practice.day13.fifth.ball;

import java.awt.Color;
import java.awt.Frame;
import java.util.logging.Logger;
import java.awt.Graphics;

public class BallWorldView extends Frame {
    Logger logger;
    BallWorld controller;
    double scale;
    
    public BallWorldView(int width, int height) {
        super();

        logger = Logger.getLogger("global");
        setSize(width, height);
    }
    
    public BallWorldView(int width, int height, double scale) {
        this(width, height);
        this.scale = scale;
    }

    public void setController(BallWorld controller) {
        this.controller = controller;
    }
    
    public double scalingX(double x) {
        return x / scale;
    }

    public double scalingY(double y) {
        return  getHeight() - y / scale;
    }
    
    public int translateY(int y) {
        return  getHeight() - y;
    }

    public double scalingLength(double length) {
        return length / scale;
    }
    
    protected void draw(Graphics graphics, Ball ball) {
        graphics.setColor(ball.getColor());
        graphics.fillRect(
                (int) scalingX(ball.getLocation().getX() - ball.getRadius()),
                (int) scalingY(ball.getLocation().getY() + ball.getRadius()),
                (int) (2 * scalingLength(ball.getRadius())),
                (int) (2 * scalingLength(ball.getRadius())));
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
