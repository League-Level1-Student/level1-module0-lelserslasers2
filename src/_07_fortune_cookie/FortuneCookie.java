package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	   public void showButton() {
		   JFrame frame = new JFrame();
		   frame.setVisible(true);
		   JButton button = new JButton();
		   frame.add(button);
		   frame.pack();
		   button.addActionListener(this);
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5); 
		if (rand == 0){
			JOptionPane.showMessageDialog(null, "U will not die tomarow");
		}
		if (rand == 1){
			JOptionPane.showMessageDialog(null, "U will die tomarow");
		}
		if (rand == 2){
			JOptionPane.showMessageDialog(null, "The future is unknown");
		}
		if (rand == 3){
			JOptionPane.showMessageDialog(null, "I will tell u what will happen, after it has happened");
		}
		if (rand == 4){
			JOptionPane.showMessageDialog(null, "U will get rich");
		}
	}
}