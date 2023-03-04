package NGS.NHN.code.day11;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class TriangleRandom extends Frame {
	public TriangleRandom(int width, int height) {
		this.setSize(width, height);
	}

	void draw(Graphics g) {
		int x = 0, y = 0, i = 0, point = 0;
		Random rand = new Random();

		for (i = 0; i < 100000; i++) {
			point = rand.nextInt(3);
			x = x >> 1;
			y = y >> 1;
			if (point == 1) {
				x += 100;
				y += 150;
			}
			if (point == 2) {
				x += 200;
			}
			g.drawLine(x, 299 - y, x, 299 - y);
		}
	}

	@Override
	public void paint(Graphics g) {
		draw(g);
	}

	public static void main(String[] args) {
		TriangleRandom tree = new TriangleRandom(500, 500);
		tree.setVisible(true);
		tree.show();
	}
}