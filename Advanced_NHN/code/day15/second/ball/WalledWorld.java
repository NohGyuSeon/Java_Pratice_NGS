package NGS.NHN.code.day15.second.ball;

import java.util.List;
import java.util.LinkedList;

public class WalledWorld extends MovableWorld {
    public WalledWorld(int width, int height) {
        super(width, height);

        add(new Box(new Point(-width * 0.5, height * 0.5), width, 3.0 * height));
        add(new Box(new Point(width * 1.5, height * 0.5), width, 3.0 * height));
        add(new Box(new Point(width * 0.5, height * 1.5), 3.0 * width, height));
        add(new Box(new Point(width * 0.5, -height * 0.5), 3.0 * width, height));
    }

    @Override
    public void next(List<Motion> effects) {
        super.next(effects);
        for(Shape shape : shapes) {
            if (shape instanceof Bounded) {
                Bounded boundedShape = (Bounded)shape;

                for(Shape otherShape : shapes) {
                    if ((boundedShape != otherShape) && (shape.getRegion().isCollision(otherShape.getRegion()))) {
                        double dx = shape.getX() - otherShape.getX();
                        double dy = shape.getY() - otherShape.getY();

                        double velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
                        int angle = Math.abs((int)Math.toDegrees(Math.asin(dy / velocity))) % 180;
                        if (angle < 50 || angle > 130) {
                            ((Bounded) shape).turnX();
                        }
                        if (angle > 40 && angle < 140) {
                            ((Bounded) shape).turnY();
                        }
                    }
                }

            }
        }
    }
}
