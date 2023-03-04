package NGS.NHN.practice.day16.first.ball;

import java.util.LinkedList;
import java.util.List;

public class MovableWorld extends World {
    double interval;
    List<Motion> effects;

    public MovableWorld(int width, int height) {
        super(width, height);
        interval = 0;
        effects = new LinkedList<>();
    }

    public double getInterval() {
        return  interval;
    }

    public void setInterval(double interval) {
        this.interval = interval;
    }

    public void addEffect(Motion effect) {
        effects.add(effect);
    }

    public void next(List<Motion> effects) {
        for(Shape shape : shapes) {
            if (shape instanceof Movable) {
                ((Movable)shape).next(effects);
            }
        }
    }

    public void run(long seconds) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() < startTime + seconds * 1000) {
            next(effects);
            repaint();
            Thread.sleep((long) interval);
        }
    }
}
