package _06_frogger;

import java.util.Random;

import processing.core.PApplet;

public class Car{
	int x;
	int y;
	int size;
	int speed;
	PApplet processing;
	public Car(int x, int y, int size, int speed, PApplet processing) {
		this.x=x;
		this.y=y;
		this.size=size;
		this.speed=speed;
		this.processing=processing;
	}
	void display(){
	    processing.fill(0,255,0);
	    processing.rect(x , y,  size, 50);
	  }
	void movingCarsLeft() {
		x=x-speed;
		if(x<=-size) {
			x=-size;
		}
	}
	void movingCarsRight() {
		x=x+speed;
		if(x>=size+800) {
			x=800+size;
		}
	}
	void CarDirection() {
		Random rand = new Random(1);
		return;
	}
	
}
