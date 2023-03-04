package NGS.NHN.practice.day15.third.test;

import NGS.NHN.code.day15.third.ball.BoundedBall;
import NGS.NHN.code.day15.third.ball.BoundedBox;
import NGS.NHN.code.day15.third.ball.BoundedWorld;
import NGS.NHN.code.day15.third.ball.Motion;
import NGS.NHN.code.day15.third.ball.MovableBall;
import NGS.NHN.code.day15.third.ball.MovableBox;
import NGS.NHN.code.day15.third.ball.Point;

public class TestBoundedWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld world = new BoundedWorld(500, 400);
        world.setInterval(100);

        MovableBall ball = new BoundedBall(new Point(100, 100), 40);
        ball.setMotion(new Motion.MotionVABuilder(30, 20).build());
        world.add(ball);

        MovableBox box = new BoundedBox(new Point(300, 300), 50, 60);
        box.setMotion(new Motion.MotionVABuilder(30, 20).build());
        world.add(box);

        world.setVisible(true);
        world.run(100);
    }
}
