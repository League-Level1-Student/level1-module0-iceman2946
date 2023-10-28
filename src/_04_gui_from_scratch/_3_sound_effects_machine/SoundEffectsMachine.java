package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton LeftButton= new JButton();
	JButton RightButton= new JButton();
	public void showButton() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		LeftButton.addActionListener(this);
		RightButton.addActionListener(this);
		panel.add(LeftButton);
		panel.add(RightButton);
		frame.pack();	
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed==LeftButton) {
			System.out.println("Button-left");
			playSound("airplane_landing.wav");
		}
		if(buttonPressed==RightButton) {
			System.out.println("Button-right");
			playSound("sawing-wood-daniel_simon.wav");
		}
	}
}
