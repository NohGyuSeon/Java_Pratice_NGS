package NGS.NHN.practice.day16.first.test;

import java.awt.Color;

import NGS.NHN.practice.day16.first.ball.Ball;
import NGS.NHN.practice.day16.first.ball.Point;
import NGS.NHN.practice.day16.first.ball.World;

public class TestWorld {
	public static void main(String[] args) {
		World world = new World(400, 500);
		
		world.add(new Ball(new Point(120, 130), 40, Color.BLUE));
		world.add(new Ball(new Point(150, 270), 30));
		
		world.setVisible(true);
 	}
}
