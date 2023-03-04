package NGS.NHN.practice.day13.fourth.test;

import java.awt.Color;

import NGS.NHN.practice.day13.third.ball.BoundedWorld;
import NGS.NHN.practice.day13.third.ball.Motion;
import NGS.NHN.practice.day13.third.ball.MovableBall;
import NGS.NHN.practice.day13.third.ball.Point;

/**
 * 테스트 코드.
 */
public class TestBoundedWorld {
	/**
	 * 테스트 메인.
	 *
	 * @param args 사용하지 않음
	 * @throws InterruptedException 처리하지 않음.
	 */
	   public static void main(String[] args) throws InterruptedException {
	        BoundedWorld ballWorld = new BoundedWorld(500, 400);

	        MovableBall ball = new MovableBall(new Point(50, 50), 10.0, Color.BLUE);
	        ball.setMotion(new Motion(20, 45));
	        ballWorld.add(ball);
	        ballWorld.setInterval(10);
	        ballWorld.setVisible(true);
	        ballWorld.run(25);
	    }
	}
