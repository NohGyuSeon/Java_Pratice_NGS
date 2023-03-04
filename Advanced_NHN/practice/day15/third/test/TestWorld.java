package NGS.NHN.practice.day15.third.test;

import NGS.NHN.code.day15.third.ball.Ball;
import NGS.NHN.code.day15.third.ball.Point;
import NGS.NHN.code.day15.third.ball.World;

public class TestWorld {
    public static void main(String[] args) {
        World world = new World(500, 400);

        world.add(new Ball(new Point(100, 100), 50));
        world.add(new Ball(new Point(300, 300), 100));

        world.setVisible(true);
    }

}
