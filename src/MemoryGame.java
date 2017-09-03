import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class MemoryGame implements ActionListener {
	final static int height = 275;
	final static int width = 250;
	Timer time = new Timer(1000 / 60, this);
	int counter = 0;
	Pattern pattern = new Pattern();
	int[] currentPattern;
	int postion;

	public static void main(String[] args) {
		MemoryGame mg = new MemoryGame();

	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	SimonButton[] buttons = new SimonButton[4];
	SimonButton button = new SimonButton(Color.RED);
	SimonButton Autton = new SimonButton(Color.GREEN);
	SimonButton Cutton = new SimonButton(Color.BLUE);
	SimonButton Dutton = new SimonButton(Color.ORANGE);
	JButton Eutton = new JButton();
boolean  turn = false;
	MemoryGame() {
		buttons[0] = button;
		buttons[1] = Autton;
		buttons[2] = Cutton;
		buttons[3] = Dutton;
		currentPattern = pattern.getP1();
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
		
		// if (counter % 10 == 0) {
		// Dutton.setColor(Color.BLACK);
		// } else if (counter % 50 == 0) {
		// Dutton.setColor(Color.GREEN);
		//
		// }
		
		if(turn==true){
		if (e.getSource()!=time) {
			
			
		if (buttons[currentPattern[postion]] ==e.getSource()) {
				System.out.println("Good Job");
				postion++;
				if (postion==currentPattern.length) {
					JOptionPane.showConfirmDialog(null, "You Passed this round");
					getNextpattern();
					turn = false;
					postion = 0;
				}
			}else{
				JOptionPane.showConfirmDialog(null, "You Lost!");
			}
			
	
			if (e.getSource().equals(button)) {
				button.toggle();
				
			} else if (e.getSource().equals(Autton)) {
				Autton.toggle();
			} else if (e.getSource().equals(Cutton)) {
				Cutton.toggle();
			} else if (e.getSource().equals(Dutton)) {
				Dutton.toggle();
			}
}
			
		}else {
			displayPattern();
		
		}	
		
	}
	void displayPattern() {
		counter++;
		if (postion < currentPattern.length) {
			if (counter % 100 == 0) {
				buttons[currentPattern[postion]].toggle();
				buttons[currentPattern[postion]].repaint();
				postion++;
			} else if (counter % 50 == 0) {
				buttons[currentPattern[postion]].toggle();
				buttons[currentPattern[postion]].repaint();

			}
		}
		if (currentPattern.length==postion) {
			turn = true;
			postion = 0;
		}
	}
	void getNextpattern() {
		if(currentPattern==pattern.getP1()) {
			currentPattern=pattern.getP2();
		}else if(currentPattern==pattern.getP2()) {
			currentPattern=pattern.getP3();
		}else if(currentPattern==pattern.getP3()) {
int restart = JOptionPane.showConfirmDialog(null, "Good Job You completed this game! Do you want to play again?");		
if(restart==0){
	currentPattern=pattern.getP1();
}else{
System.exit(0);
}}
	}
}