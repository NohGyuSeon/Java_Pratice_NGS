package NGS.NHN.code.day13.fifth.test;

import NGS.NHN.code.day13.fifth.ball.Motion;

public class TestMotion {
    public static void main(String[] args) {
        Motion motion = new Motion();

        for(double velocity = 1 ; velocity <= 5 ; velocity += 1.0) {
            motion.setVelocity(velocity);
            for(double angle = 0 ; angle <= 90 ; angle += 10) {
                motion.setAngle(angle);

                System.out.println("(거리, 각도) = (" + motion.getVelocity() + ", " + motion.getAngle() + ")");
            }
        }

        motion.setVelocity(0);
        motion.setAngle(0);
        System.out.println("(거리, 각도) = " + motion);

        for(int i = 0 ; i < 5 ; i ++ ) {
            motion.addVelocity(1);
            motion.setAngle(0);
            for(int j = 0 ; j < 9 ; j ++) {
                motion.addAngle(10);

                System.out.println("(거리, 각도) = (" + motion.getVelocity() + ", " + motion.getAngle() + ")");
            }
        }

        motion.setDXDY(0, 0);
        System.out.println("SetDXDY => DX : " + motion.getDX() + ", DY : " + motion.getDY());
        for(int x = 1 ; x < 5 ; x++) {
            motion.addDX(1);
            motion.setDY(0);
            for(int y = 1 ; y < 5 ; y++) {
                motion.addDY(1);
                System.out.println("DX : " + motion.getDX() + ", DY : " + motion.getDY());
            }
        }
        motion.setDX(1);
        motion.setDY(2);
        System.out.println("SetDXDY => DX : " + motion.getDX() + ", DY : " + motion.getDY());
        motion.turnX();
        System.out.println("turnX => DX : " + motion.getDX() + ", DY : " + motion.getDY());
        motion.turnY();
        System.out.println("turnY => DX : " + motion.getDX() + ", DY : " + motion.getDY());
        motion.turnX();
        System.out.println("turnX => DX : " + motion.getDX() + ", DY : " + motion.getDY());
        motion.turnY();
        System.out.println("turnY => DX : " + motion.getDX() + ", DY : " + motion.getDY());


        for(int x = 1 ; x < 5 ; x++) {
            motion.addDX(1);
            for(int y = 1 ; y < 5 ; y++) {
                motion.addDY(1);
                System.out.println("DX : " + motion.getDX() + ", DY : " + motion.getDY()
                        + ", Velocity : " + motion.getVelocity() + ", Angle : " + motion.getAngle());
            }
        }

        for(int velocity = 1 ; velocity < 5 ; velocity++) {
            motion.setVelocity(velocity);
            for(int angle = 10 ; angle < 90 ; angle += 10) {
                motion.setAngle(angle);
                System.out.println( ", Velocity : " + motion.getVelocity() + ", Angle : " + motion.getAngle()
                    + ", DX : " + motion.getDX() + ", DY : " + motion.getDY());
            }
        }

    }

}
