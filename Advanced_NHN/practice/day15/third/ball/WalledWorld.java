package NGS.NHN.practice.day15.third.ball;

import java.util.List;
import java.awt.Rectangle;

public class WalledWorld extends MovableWorld {
    Shape target;
    public WalledWorld(int width, int height) {
        super(width, height);

        add(new Box(new Point(-width * 0.5, height * 0.5), width, height));
        add(new Box(new Point(width * 1.5, height * 0.5), width, height));
        add(new Box(new Point(width * 0.5, height * 1.5), width, height));
        add(new Box(new Point(width * 0.5, -height * 0.5), width, height));
        target = null;
    }

    public void addTarget(Shape target) {
        this.target = target;
        add(target);
    }

    @Override
    public void next(List<Motion> effects) {
        super.next(effects);
        for(Shape shape : shapes) {
            if (shape instanceof Bounded) {

                for(Shape otherShape : shapes) {
                    if ((shape != otherShape) && (shape.getRegion().isCollision(otherShape.getRegion()))) {
                        if (otherShape != target) {
                            Region r1 = shape.getRegion();
                            Region r2 = otherShape.getRegion();
                            Rectangle intersect = r1.intersection(r2);

                            if ((intersect.getHeight() != r1.getHeight()) && (intersect.getHeight() != r2.getHeight())) {
                                ((Movable)shape).turnY();
                            }
                            if ((intersect.getWidth() != r1.getWidth()) && (intersect.getWidth() != r2.getWidth())) {
                                ((Movable)shape).turnX();
                            }

                            if ((r1.getY() - r1.getHeight()) <= 0) {
                                ((Movable)shape).stop();
                            }
                        } else {
                            if (shape instanceof Movable) {
                                ((Movable)shape).stop();
                            }
                        }
                    }
                }

            }
        }
    }
}
