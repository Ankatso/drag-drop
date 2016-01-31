package mg.facedev.events;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import mg.facedev.entities.Form;
import mg.facedev.ui.Canvas;

public class EventManager extends MouseAdapter implements MouseMotionListener {
	
	private Canvas canvas;

	public EventManager(Canvas canvas) {
		super();
		this.canvas = canvas;
		this.canvas.addMouseListener(this);
		this.canvas.addMouseMotionListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		List<Form> found = canvas.findForms(e.getPoint());
		if(!found.isEmpty()) {
			canvas.setSelected(found.get(0));
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		canvas.setSelected(null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Form selected = canvas.getSelected();
		if(selected != null) {
			selected.setPos(e.getPoint());
			canvas.invalidate();
			canvas.repaint();
		}
	}

}
