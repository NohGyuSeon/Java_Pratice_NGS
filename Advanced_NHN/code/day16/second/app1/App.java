package NGS.NHN.code.day16.second.app1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App extends Frame implements ActionListener, MouseListener {
	Button button;
	TextField textField;
	int count;
	
	public App(int width, int height) {
		super();
		
		button = new Button();
		button.setBounds(100, 100, 200, 200);
		
		textField = new TextField();
		textField.setBounds(100, 300, 200, 50);
		textField.setText("test");
		
		add(textField);
		
		button.addActionListener(this);
		button.addMouseListener(this);
		add(button);
	
		addMouseListener(this);

		setLayout(null);
		setSize(width, height);
	}	
	
	public static void main(String[] args) {
		App app = new App(400, 400);
		
		app.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);
		++count;
		button.setLabel(String.valueOf(count));
	}
 
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Clicked: " + e);
		textField.setText("(" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Pressed: " + e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Released: " + e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Entered: " + e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exited: " + e);
	}
	
	
}
