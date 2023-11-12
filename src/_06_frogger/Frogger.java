package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogHopX;
    int frogHopY;
    Car car1;
    Car car2;
    Car car3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car1=new Car(1,200,40,5);
    	car2=new Car(800,300,40,5);
    	car3=new Car(1,400,40,5);
    }

    @Override
    public void draw() {
    	background(0,0,200);
    	fill(20,20,20);
    	ellipse(400, 600, 20, 20);
    	car1.display();
    	car2.display();
    	car3.display();
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP)
            {
                frogHopY+=1;
            }
            else if(keyCode == DOWN)
            {
            	 frogHopY-=1;
            }
            else if(keyCode == RIGHT)
            {
            	 frogHopY+=1;
            }
            else if(keyCode == LEFT)
            {
            	 frogHopY-=1;
            }
        }
    }
    void outSide() {
    	if(frogHopY>=600) {
    		frogHopY-=1;
    	}
    	if(frogHopY<=0) {
    		frogHopY+=1;
    	}
    	if(frogHopX>=800) {
    		frogHopX-=1;
    	}
    	if(frogHopY<=0) {
    		frogHopX+=1;
    	}
    }
    
}
