package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Loops extends PApplet {

	int mode = 0;

	public void settings() {
		size(500, 500);
		//fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);
        background(0);
        smooth();
        border = width * 0.1f;
	}

	public void keyPressed() {

		mode = key - '0';
		println(mode);
	}

	float border;

	void drawGrid() {
        stroke(110, 92, 100);
        textAlign(CENTER, CENTER);
        textSize(20);
        for (int i = -5; i <= 5; i++) {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(110, 92, 100);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }
    }
	
	float colourVar;

	void rectLoop() {
		int i;
		int x = 0;
		int y = 0;


		for ( i = 0; i < 10; i++) {
	
			stroke(0);
			fill(colourVar, 255, 255);
			rect(x, y, 50, 50);
			x += 50;
			y += 50;
			colourVar += 25.5;


			if (colourVar > 255) {

				colourVar = 0;

			}

		}

	}

	public void draw(){
		background(0);
		rectLoop();
	}

}
