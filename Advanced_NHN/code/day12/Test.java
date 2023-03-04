package NGS.NHN.code.day12;

import java.awt.Color;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		final Color[] colors = { Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.PINK,
				Color.CYAN };
		int randomAngle;
//		MultiBallWorld multiBallWorld = new MultiBallWorld(500, 400);
		MovableBallWorld movableBallWorld = new MovableBallWorld(500, 400);

//		multiBallWorld.setVisible(true);
		movableBallWorld.setVisible(true);
		
//		Random random = new Random();
//		for (int i = 0; i < 15; i++) {
//			double radius = 10.0 + random.nextInt(Math.min(multiBallWorld.getWidth(), multiBallWorld.getHeight()) / 10);
//			Point location = new Point(
//					radius / 2 + random.nextInt((int) Math.round(multiBallWorld.getWidth() - 2 * radius)),
//					radius / 2 + random.nextInt((int) Math.round(multiBallWorld.getHeight() - 2 * radius)));
//
//			int colorIndex = random.nextInt(colors.length * 2);
//			if (colorIndex < colors.length) {
//				multiBallWorld.add(new Ball(location, radius, colors[colorIndex]));
//			} else {
//				multiBallWorld.add(new Ball(location, radius));
//			}
//		}
//
//		multiBallWorld.repaint();
//
//		multiBallWorld.run();
		
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			randomAngle = random.nextInt(360);  
			double radius = 10.0 + random.nextInt(Math.min(movableBallWorld.getWidth(), movableBallWorld.getHeight()) / 10);
			Point location = new Point(
					radius / 2 + random.nextInt((int) Math.round(movableBallWorld.getWidth() - 2 * radius)),
					radius / 2 + random.nextInt((int) Math.round(movableBallWorld.getHeight() - 2 * radius)));
			
			MovableBall movableBall = new MovableBall(location, radius);
			movableBall.setAngle(randomAngle);
			
			int colorIndex = random.nextInt(colors.length * 2);
			if (colorIndex < colors.length) {
				movableBall.setColor(colors[colorIndex]);
				movableBallWorld.add(movableBall);
			} else {
				movableBallWorld.add(movableBall);
			}
		}
		
		
		movableBallWorld.repaint();
		
		movableBallWorld.run(10);

	}

}
