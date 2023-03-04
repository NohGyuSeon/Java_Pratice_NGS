package NGS.NHN.code.day12;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MultiBallWorld extends Frame {
	
 	List<Ball> balls;
	
 	public MultiBallWorld() {}
 	
	public MultiBallWorld(int width, int height) {
		setTitle("Multi-Ball World");
		setSize(width, height);
		
		balls = new LinkedList<>();
	}
	
	public void add(Ball ball) {
		balls.add(ball);
	}
	
	public int getBallCount() {
		return balls.size();
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		for (Ball ball: balls) {
			ball.paint(graphics);
		}
	}

	
	
}
