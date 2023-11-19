package _06_frogger;
import java.util.Random;
import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int frogX=400;
    int frogY=570;
    Car car1;
    Car car2;
    Car car3;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	car1=new Car(800,200,40,3,this);
    	car2=new Car(0,300,40,10,this);
    	car3=new Car(800,400,40,5,this);
    }

    @Override
    public void draw() {
    	background(0,0,200);
    	fill(20,20,20);
    	ellipse(frogX,frogY, 20, 20);
    	car1.display();
    	car1.movingCarsLeft();
    	car2.display();
    	car2.movingCarsRight();
    	car3.display();
    	car3.movingCarsLeft();
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    public void keyPressed() {
        if(key == CODED){
            if(keyCode == UP)
            {
                frogY-=5;
            }
            else if(keyCode == DOWN)
            {
            	 frogY+=5;
            }
            else if(keyCode == RIGHT)
            {
            	 frogX+=5;
            }
            else if(keyCode == LEFT)
            {
            	 frogX-=5;
            }
        }
    }
    void outSide() {
    	if(frogY>=600) {
    		frogY-=1;
    	}
    	if(frogY<=0) {
    		frogY+=1;
    	}
    	if(frogX>=800) {
    		frogX-=1;
    	}
    	if(frogY<=0) {
    		frogX+=1;
    	}
    }
    
}
