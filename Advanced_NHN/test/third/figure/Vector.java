package NGS.NHN.test.third.figure;

public class Vector {
    private double dx;
    private double dy;

    public Vector(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public double getDX() {
        return dx;
    }

    public double getDY() {
        return dy;
    }

    public void setDX(double dx) {
        this.dx = dx;
    }

    public void setDY(double dy) {
        this.dy = dy;
    }
}
