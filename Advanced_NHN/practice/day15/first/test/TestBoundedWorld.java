package NGS.NHN.practice.day15.first.test;

import java.awt.Color;

import NGS.NHN.practice.day15.first.ball.BoundedBall;
import NGS.NHN.practice.day15.first.ball.BoundedWorld;
import NGS.NHN.practice.day15.first.ball.Point;

public class TestBoundedWorld {
	public static void main(String[] args) throws InterruptedException {
		BoundedWorld boundedWorld = new BoundedWorld(500, 500);
		
		BoundedBall boundedball = new BoundedBall(new Point(30, 30), 20, Color.BLUE);
		boundedball.setVelocity(20);
		boundedball.setAngle(45);
		
		boundedWorld.setInterval(100);
		boundedWorld.add(boundedball);	//
		
		boundedWorld.setVisible(true);
		boundedWorld.run(100);
		
	}
}
