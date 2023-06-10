package _01_methods._1_houses;

import java.util.Random;

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
		Random ran= new Random();
		Random ranColor=new Random();
        for(int x=0; x<9; x++) {
        	String size= "";
        	String color= "";
        	int number= ran.nextInt(3);
        	int numCol= ran.nextInt(3);
        	if(number==0) {
        		size="small";
        	}
        	if(number==1) {
        		size="medium";
        	}
        	if(number==2) {
        		size="large";
        	}
        	if (numCol==0) {
        		color= "red";
        	}
        	if(numCol==1) {
        		color= "green";
        	}
        	if(numCol==2) {
        		color= "blue";
        	}
        	house(size,color);
        }
	}
	void house (String size,String color) {
			int height=120;
			if(size.equals("small")) {
				height=60;
			}
			if(size.equals("large")) {
				height=250;
			}
			if (size.equals("medium")) {
				height=120;
			}
			if(color.equals("red")) {
				rob.setPenColor(255,0,0);
			}
			if(color.equals("green")) {
				rob.setPenColor(0,255,0);
			}
			if(color.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			rob.move(height);
			rob.turn(45);
			rob.move(20);
			rob.turn(45);
			rob.move(height);
			rob.turn(-90);
			rob.setPenWidth(15);
			rob.setPenColor(0,255,0);
			rob.move(20);
			rob.turn(-90);
			rob.setPenColor(0,0,0);
			rob.setPenWidth(0);
		
	}
}
