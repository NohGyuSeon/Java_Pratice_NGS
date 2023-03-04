package NGS.NHN.code.day13.fifth.ball;

/**
 * Motion 클래스는 좌표의 이동량을 나타낸다.
 * <p>
 * 이동량은 속도와 각도 또는 X축과 Y축의 이동량으로 표시될 수 있다.
 */
public class Motion {
    /**
     * 속도.
     */
    double velocity;

    /**
     * 각도.
     */
    double angle;

    /**
     * X축으로의 변화량.
     */
    double dx;

    /*
     * Y축으로의 변화랑.
     */
    double dy;

    /**
     * 속도 0, 각도 0 또는 X축 이동량 0, Y축 이동량 0로 생성.
     */
    public Motion() {
        this.velocity = 0;
        this.angle = 0;
        this.dx = 0;
        this.dy = 0;
    }

    /**
     * 속도와 각도 정보로 Motion 생성.
     * @param velocity 속도
     * @param angle 각도
     */
    public Motion(double velocity, double angle) {
        this.velocity = velocity;
        this.angle = angle;
        updateDXDY();
    }

    /**
     * 속도 정보.
     * @return
     */
    public double getVelocity() {
        return  velocity;
    }

    /**
     * 속도 정보 변경으로 X축과 Y축의 이동량도 변경된다.
     * @param velocity
     */
    public void setVelocity(double velocity) {
        this.velocity = velocity;
        updateDXDY();
    }

    public void addVelocity(double velocity) {
        this.velocity += velocity;
        updateDXDY();
    }
    /**
     * 각도.
     * @return
     */
    public double getAngle() {
        return angle;
    }

    /**
     * 각도 변경으로 X축과 Y축의 이동량도 변경된다.
     * @param angle 각도
     */
    public void setAngle(double angle) {
        this.angle = angle;
        updateDXDY();

    }

    public void addAngle(double angle) {
        this.angle += angle;
        updateDXDY();
    }

    /**
     * X축과 Y축의 이동량으로 설정한다.
     * <p>
     * 속도와 각도 정보는 자동으로 변경된다.
     * @param dx
     * @param dy
     */
    public void setDXDY(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
        updatevelocityAndAngle();
    }

    public double getDX() {
        return  dx;
    }

    /**
     * X축 이동량을 설정한다.
     * <p>
     * 속도와 각도 정보는 자동으로 변경된다.
     * @param dx
     */
    public void setDX(double dx) {
        this.dx = dx;
        updatevelocityAndAngle();
    }

    /**
     * X축 이동량에 주어진 이동량을 추가한다.
     * <p>
     * 속도와 각도 정보는 자동으로 변경된다.
     * @param dx
     */
    public void addDX(double dx) {
        this.dx += dx;
        updatevelocityAndAngle();
    }

    /**
     * X축 이동량을 반대로 변경한다.
     */
    public void turnX() {
        dx = -dx;
        updatevelocityAndAngle();
    }

    public double getDY() {
        return dy;
    }

     /**
     * Y축 이동량을 설정한다.
     * <p>
     * 속도와 각도 정보는 자동으로 변경된다.
     * @param dy
     */
    public void setDY(double dy) {
        this.dy = dy;
        updatevelocityAndAngle();
    }

    /**
     * Y축 이동량에 주어진 이동량을 추가한다.
     * <p>
     * 속도와 각도 정보는 자동으로 변경된다.
     * @param dy
     */
    public void addDY(double dy) {
        this.dy += dy;
        updatevelocityAndAngle();
    }

    /**
     * Y축 이동량을 반대로 변경한다.
     */
    public void turnY() {
        dy = -dy;
        updatevelocityAndAngle();
    }

    /**
     *
     * @param acceleration
     */
    public void add(Motion acceleration) {
        dx += acceleration.getDX();
        dy += acceleration.getDY();
        updatevelocityAndAngle();
    }

    /**
     * 속도 또는 각도가 변경된 경우, X축과 Y축의 이동량을 변경한다.
     */
    protected void updateDXDY() {
        double radian = Math.toRadians(angle);
        dx = velocity * Math.cos(radian);
        dy = velocity * Math.sin(radian);
    }

    /**
     * X축과 Y축 이동량 변경시 호출하여 속도와 각도를 변경한다.
     */
    protected void updatevelocityAndAngle() {
        velocity = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        angle = Math.toDegrees(Math.asin(dy / velocity));

    }

    @Override
    public String toString() {
        return  "(" + velocity + ", " + angle + ")";
    }
}
