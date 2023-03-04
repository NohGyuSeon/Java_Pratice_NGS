package NGS.NHN.practice.day15.first.test;

import java.awt.Color;

import NGS.NHN.practice.day15.first.ball.MovableBall;
import NGS.NHN.practice.day15.first.ball.MovableWorld;
import NGS.NHN.practice.day15.first.ball.Point;

public class TestMovableWorld {
	public static void main(String[] args) throws InterruptedException {
		MovableWorld movableWorld = new MovableWorld(400, 500);
		 
		MovableBall movableBall = new MovableBall(new Point(50, 50), 30, Color.BLACK);	//
		movableBall.setVelocity(10);	//
		movableBall.setAngle(30);	//
		
		movableWorld.setInterval(200);
		movableWorld.add(movableBall);	//
		
		movableWorld.setVisible(true);
		movableWorld.run(100);
		
	}

}
  