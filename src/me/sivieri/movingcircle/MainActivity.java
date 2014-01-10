package me.sivieri.movingcircle;

import processing.core.PApplet;

public class MainActivity extends PApplet {
	private static final int DIAMETER = 100;

	private int centerX;
	private int centerY;

	@Override
	public void setup() {

	}

	@Override
	public void draw() {
		if (this.mousePressed) {
			this.centerX = this.mouseX;
			this.centerY = this.mouseY;
		}
		background(255);
		fill(0);
		ellipse(this.centerX, this.centerY, DIAMETER, DIAMETER);
	}

}
