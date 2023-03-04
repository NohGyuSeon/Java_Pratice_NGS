package NGS.NHN.code.day13.fourth.test;

import java.awt.Color;

import NGS.NHN.code.day13.fourth.ball.Ball;
import NGS.NHN.code.day13.fourth.ball.BallWorld;
import NGS.NHN.code.day13.fourth.ball.Point;

public class TestBallWorld {
    public static void main(String[] args) {
        BallWorld ballWorld = new BallWorld(500, 400);

        ballWorld.add(new Ball(new Point(50, 50), 50.0, Color.BLUE));

        ballWorld.setVisible(true);
    }
}
