package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.awt.MenuComponent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image= "https://images.squarespace-cdn.com/content/v1/5d4428ffacde33000191b0ff/1661961993868-ANRFVJUHTX08YTGE9FYJ/image-asset.jpeg?format=2500w";
		// 2. create a variable of type "Component" that will hold your image
		Component component;
		// 3. use the "createImage()" method below to initialize your Component
		component= createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer1= JOptionPane.showInputDialog("Where is this monument at?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer1.equals("Washington DC")) {
			System.out.println("CORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			System.out.println("INCORRECT");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2= "https://a.cdn-hotels.com/gdcs/production152/d1609/fb5c78a2-aef9-4606-808e-86c39d311e94.jpg";
		component= createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(component);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2= JOptionPane.showInputDialog("What city in the West Coast is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(answer2.equals("Sacramento")) {
			System.out.println("CORRECT");
		}
		else {
			System.out.println("INCORRECT");
		}

	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
