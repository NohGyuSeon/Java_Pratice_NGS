package NGS.NHN.code.day13.fourth.test;

import java.awt.Color;

import NGS.NHN.code.day13.fourth.ball.BoundedWorld;
import NGS.NHN.code.day13.fourth.ball.CannonBall;
import NGS.NHN.code.day13.fourth.ball.Motion;
import NGS.NHN.code.day13.fourth.ball.Point;

public class TestBoundedBallWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld ballWorld = new BoundedWorld(500, 400);

        CannonBall ball = new CannonBall(new Point( 20, 20), 20.0, Color.BLUE);
        Motion motion = new Motion();
        motion.setDXDY(15, 15);
        ball.setMotion(motion);
        Motion gravity = new Motion();
        gravity.setDXDY(0, -9.8 / 10);
        ball.setAcceleration(gravity);
        ballWorld.add(ball);
        ballWorld.setInterval(100);
        ballWorld.run(1000);
    }
}
