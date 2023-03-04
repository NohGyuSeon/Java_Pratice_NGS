package NGS.NHN.code.day16.first.test;

import NGS.NHN.code.day16.first.ball.Ball;
import NGS.NHN.code.day16.first.ball.Point;
import NGS.NHN.code.day16.first.ball.World;

public class TestWorld {
    public static void main(String[] args) {
        World world = new World(500, 400);

        world.add(new Ball(new Point(100, 100), 50));
        world.add(new Ball(new Point(300, 300), 100));

        world.setVisible(true);
    }

}
