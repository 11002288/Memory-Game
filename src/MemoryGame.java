import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MemoryGame implements ActionListener {
	final static int height = 500;
	final static int width = 500;
	JFrame frame;

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();

	}

	MemoryGame() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		SimonButton button = new SimonButton(Color.RED);

		SimonButton Autton = new SimonButton(Color.ORANGE);
		SimonButton Cutton = new SimonButton(Color.BLUE);
		SimonButton Dutton = new SimonButton(Color.GREEN);
		frame.add(panel);
		panel.add(button);
		panel.add(Autton);
		panel.add(Cutton);
		panel.add(Dutton);

		frame.setSize(width, height);
		frame.setVisible(true);
		button.setSize(200, 200);
		Autton.setSize(200, 200);
		Dutton.setSize(200, 200);
		Cutton.setSize(200, 200);
		Autton.setLocation(260, 220);
		// Bottom right
		button.setLocation(40, 0);
		// Top Left
		Cutton.setLocation(40, 220);
		// Bottom left
		Dutton.setLocation(260, 0);
		// Top Right
		// button.setBackground(Color.BLUE);
		// button.setOpaque(true);
		// Autton.setBackground(Color.ORANGE);
		// Autton.setOpaque(true);
		// Cutton.setBackground(Color.CYAN);
		// Cutton.setOpaque(true);
		// Dutton.setBackground(Color.RED);
		// Dutton.setOpaque(true);
		button.addActionListener(this);
		Dutton.addActionListener(this);
		Cutton.addActionListener(this);
		Autton.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		((JButton) e.getSource()).paintComponents();
	}
}