import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

int numMouseClicked = 0;

public void setup()
{
	size(250, 250);
	background(212, 212, 202);
	noLoop();
}
public void draw()
{
	//your code here
	setup();
	for (int j = 35; j <= 250; j+=75)
	{
		for (int i = 35; i <= 250; i+=75)
		{
			Die dice = new Die(i, j);
			dice.roll();
			dice.show();			
		}
	}

}
public void mousePressed()
{
	numMouseClicked++; // include later
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int xPos, yPos, numDots;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		xPos = x;
		yPos = y;
		// numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
		// numDots = 6; // for checking if/else and positions.
	}
	public void roll()
	{
		//your code here	
		// numDots = 1; // for checking if/else and positions.	
		numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
	}
	public void show()
	{
		//your code here
			noStroke();
			fill(75);
			/********
			(int)(Math.random()*255)
			for w,g,b: 
			w > 125
			g = 125
			b < 125
			********/
		rect(xPos, yPos, 25, 25, 2.5f);

			fill(255, 102, 0); // 255, 255, 0
		/* */ 
		int dotSize = 4;
		if (numDots == 1)
		{
			ellipse(xPos+(25/2), yPos+(25/2), dotSize, dotSize);
		}
		else if (numDots == 2)
		{
			ellipse(xPos+(25/3), yPos+(2*(25/3)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), dotSize, dotSize);
		}
		else if (numDots == 3)
		{
			ellipse(xPos+(25/2), yPos+(25/2), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), dotSize, dotSize);
		}
		else if (numDots == 4)
		{
			ellipse(xPos+(25/3), yPos+(25/3), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/3)), dotSize, dotSize);
		}
		else if (numDots == 5)
		{
			ellipse(xPos+(25/2), yPos+(25/2), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(25/3), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/3)), dotSize, dotSize);
		}
		else if (numDots == 6)
		{
			ellipse(xPos+(25/3), yPos+(25/4), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(2*(25/4)), dotSize, dotSize);
			ellipse(xPos+(25/3), yPos+(3*(25/4)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(25/4), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/4)), dotSize, dotSize);
			ellipse(xPos+(2*(25/3)), yPos+(3*(25/4)), dotSize, dotSize);
		}
		/* */

	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
