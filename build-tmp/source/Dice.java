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

public void setup()
{
	size(100, 100);
	background(125);
	noLoop();
}
public void draw()
{
	//your code here
	setup();
	Die dice1 = new Die(25, 25);
	dice1.show();
}
public void mousePressed()
{
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
		numDots = 4; // for checking if/else and positions.
	}
	public void roll()
	{
		//your code here
	}
	public void show()
	{
		//your code here
		fill(255);
		rect(xPos, yPos, 25, 25, 2.5f);
			noStroke();
			fill(0);
		/* */ 
		if (numDots == 1)
		{

			ellipse(xPos+(25/2), yPos+(25/2), 5, 5);
		}
		else if (numDots == 2)
		{
			ellipse(xPos+(25/3), yPos+(2*(25/3)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), 5, 5);
		}
		else if (numDots == 3)
		{
			ellipse(xPos+(25/2), yPos+(25/2), 5, 5);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), 5, 5);
		}
		else if (numDots == 4)
		{
			ellipse(xPos+(25/3), yPos+(25/3), 5, 5);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/3)), 5, 5);
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
