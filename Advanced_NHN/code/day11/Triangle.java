package NGS.NHN.code.day11;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * author: NohGyuSeon
 */
public class Triangle {
	// 레벨 층 변수
	private int level = 9;

	// 삼각형을 그리는 메소드
	public void draw(Graphics g) {
		drawTirangle(g, level, 300, 100, 200, 200, 200, 100);
	}

	public static void main(String args[]) {
		new DrawingTriangle("TriangleTree");
	}

	// 레벨 층에 따라 Sierpinski 삼각형을 그립니다
	public void drawTirangle(Graphics g, int lev, int p1X, int p1Y, int p2X, int p2Y, int p3X, int p3Y) {
		g.drawLine(p1X, p1Y, p2X, p2Y);
		g.drawLine(p2X, p2Y, p3X, p3Y);
		g.drawLine(p3X, p3Y, p1X, p1Y);
		if (lev > 0) {
			int q1X = (p1X + p2X) / 2;
			int q1Y = (p1Y + p2Y) / 2;
			int q2X = (p1X + p3X) / 2;
			int q2Y = (p1Y + p3Y) / 2;
			int q3X = (p2X + p3X) / 2;
			int q3Y = (p2Y + p3Y) / 2;
			drawTirangle(g, lev - 1, p1X, p1Y, q1X, q1Y, q2X, q2Y);
			drawTirangle(g, lev - 1, p2X, p2Y, q1X, q1Y, q3X, q3Y);
			drawTirangle(g, lev - 1, p3X, p3Y, q2X, q2Y, q3X, q3Y);
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              

}

class DrawingTriangle extends JFrame {

	public DrawingTriangle(String title) {
		setTitle(title);
		setVisible(true);
		setSize(500, 500);
		getContentPane().add(new DrawingPanel());
	}
}

class DrawingPanel extends JPanel {
	public void paintComponent(Graphics g) {
		new Triangle().draw(g);
	}

}
