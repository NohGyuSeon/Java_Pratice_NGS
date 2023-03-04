package NGS.NHN.test.third.ground;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import NGS.NHN.test.third.figure.Movable;
import NGS.NHN.test.third.figure.Shape;

public class BallWorld extends Frame {
	List<Shape> shapes;
	long interval;

	public BallWorld(int width, int height) {
		super();
		setSize(width, height);
		shapes = new LinkedList<>();
		this.interval = 100;
	}

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public double getInterval() {
		return interval;
	}

	public void setInterval(long interval) {
		this.interval = interval;
	}

	public void next() {
		for (Shape shape : shapes) {
			if (shape instanceof Movable) {
				((Movable) shape).next();
			}
		}
	}

	public void run(long seconds) throws InterruptedException { //
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() < startTime + seconds * 1000) { //
			next();
			repaint();
			Thread.sleep(interval);
		}
	}

	@Override
	public void paint(Graphics graphics) {
		for (Shape shape : shapes) {
			shape.draw(graphics);
		}

	}

}
