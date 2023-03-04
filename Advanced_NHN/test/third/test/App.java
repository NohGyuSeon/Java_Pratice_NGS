package NGS.NHN.test.third.test;

import java.awt.Color;

import NGS.NHN.test.third.figure.MovableBall;
import NGS.NHN.test.third.figure.Point;
import NGS.NHN.test.third.ground.BallWorld;

public class App {
	public static void main(String[] args) throws InterruptedException {
		BallWorld ground = new BallWorld(800, 600);

		MovableBall movableBall = new MovableBall(new Point(50, 50), 30, Color.BLACK);
		movableBall.setVelocity(10);
		movableBall.setAngle(30);

		ground.setInterval(200);
		ground.add(movableBall);
		
		ground.setVisible(true);
		ground.run(100);
	}

}
