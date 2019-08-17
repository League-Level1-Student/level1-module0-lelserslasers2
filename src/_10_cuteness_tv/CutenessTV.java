package _10_cuteness_tv;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton butOne = new JButton();
	JButton butTwo = new JButton();
	JButton butThree = new JButton();
	Dimension FORCESTACK = new Dimension(400,600);
	Dimension BUTTON = new Dimension(375,175);
	public void run() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setPreferredSize(FORCESTACK);
		butOne.setPreferredSize(BUTTON);
		butTwo.setPreferredSize(BUTTON);
		butThree.setPreferredSize(BUTTON);
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
			showDucks();
		}
		
		if (buttonPressed == butTwo) {
			showFrog();
		}
		
		if (buttonPressed == butThree) {
			showFluffyUnicorns();
		}
		
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}