package NGS.NHN.practice.day16.first.test;

import java.awt.Color;

import NGS.NHN.practice.day16.first.ball.MovableBall;
import NGS.NHN.practice.day16.first.ball.MovableBox;
import NGS.NHN.practice.day16.first.ball.MovableWorld;
import NGS.NHN.practice.day16.first.ball.Point;

public class TestMovableWorld {
	public static void main(String[] args) throws InterruptedException {
		MovableWorld movableWorld = new MovableWorld(400, 500);
		movableWorld.setInterval(100);
		
		MovableBall ball1 = new MovableBall(new Point(120, 160), 40, Color.YELLOW);
		ball1.setVelocity(10);
		ball1.setAngle(30);
		movableWorld.add(ball1);
		
		MovableBox box1  = new MovableBox(new Point(220, 260), 20, 20);
		box1.setVelocity(30);
		box1.setAngle(45);
		movableWorld.add(box1);
		 
		movableWorld.setVisible(true);
		movableWorld.run(100);
	}
}
