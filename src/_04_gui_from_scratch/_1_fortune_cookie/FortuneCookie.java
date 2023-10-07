package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JButton button= new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand= new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "Chaos will happen alot today");
		}
		if(rand==1) {
			JOptionPane.showMessageDialog(null, "Your pants will change color.");
		}
		if(rand==2) {
			JOptionPane.showMessageDialog(null, "You will get a new PS5");
		}
		if(rand==3) {
			JOptionPane.showMessageDialog(null, "A bully will smack your butt");
		}
		else {
			JOptionPane.showMessageDialog(null, "Today, you will surpass all others");
		}
		
	}

}
