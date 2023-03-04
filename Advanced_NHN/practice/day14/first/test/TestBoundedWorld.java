package NGS.NHN.practice.day14.first.test;

import NGS.NHN.practice.day14.first.ball.BoundedBall;
import NGS.NHN.practice.day14.first.ball.BoundedWorld;
import NGS.NHN.practice.day14.first.ball.Point;

public class TestBoundedWorld {
	
	public static void main(String[] args) throws InterruptedException {
		BoundedWorld world = new BoundedWorld(500, 400);
		world.setInterval(100);
		
		BoundedBall ball = new BoundedBall(new Point(100, 100), 20);
		ball.setVelocity(5);
		ball.setAngle(20);
		world.add(ball);
		
		BoundedBall ball2 = new BoundedBall(new Point(200, 200), 40);
		ball2.setVelocity(10);
		ball2.setAngle(40);
		world.add(ball2);
		
		BoundedBall ball3 = new BoundedBall(new Point(100, 100), 60);
		ball3.setVelocity(15);
		ball3.setAngle(60);
		world.add(ball3);
		
		world.setVisible(true);
		world.run(100);
		
	}

}
