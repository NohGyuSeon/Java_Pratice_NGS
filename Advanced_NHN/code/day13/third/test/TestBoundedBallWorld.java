package NGS.NHN.code.day13.third.test;

import java.awt.Color;

import NGS.NHN.code.day13.third.ball.BoundedWorld;
import NGS.NHN.code.day13.third.ball.Motion;
import NGS.NHN.code.day13.third.ball.MovableBall;
import NGS.NHN.code.day13.third.ball.Point;

public class TestBoundedBallWorld {
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
