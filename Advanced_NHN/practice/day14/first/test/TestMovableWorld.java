package NGS.NHN.practice.day14.first.test;

import NGS.NHN.practice.day14.first.ball.MovableBall;
import NGS.NHN.practice.day14.first.ball.MovableWorld;
import NGS.NHN.practice.day14.first.ball.Point;

public class TestMovableWorld {
	public static void main(String[] args) throws InterruptedException {
		MovableWorld world = new MovableWorld(500, 500);

		world.setInterval(100);
		MovableBall ball1 = new MovableBall(new Point(100, 100), 50);
		ball1.setVelocity(1);
		ball1.setAngle(30);
		world.add(ball1);
		
		MovableBall ball2 = new MovableBall(new Point(200, 200), 75);
		ball2.setVelocity(2);
		ball2.setAngle(60);
		world.add(ball2);
		
		MovableBall ball3 = new MovableBall(new Point(300, 300), 100);
		ball3.setVelocity(3);
		ball3.setAngle(90);
		world.add(ball3);
		
		world.setVisible(true);
		world.run(100);
		
		
		
		
	}

}
