package NGS.NHN.code.day15.first.test;

import java.awt.Color;

import NGS.NHN.practice.day15.first.ball.BoundedBall;
import NGS.NHN.practice.day15.first.ball.BoundedBox;
import NGS.NHN.practice.day15.first.ball.Point;
import NGS.NHN.practice.day15.first.ball.WalledWorld;

public class TestWalledWorld {
	public static void main(String[] args) throws InterruptedException {
		WalledWorld world = new WalledWorld(500, 400) ;
        world.setInterval(20);

        BoundedBall ball1 = new BoundedBall(new Point(100, 100), 40, Color.BLUE);
        ball1.setVelocity(10);
        ball1.setAngle(15);
        world.add(ball1);

        BoundedBall ball2 = new BoundedBall(new Point(300, 300), 30, Color.RED);
        ball2.setVelocity(20);
        ball2.setAngle(25);
        world.add(ball2);
        
        BoundedBox box1 = new BoundedBox(new Point(350, 350), 30, 30, Color.CYAN);
        box1.setVelocity(5);
        box1.setAngle(45);
        world.add(box1);
        
        BoundedBox box2 = new BoundedBox(new Point(250, 250), 10, 10, Color.BLACK);
        world.add(box2);
        
        

        world.setVisible(true);
        world.run(100);
    }
}
