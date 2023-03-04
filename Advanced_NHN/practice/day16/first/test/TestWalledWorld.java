package NGS.NHN.practice.day16.first.test;

import java.awt.Color;

import NGS.NHN.practice.day16.first.ball.BoundedBall;
import NGS.NHN.practice.day16.first.ball.Box;
import NGS.NHN.practice.day16.first.ball.Motion;
import NGS.NHN.practice.day16.first.ball.Point;
import NGS.NHN.practice.day16.first.ball.WalledWorld;

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
