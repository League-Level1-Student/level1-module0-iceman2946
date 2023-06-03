package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
		Robot rob= new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		
		rob.moveTo(50, 450);
		rob.penDown();
        for(int x=0; x<10; x++) {
        	house();
        }
	}
	void house () {
			rob.move(100);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(100);
			rob.turn(-90);
			rob.setPenWidth(15);
			rob.setPenColor(0,255,0);
			rob.move(20);
			rob.turn(-90);
			rob.setPenColor(0,0,0);
			rob.setPenWidth(0);
		
	}
}
