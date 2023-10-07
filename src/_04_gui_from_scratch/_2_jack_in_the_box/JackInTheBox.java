package _04_gui_from_scratch._2_jack_in_the_box;

import java.io.File;

import javax.print.DocFlavor.URL;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JButton surprise= new JButton();
		frame.add(surprise);
		frame.pack();
	}
	private JLabel createLabelImage(String fileName) {
		try {
	            java.net.URL imageURL = getClass().getResource(fileName);
	            if (imageURL == null) {
		       System.err.println("Could not find image " + fileName);
		       return new JLabel();
	            } else {
	                Icon icon = new ImageIcon(imageURL);
	                JLabel imageLabel = new JLabel(icon);
	                return imageLabel;
	            }
	        } catch (Exception e) {
	            System.err.println("Could not find image " + fileName);
	            return new JLabel();
	        }
	}
}

// Re-copy and paste #2 and #3