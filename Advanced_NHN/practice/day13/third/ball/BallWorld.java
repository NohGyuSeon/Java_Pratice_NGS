package NGS.NHN.practice.day13.third.ball;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * BallWorld class.
 */
public class BallWorld extends Frame {
    /**
     * 로거.
     */
	Logger logger;

    /**
     * 볼 리스트.
     */ 
	List<Ball> balls;

    /**
     * 생성자.
     *
     * @param width 폭
     * @param height 높이
     */
	public BallWorld(int width, int height) {
		super();
		
		logger = Logger.getLogger("global");
		balls = new LinkedList<>();
		
		setSize(width, height);
	}
	
	// ball add
	public void add(Ball ball) {
		balls.add(ball);
	}
	
	// paint 
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		
		for(Ball ball: balls) {
			ball.draw(graphics);
		}
		
	}
	

}
