package NGS.NHN.code.day14.first.ball;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public class World extends Frame {
//	Ball ball;
	List<Ball> balls;
	List<Box> boxes;
	
	public World(int width, int hegith) {
		super();
		
		setSize(width, hegith);
		
		balls = new LinkedList<>();
		boxes = new LinkedList<>();
//		ball = new Ball(width / 2, hegith / 2, 50);
	}
	
	public void add(Ball ball) {
		balls.add(ball);
	}
	
	public void add(Box box) {
		boxes.add(box);
	}
	
	@Override
	public void paint(Graphics graphics) {
		for (Ball ball : balls) {
			ball.draw(graphics);
		}
		
		for (Box box : boxes) {
			box.draw(graphics);
		}
	}

	
}
