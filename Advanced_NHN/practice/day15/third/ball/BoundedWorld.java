package NGS.NHN.practice.day15.third.ball;

public class BoundedWorld extends MovableWorld {
    public BoundedWorld(int width, int height) {
        super(width, height);
    }

    public Region getRegion() {
        return  new Region(0, 0, getWidth(), getHeight());
    }

    @Override
    public void add(Shape bounded) {
        if (bounded instanceof Shape) {
            ((Bounded)bounded).setBounds(getRegion());
        }
        super.add(bounded);
    }
}
