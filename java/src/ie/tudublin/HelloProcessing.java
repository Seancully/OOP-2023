package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(700,700);
	}

	public void setup() {
		
	}

	
	
	public void draw()
	{	
		noStroke();
		fill(random(255), random(255), random(255));
		circle(random(0,width), random(0, width), random(0,width));
	}
}
