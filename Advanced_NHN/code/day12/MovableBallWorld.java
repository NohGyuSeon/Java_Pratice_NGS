package NGS.NHN.code.day12;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MovableBallWorld extends MultiBallWorld {
	
	List<MovableBall> balls;
	Rectangle rectangle, ballRect;
	
	public MovableBallWorld(int width, int height) {
		super(width, height);
		setTitle("Movable-Ball World");
		
		balls = new LinkedList<>();
		rectangle = new Rectangle(0, 0, width, height);
	}
	
	public void add(MovableBall ball) {
		balls.add(ball);
	}

	public void step() {

	}
	   
	public void paint(Graphics graphics) {
		super.paint(graphics);
		for (Ball ball: balls) {
			ball.paint(graphics);
		}
	}

	public void run(int seconds) throws InterruptedException {
		int flags[] = new int[balls.size()];
		Arrays.fill(flags, 1);
		try {
		
			while (true) {
				
				for (MovableBall ball : balls) {
//					System.out.println("Collision: " + ball.isCollided(rectangle));
					System.out.println("Contains: " + ball.isContains(rectangle));
					
//					ball.move(1*flag, ball.getAngle());
 					
//					if (ball.isCollided(rectangle) == false) {
//						System.out.println("통과!");
//					} else {
//						System.out.println("충돌!!");
//					}
//					
//					if (ball.isContains(rectangle) == false) {
//						System.out.println("통과!");
//					} else {
//						System.out.println("충돌!!");
//					}
				}
				
				

				for (int i = 0; i < balls.size(); i++) {
					
					if (balls.get(i).isContains(rectangle) == false) {
						flags[i] += flags[i]++;
						flags[i]*= -1;
						if (Math.abs(flags[i]) > 10) {
							
						}
					} 
					
					
					balls.get(i).move(1*flags[i], balls.get(i).getAngle());
				}

				
				
				repaint();
				Thread.sleep(seconds);
//				System.out.println(System.currentTimeMillis());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
