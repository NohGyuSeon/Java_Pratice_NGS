package NGS.NHN.code.day13.fourth.test;

import java.awt.Color;

import NGS.NHN.code.day13.fourth.ball.Motion;
import NGS.NHN.code.day13.fourth.ball.MovableBall;
import NGS.NHN.code.day13.fourth.ball.MovableBallWorld;
import NGS.NHN.code.day13.fourth.ball.Point;

public class TestMovableBallWorld {
    public static void main(String[] args) throws InterruptedException {
        MovableBallWorld ballWorld = new MovableBallWorld(500, 400);

        MovableBall ball = new MovableBall(new Point(50, 50), 50.0, Color.BLUE);
        ball.setMotion(new Motion(20, 45));
        ballWorld.add(ball);

        ballWorld.setVisible(true);
        ballWorld.run(25);
    }
}
