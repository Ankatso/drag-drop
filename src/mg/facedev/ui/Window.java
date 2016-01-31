package mg.facedev.ui;

import java.awt.Component;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import mg.facedev.entities.Ball;
import mg.facedev.events.EventManager;

public class Window extends JFrame {

	public Window() throws HeadlessException {
		super();
		setTitle("Drag and drop");
		setLocationRelativeTo(null); // centrée !
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(buildContentPane());
	}

	private Component buildContentPane() {
		Canvas canvas = new Canvas();
		Ball ball = new Ball(50,50,50,50);
		canvas.addForm(ball);
		
		new EventManager(canvas);
		return canvas ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Window().setVisible(true);
	}

}
