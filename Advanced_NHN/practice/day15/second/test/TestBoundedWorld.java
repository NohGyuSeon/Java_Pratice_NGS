package NGS.NHN.practice.day15.second.test;

import NGS.NHN.code.day15.second.ball.BoundedBall;
import NGS.NHN.code.day15.second.ball.BoundedBox;
import NGS.NHN.code.day15.second.ball.BoundedWorld;
import NGS.NHN.code.day15.second.ball.Motion;
import NGS.NHN.code.day15.second.ball.MovableBall;
import NGS.NHN.code.day15.second.ball.MovableBox;
import NGS.NHN.code.day15.second.ball.Point;

public class TestBoundedWorld {
    public static void main(String[] args) throws InterruptedException {
        BoundedWorld world = new BoundedWorld(500, 400);
        world.setInterval(100);

        MovableBall ball1 = new BoundedBall(new Point(100, 100), 40);
        ball1.setMotion(new Motion.MotionBuilderVA(30, 20).build());
        world.add(ball1);

        MovableBox box = new BoundedBox(new Point(300, 300), 50, 60);
        box.setVelocity(30);
        box.setAngle(20);
        world.add(box);

        world.setVisible(true);
        world.run(100);
    }
}
