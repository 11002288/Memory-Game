import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JToggleButton;

class SimonButton extends JToggleButton {

	private Color color;
	Dimension size = new Dimension(100, 100);
	private boolean lightUp;

	public SimonButton(Color color) {
		this.color = color;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (lightUp) {
			g.setColor(color);
		} else {
			g.setColor(color.darker());
			;
		}
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
	}

	@Override
	public Dimension getPreferredSize() {
		return size;
	}

	void setColor(Color color) {
		this.color = color;
	}

	void toggle() {
		lightUp = !lightUp;
	}
	void darken() {
		lightUp = false;
		
	}

}