package NGS.NHN.code.day15.first.ball;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public class World extends Frame {
	List<Shape> shapes;	//
	
	public World(int width, int height) {	//
		super();	//
		
		setSize(width, height);
		
		shapes = new LinkedList<>(); //
	}
	
	public void add(Shape shape) {	//
		shapes.add(shape);
	}
	
	@Override
	public void paint(Graphics graphics) {
		for (Shape shape : shapes) {
			shape.draw(graphics);	//
		}
		
	}  
	
	
}
