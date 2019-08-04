package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage("https://the-drive.imgix.net/http%3A%2F%2Fd254andzyoxz3f.cloudfront.net%2Fdodge-challenger-shakedown-sema-2016-hero.jpg?w=1440&auto=compress%2Cformat&ixlib=js-1.2.1&s=a4eb6e53edb4b3e8b543ec0775b99b39");
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("What car is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equalsIgnoreCase("dodge challenger")){
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		image = createImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkNuyoUc6LZHAkkSroDSidwPKB14YJPCICD3DLcqDvQgrgXWdt6A");
		// 11. add the second image to the quiz window
		quizWindow.add(image);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		ans =JOptionPane.showInputDialog("What style of car is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (ans.equals("mini van")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
