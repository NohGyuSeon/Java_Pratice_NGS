package NGS.NHN.practice.day15.second.test;

import java.awt.Color;

import NGS.NHN.code.day15.second.ball.BoundedBall;
import NGS.NHN.code.day15.second.ball.Box;
import NGS.NHN.code.day15.second.ball.Motion;
import NGS.NHN.code.day15.second.ball.Point;
import NGS.NHN.code.day15.second.ball.WalledWorld;

public class TestWalledWorld {
    public static void main(String[] args) throws InterruptedException {
        WalledWorld world = new WalledWorld(500, 400) ;
        world.setInterval(100);
        Motion gravity = new Motion();
        gravity.setDY(-9.8/10);
        world.addEffect(gravity);
        Motion wind = new Motion();
        wind.setDX(-5/10);
        world.addEffect(wind);

        BoundedBall ball1 = new BoundedBall(new Point(100, 100), 40, Color.BLUE);
        ball1.setVelocity(20);
        ball1.setAngle(25);
        world.add(ball1);

        Box box = new Box(new Point(300, 300), 60, 60, Color.RED);
        //box.setVelocity(30);
        //box.setAngle(35);
        world.add(box);

        world.setVisible(true);
        world.run(100);
    }
}
