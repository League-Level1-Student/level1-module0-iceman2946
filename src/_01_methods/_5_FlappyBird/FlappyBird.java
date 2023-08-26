package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x= 400;
    int y=0;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {
        background(139,21,167);
        fill(15,1,215);
        stroke(200,102,59);
        ellipse(x,y,100,100);
        y+=1;
        int birdYVelocity= -10;
        int gravity=1;
        if mousePressed {
        	birdYVelocity=0;
    }

    // public int mousePressed(int i) {
		//i=0;
		//return(i);
		
	}

	static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
