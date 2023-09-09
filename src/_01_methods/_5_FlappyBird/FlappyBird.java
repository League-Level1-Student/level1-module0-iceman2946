package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x1= 400;
    int x2= 800;
    int y=0;
    int upperPipeHeight= (int) random (200,400);
    int pipeGap=;
    int lowerY= upperPipeHeight+pipeGap;
    static int birdYVelocity=10;
    static int gravity= 1;
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
        ellipse(x1,y,100,100);
        TeleportPipes();
        y+=birdYVelocity;
        mousePressed();
        boolean i= false;
        intersectsPipes(i);
        if(i==true) {
        	System.exit(0);
        }
        
      
        }
        

        
    public void TeleportPipes() {
    	fill(37,30,219);
    	rect(x2,0,50,upperPipeHeight);
    	rect(x2,lowerY,50,-200);
    	x2-=90;
    	if(x2<0) {
    		x2=800;
    		
    	}
    }
    boolean intersectsPipes(boolean i) { 
       if (y < upperPipeHeight && x1 > x2 && x1 < (x2+50)){
    	   i= true;
    	   return true; }
       else if (y>lowerY && x1 > x2 && x1 < (x2+-200)) {
    	   i=true;
    	   return true; }
     else { 
    	 i=true;
    	 return false; }
     }

   
	
    public void mousePressed() {
    	birdYVelocity=50;
    }

	static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
