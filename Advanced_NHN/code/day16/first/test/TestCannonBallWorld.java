package NGS.NHN.code.day16.first.test;

import NGS.NHN.code.day16.first.ball.Box;
import NGS.NHN.code.day16.first.ball.CannonBallWorld;
import NGS.NHN.code.day16.first.ball.Motion;
import NGS.NHN.code.day16.first.ball.Point;

public class TestCannonBallWorld {
	public static void main(String[] args) throws InterruptedException {
		CannonBallWorld world = new CannonBallWorld(1000, 800);
		
        world.addEffect(new Motion.MotionVABuilder(0.98, -90).build());
        world.addEffect(new Motion.MotionVABuilder(0.5, -180).build());
		
		world.addTarget(new Box(new Point(800, 30), 100, 60));
		
		world.setVelocity(40);
		world.setAngle(45);
		
		world.setVisible(true);
		world.run(10000);
		
	}
}
 