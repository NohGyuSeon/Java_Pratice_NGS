package NGS.NHN.practice.day13.fifth.test;

import java.awt.Color;

import NGS.NHN.practice.day13.fifth.ball.BallWorldView;
import NGS.NHN.practice.day13.fifth.ball.Motion;
import NGS.NHN.practice.day13.fifth.ball.MovableBall;
import NGS.NHN.practice.day13.fifth.ball.MovableBallWorld;
import NGS.NHN.practice.day13.fifth.ball.Point;

public class TestMovableBallWorld {
    public static void main(String[] args) throws InterruptedException {
        MovableBallWorld ballWorld = new MovableBallWorld(new BallWorldView(500, 400));

        MovableBall ball = new MovableBall(new Point(50, 50), 50.0, Color.BLUE);
        ball.setMotion(new Motion(20, 45));
        ballWorld.add(ball);

        ballWorld.run(1000);
    }
}
