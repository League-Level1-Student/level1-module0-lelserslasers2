package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton butOne = new JButton();
	JButton butTwo = new JButton();
	JButton butThree = new JButton();
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(butOne);
		panel.add(butTwo);
		panel.add(butThree);
		butOne.addActionListener(this);
		butTwo.addActionListener(this);
		butThree.addActionListener(this);
		frame.pack();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == butOne) {
			playSound("sawing-wood-daniel_simon.wav");
		}
		
		if (buttonPressed == butTwo) {
			playSound("muscle-car-daniel_simon.wav");
		}
		
		if (buttonPressed == butThree) {
			playSound("harley-davidson-daniel_simon.wav");
		}
		
	}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}
