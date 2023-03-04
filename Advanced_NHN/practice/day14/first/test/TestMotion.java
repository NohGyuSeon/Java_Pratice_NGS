package NGS.NHN.practice.day14.first.test;

import NGS.NHN.practice.day14.first.ball.Motion;

public class TestMotion {
	public static void main(String[] args) {
		Motion motion = new Motion();

		System.out.println("V, A, DX, DY");
		System.out.println(
				motion.getVelocity() + ", " + motion.getAngle() + ", " + motion.getDX() + ", " + motion.getDY());
		motion.setVelocity(100);
		System.out.println(
				motion.getVelocity() + ", " + motion.getAngle() + ", " + motion.getDX() + ", " + motion.getDY());
		motion.setAngle(200);
		System.out.println(
				motion.getVelocity() + ", " + motion.getAngle() + ", " + motion.getDX() + ", " + motion.getDY());
		motion.setDX(100);
		System.out.println(
				motion.getVelocity() + ", " + motion.getAngle() + ", " + motion.getDX() + ", " + motion.getDY());
		motion.setDY(100);
		System.out.println(
				motion.getVelocity() + ", " + motion.getAngle() + ", " + motion.getDX() + ", " + motion.getDY());
		
		
	}

}
