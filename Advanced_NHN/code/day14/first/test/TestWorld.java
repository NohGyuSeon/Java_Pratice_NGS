package NGS.NHN.code.day14.first.test;

import NGS.NHN.practice.day14.first.ball.Ball;
import NGS.NHN.practice.day14.first.ball.Point;
import NGS.NHN.practice.day14.first.ball.World;

public class TestWorld {
	public static void main(String[] args) {
		World world = new World(500, 500);
		
		world.add(new Ball(new Point(100, 100), 50));
		world.add(new Ball(new Point(200, 200), 100));
		world.add(new Ball(new Point(300, 300), 200));
		
		world.setVisible(true);
	}

	
}
