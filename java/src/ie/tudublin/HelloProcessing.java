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
		stroke(255); // colour
		line(10, 10, 100, 100); // draws line (x1, y1, x2, y2)
		fill(0, 255, 0);
		circle(300, 250, 70); // creates circle (centreX, centreY, diameter)
		fill(0, 0, 255); // fills colour
		rect(10, 300, 10, 100); // rectangle (topleftX, topleftY, width, height)
		stroke(127); // takes 1 OR 3 parameters this gives colour outline
		fill(0, 255, 255);
		noStroke(); // turns off drawing round shapes
		noFill(); // turns off fill
		strokeWeight(1); // changes the thickness of lines drawn
		triangle(40, 90, 300, 20, 80, 70); 
		
	}
}
