package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	
	
	public void draw()
	{	
		background(255, 0, 0);
		stroke(0, 0, 0);
		fill(255, 255, 0);
		circle(250, 250, 400);
		fill(0, 255, 255);
		triangle(250, 0, 40, 400, 460, 400);
		fill(250);
		ellipse(250, 200, 200, 120);
		fill(0, 0, 0);
		circle(mouseX, mouseY, 90);
	}
}
