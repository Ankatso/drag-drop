package mg.facedev.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import mg.facedev.entities.Form;

public class Canvas extends JPanel {

	private List<Form> forms = new ArrayList<Form>();
	
	private Form selected;
	
	public List<Form> findForms(Point pos) {
		List<Form> found = new ArrayList<Form>();
		for(Form form : forms) {
			if(form.getRect().contains(pos)) {
				found.add(form);
			}
		}
		return found;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		
		Color lastColor = g.getColor();
		g.setColor(Color.WHITE);
		// fond fotsy
		g.fillRect(0, 0, getWidth(), getHeight());
		drawAll(g);
		g.setColor(lastColor);
		
	}

	// Manisy forme eo ambonin'ilay conteneur
	public void addForm(Form form) {
		forms.add(form);
	}
	
	// Manamboatra sarin'ny forme rehetra 
	private void drawAll(Graphics drawer) {
		for(Form form : forms) {
			form.draw(drawer);
		}
	}

	public Form getSelected() {
		return selected;
	}

	public void setSelected(Form selected) {
		this.selected = selected;
	}
	
	
}
