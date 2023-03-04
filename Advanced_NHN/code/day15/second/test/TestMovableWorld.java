package NGS.NHN.code.day15.second.test;

import NGS.NHN.code.day15.second.ball.MovableBall;
import NGS.NHN.code.day15.second.ball.MovableBox;
import NGS.NHN.code.day15.second.ball.MovableWorld;
import NGS.NHN.code.day15.second.ball.Point;

public class TestMovableWorld {
    public static void main(String[] args) throws InterruptedException {
        MovableWorld world = new MovableWorld(500, 400);

        world.setInterval(1000);
        MovableBall ball1 = new MovableBall(new Point(100, 100), 50);
        ball1.setVelocity(10);
        ball1.setAngle(30);
        world.add(ball1);

        MovableBox box = new MovableBox(new Point(300, 300), 100, 100);
        box.setVelocity(20);
        box.setAngle(60);
        world.add(box);

        world.setVisible(true);
        world.run(100);
    }
}
