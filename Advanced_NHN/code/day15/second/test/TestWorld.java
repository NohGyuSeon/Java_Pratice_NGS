package NGS.NHN.code.day15.second.test;

import NGS.NHN.code.day15.second.ball.Ball;
import NGS.NHN.code.day15.second.ball.Point;
import NGS.NHN.code.day15.second.ball.World;

public class TestWorld {
    public static void main(String[] args) {
        World world = new World(500, 400);

        world.add(new Ball(new Point(100, 100), 50));
        world.add(new Ball(new Point(300, 300), 100));

        world.setVisible(true);
    }

}
