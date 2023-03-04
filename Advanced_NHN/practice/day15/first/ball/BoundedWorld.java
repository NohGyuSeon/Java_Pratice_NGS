package NGS.NHN.practice.day15.first.ball;

public class BoundedWorld extends MovableWorld {
	public BoundedWorld(int width, int height) {
		super(width, height);
	}
	
	public Region getRegion() {		//
		return new Region(0, 0, getWidth(), getHeight());	//
	}

	public void add(Shape bounded) {	//
		if (bounded instanceof Bounded) {	//
			((Bounded)bounded).setBounds(getRegion());	//
		}
		super.add(bounded);
	}
}
