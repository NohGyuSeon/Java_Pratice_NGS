package NGS.NHN.code.day15.first.test;

import NGS.NHN.practice.day15.first.ball.Ball;
import NGS.NHN.practice.day15.first.ball.Point;
import NGS.NHN.practice.day15.first.ball.World;

public class TestWorld {
	public static void main(String[] args) {
		World world = new World(400, 500);	//
		
		world.add(new Ball(new Point(200, 300), 10));	//  
		world.add(new Ball(new Point(200, 300), 10));
		
		world.setVisible(true);
		
		
	}

}
