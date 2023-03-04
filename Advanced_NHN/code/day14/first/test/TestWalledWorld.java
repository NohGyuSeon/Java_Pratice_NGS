package NGS.NHN.code.day14.first.test;

import java.awt.Color;

import NGS.NHN.practice.day14.first.ball.BoundedBall;
import NGS.NHN.practice.day14.first.ball.MovableBox;
import NGS.NHN.practice.day14.first.ball.Point;
import NGS.NHN.practice.day14.first.ball.WalledWorld;

public class TestWalledWorld {
	public static void main(String[] args) throws InterruptedException {
		WalledWorld world = new WalledWorld(500, 500);
		world.setInterval(100);
		
		BoundedBall ball1 = new BoundedBall(new Point(100, 100), 10, Color.DARK_GRAY);
		ball1.setVelocity(2); 
		ball1.setAngle(20);
		world.add(ball1);
		
		BoundedBall ball2 = new BoundedBall(new Point(200, 200), 15, Color.RED);
		ball2.setVelocity(4);
		ball2.setAngle(45);
		world.add(ball2);
		
		BoundedBall ball3 = new BoundedBall(new Point(300, 300), 20, Color.BLUE);
		ball3.setVelocity(6); 
		ball3.setAngle(120);
		world.add(ball3);
		
		MovableBox box1 = new MovableBox(new Point(400, 400), 10, Color.DARK_GRAY);
		box1.setVelocity(3);
		box1.setAngle(80);
		world.add(box1);
		
		MovableBox box2 = new MovableBox(new Point(300, 300), 10, Color.GREEN);
		box2.setVelocity(5); 
		box2.setAngle(160);
		world.add(box2);
		
		MovableBox box3 = new MovableBox(new Point(100, 100), 15, Color.MAGENTA);
		box3.setVelocity(10); 
		box3.setAngle(240);
		world.add(box3);
		
		MovableBox box4 = new MovableBox(new Point(200, 200), 20, Color.PINK);
		box4.setVelocity(10); 
		box4.setAngle(300);
		world.add(box4);
		
		
		
		world.setVisible(true);
		world.run(100); 
		
	}
}
