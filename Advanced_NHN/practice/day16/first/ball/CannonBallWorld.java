package NGS.NHN.practice.day16.first.ball;

import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

public class CannonBallWorld extends MovableWorld implements ActionListener, MouseListener {
	Shape target; 
	double velocity;
	double angle;
	TextField velocityDisplay;
	TextField angleDisplay;
	Panel anglePanel;
	Panel velocityPanel;
	
	public CannonBallWorld(int width, int height) {
		super(width, height);
		target = null;
		 
		setInterval(100);
		
		prepareWorld();
	}

	private void prepareWorld() {
		add(new Box(new Point(-getWidth() * 0.5, getHeight() * 0.5), getWidth(), getHeight()));
		add(new Box(new Point(getWidth() * 1.5, getHeight() * 0.5), getWidth(), getHeight()));
		add(new Box(new Point(getWidth() * 0.5, getHeight() * 1.5), getWidth(), getHeight()));
		add(new Box(new Point(getWidth() * 0.5, -getHeight() * 0.5), getWidth(), getHeight()));
		
		Button fireButton = new Button();
		fireButton.setBounds(40, 40, 30, 30);
		fireButton.setLabel("Fire!");
		
		fireButton.addActionListener(this);
		add(fireButton);
		
		velocityDisplay = new TextField();
		velocityDisplay.setBounds(150, 40, 100, 30);
		add(velocityDisplay);
		
		angleDisplay = new TextField();
		angleDisplay.setBounds(260, 40, 100, 30);
		add(angleDisplay);
		
		anglePanel = new Panel();
		anglePanel.setBounds(getWidth()-150, 100, 150, getHeight()-200);
		anglePanel.setBackground(Color.DARK_GRAY);
		anglePanel.addMouseListener(this);
		add(anglePanel);

		velocityPanel = new Panel();
		velocityPanel.setBounds(200, getHeight()-100, 600, 100);
		velocityPanel.setBackground(Color.MAGENTA);
		velocityPanel.addMouseListener(this);
		add(velocityPanel);
		
		addMouseListener(this);
		
		target = null;
		setLayout(null);
	}
	
	public void setVelocity(double velocity) {
		this.velocity = velocity;
		velocityDisplay.setText(String.valueOf(velocity));
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
		angleDisplay.setText(String.valueOf(angle));
	}
	
	public void addTarget(Shape target) {
		this.target = target;
		add(target);
	}

	@Override
	public void next(List<Motion> effects) {
		super.next(effects);
		for (Shape shape : shapes) {
			if (shape instanceof Bounded) {

				for (Shape otherShape : shapes) {
					if ((shape != otherShape) && (shape.getRegion().isCollision(otherShape.getRegion()))) {
						if (otherShape != target) {
							Region r1 = shape.getRegion();
							Region r2 = otherShape.getRegion();
							Rectangle intersect = r1.intersection(r2);

							if ((intersect.getHeight() != r1.getHeight())
									&& (intersect.getHeight() != r2.getHeight())) {
								((Movable) shape).turnY();
							}
							if ((intersect.getWidth() != r1.getWidth()) && (intersect.getWidth() != r2.getWidth())) {
								((Movable) shape).turnX();
							}

							if ((r1.getY() - r1.getHeight()) <= 0) {
								((Movable) shape).stop();
							}
						} else {
							if (shape instanceof Movable) {
								((Movable) shape).stop();
							}
						}
					}
				}

			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		BoundedBall ball = new BoundedBall(new Point(20, 20), 10, Color.BLUE);
//		ball.setMotion(new Motion.MotionVABuilder(2/5, 45).build());
		ball.setVelocity(velocity);
		ball.setAngle(angle);
		ball.setAngle(Double.parseDouble(angleDisplay.getText().toString()));
		ball.setVelocity(Double.parseDouble(velocityDisplay.getText().toString()));
		
		add(ball);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (e.getSource() == anglePanel) {
			angle = (anglePanel.getHeight() - e.getY()) * 90.0 / anglePanel.getHeight();
			angleDisplay.setText(String.valueOf(angle));
			System.out.println("Click: (" + e.getX() + ", " + e.getY() + ", angle: " + angle + ")"); 
		} else if (e.getSource() == velocityPanel) {
			velocity = (velocityPanel.getWidth() - e.getX()) * 90.0 / velocityPanel.getWidth();
			velocityDisplay.setText(String.valueOf(velocity));
			System.out.println("Click: (" + e.getX() + ", " + e.getY() + ", velocity: " + velocity + ")"); 
		} else if (e.getSource() == this) {
			add(new Box(new Point(e.getX(), getHeight()-e.getY()), 20, 20, Color.PINK));
		}
			
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
