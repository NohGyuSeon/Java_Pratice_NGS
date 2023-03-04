package NGS.NHN.code.day15.third.test;

import java.awt.Color;
import NGS.NHN.code.day15.third.ball.BoundedBall;
import NGS.NHN.code.day15.third.ball.Box;
import NGS.NHN.code.day15.third.ball.Motion;
import NGS.NHN.code.day15.third.ball.Point;
import NGS.NHN.code.day15.third.ball.WalledWorld;

public class TestWalledWorld {
    public static void main(String[] args) throws InterruptedException {
        WalledWorld world = new WalledWorld(500, 400) ;
        world.setInterval(100);
        world.addEffect(new Motion.MotionVABuilder(0.98, -90).build());
        world.addEffect(new Motion.MotionVABuilder(0.5, -180).build());

        BoundedBall ball = new BoundedBall(new Point(100, 100), 10, Color.BLUE);
        ball.setMotion(new Motion.MotionVABuilder(25, 45).build());
        world.add(ball);

        Box box = new Box(new Point(400, 30), 60, 60, Color.RED);
        world.addTarget(box);

        world.setVisible(true);
        world.run(100);
    }
}
