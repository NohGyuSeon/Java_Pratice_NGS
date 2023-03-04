package NGS.NHN.code.day13.fifth.test;

import java.awt.Color;

import NGS.NHN.code.day13.fifth.ball.Ball;
import NGS.NHN.code.day13.fifth.ball.BallWorld;
import NGS.NHN.code.day13.fifth.ball.BallWorldView;
import NGS.NHN.code.day13.fifth.ball.Point;

public class TestBallWorld {
    public static void main(String[] args) throws InterruptedException {
        BallWorld ballWorld = new BallWorld(new BallWorldView(500, 400));

        ballWorld.add(new Ball(new Point(50, 50), 50.0, Color.BLUE));

        ballWorld.run(1000);
    }
}
