import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MemoryGame implements ActionListener {
	final static int height = 275;
	final static int width = 250;
	Timer time = new Timer(1000 / 60, this);
	int counter = 0;

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	SimonButton button = new SimonButton(Color.RED);
	SimonButton Autton = new SimonButton(Color.ORANGE);
	SimonButton Cutton = new SimonButton(Color.BLUE);
	SimonButton Dutton = new SimonButton(Color.GREEN);
	JButton Eutton = new JButton();

	MemoryGame() {

		frame.add(panel);
		panel.add(button);
		panel.add(Autton);
		panel.add(Cutton);
		panel.add(Dutton);
		panel.add(Eutton);

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
		Eutton.setText("Memorize up to # to win");
		Eutton.setLocation(475, 475);
		button.addActionListener(this);
		Dutton.addActionListener(this);
		Cutton.addActionListener(this);
		Autton.addActionListener(this);
		time.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {

		} else if (e.getSource().equals(Autton)) {

		} else if (e.getSource().equals(Cutton)) {

		} else if (e.getSource().equals(Dutton)) {

		}

		// if (counter % 10 == 0) {
		// Dutton.setColor(Color.BLACK);
		// } else if (counter % 50 == 0) {
		// Dutton.setColor(Color.GREEN);
		//
		// }
		counter++;
		if (counter % 100 == 0) {
			Cutton.setColor(Color.CYAN);
			Cutton.repaint();
		} else if (counter % 50 == 0) {
			Cutton.setColor(Color.BLUE);
			Cutton.repaint();

		}

	}
}