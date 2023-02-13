package ie.tudublin;


import processing.core.PApplet;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(800, );
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float off = 0;
	int i;
	int x = 0; // for x values for rect
	int y = 0; // for y values for rect

	public void draw() {
		background(0);
		fill(255);
		noStroke();

		switch (mode) {
			
			case 0:
					fill(0, 120, 240);
					rect(0, 0, 50, 500);

					fill(25, 100, 100);
					rect(50, 0, 50, 500);

					fill(50, 100, 100);
					rect(100, 0, 50, 500);

					fill(100, 100, 50);
					rect(150, 0, 50, 500);

					fill(150, 50, 100);
					rect(200, 0, 50, 500);

					fill(180, 100, 100);
					rect(250, 0, 50, 500);

					fill(200, 100, 100);
					rect(300, 0, 50, 500);

					fill(240, 100, 100);
					rect(350, 0, 50, 500);

					fill(280, 100, 100);
					rect(400, 0, 50, 500);

					fill(271, 100, 63);
					rect(450, 0, 50, 500);
				break;
			case 1:
				break;
			default:
				break;
		}

	}
}
