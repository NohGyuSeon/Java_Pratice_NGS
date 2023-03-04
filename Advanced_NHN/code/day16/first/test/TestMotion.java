package NGS.NHN.code.day16.first.test;

import NGS.NHN.code.day16.first.ball.Motion;

public class TestMotion {
    public static void main(String[] args) {
        Motion motion = new Motion();

        System.out.println("V, A, DX, DY");
        System.out.println(motion.getVelocity() + ", " + motion.getAngle() + ", "
            + motion.getDX() + ", " + motion.getDY());
        motion.setVelocity(100);
        System.out.println(motion.getVelocity() + ", " + motion.getAngle() + ", "
            + motion.getDX() + ", " + motion.getDY());
        motion.setAngle(45);
        System.out.println(motion.getVelocity() + ", " + motion.getAngle() + ", "
            + motion.getDX() + ", " + motion.getDY());
        motion.setDX(10);
        System.out.println(motion.getVelocity() + ", " + motion.getAngle() + ", "
            + motion.getDX() + ", " + motion.getDY());
        motion.setDY(100);
        System.out.println(motion.getVelocity() + ", " + motion.getAngle() + ", "
            + motion.getDX() + ", " + motion.getDY());
    }
}
