package NGS.NHN.code.day15.second.ball;

public class Motion {
    double velocity;
    double angle;
    double dx;
    double dy;


    public Motion() {
        velocity = 0;
        angle = 0;
        dx = 0;
        dy = 0;
    }

    public void add(Motion motion) {
        this.dx += motion.getDX();
        this.dy += motion.getDY();
        updateVelocityAndAngle();
    }

    public double getVelocity() {
        return  velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
        updateDXDY();
    }

    public void addVelocity(double velocity) {
        this.velocity += velocity;
        updateDXDY();
    }

    public double getAngle() {
        return  angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
        updateDXDY();
    }

    public void addAngle(double angle) {
        this.angle += angle;
        updateDXDY();
    }

    public double getDX() {
        return  dx;
    }

    public void setDX(double dx) {
        this.dx= dx;
        updateVelocityAndAngle();
    }

    public void addDX(double dx) {
        this.dx += dx;
        updateVelocityAndAngle();
    }

    public double getDY() {
        return  dy;
    }

    public void setDY(double dy) {
        this.dy = dy;
        updateVelocityAndAngle();
    }

    public void addDY(double dy) {
        this.dy += dy;
        updateVelocityAndAngle();
    }

    public void updateDXDY() {
        double radian = Math.toRadians(angle);
        dx = velocity * Math.cos(radian);
        dy = velocity * Math.sin(radian);
    }

    public void updateVelocityAndAngle() {
        velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        angle = Math.toDegrees(Math.asin(dy / velocity));
    }


    private Motion(MotionBuilderDXDY builder) {
        this.dx = builder.dx;
        this.dy = builder.dy;
        updateVelocityAndAngle();
    }

    private Motion(MotionBuilderVA builder) {
        this.angle = builder.angle;
        this.velocity= builder.velocity;
        updateDXDY();
    }

    public static class MotionBuilderDXDY {
        double dx;
        double dy;

        public MotionBuilderDXDY(double dx, double dy) {
            this.dx = dx;
            this.dy = dy;
        }

        public Motion build() {
            return new Motion(this);
        }
    }

    public static class MotionBuilderVA {
        double velocity;
        double angle;

        public MotionBuilderVA(double velocity, double angle) {
            this.velocity = velocity;
            this.angle = angle;
        }

        public Motion build() {
            return new Motion(this);
        }
    }
}
