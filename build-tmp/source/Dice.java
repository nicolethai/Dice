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

/********************************************************

TO DO:

~~ CLEAN UP CODE ~~

********************************************************/

// init counter for totals
int numMouseClicked = 0;
int sumNumDots = 0; 

public void setup()
{
	size(250, 300);
	background(200, 200, 200);
	noLoop();
}
public void draw()
{
	setup();
	sumNumDots = 0;
	for (int j = 35; j <= 250; j+=75)
	{
		for (int i = 35; i <= 250; i+=75)
		{
			Die dice = new Die(i, j);
			dice.roll();
			dice.show();
			sumNumDots += dice.numDots;
		}
	}
    // text output 
    stroke(1);
    fill(0);
    text("Sum of Die: " + sumNumDots, 10, 260);
    text("Number of Rolls: " + numMouseClicked, 10, 280);
}

public void mousePressed()
{
	numMouseClicked++; 
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
	}
	public void roll()
	{
		numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
	}
	public void show()
	{
			noStroke();
		    int wgbFill;
		    /*
		    if ((int)(Math.random()*3) == 0)
		    {
		    	wgbFill = black;
		    }
		    else if ((int)(Math.random()*3) == 0)
		    {
		    	wgbFill = grey;
		    }
		    else ((int)(Math.random()*3) == 0)
		    {
		    	wgbFill = white;
		    }
			*/
			fill(75);
			/*****************************
			-- rand die fill to be w/g/b --

			(int)(Math.random()*255)
			for w,g,b: 
			w > 125
			g = 125
			b < 125

			use:
			num = (int)(Math.random()*2)
			if (num == 0)
				fill = b
			else if (num == 1)
				fill = g
			else if (num ==2)
				fill = w;
			
			****************************/
		rect(xPos, yPos, 25, 25, 2.5f);

			fill(255, 102, 0); // orange // 255, 255, 0
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
		/* maybe shorten? */
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
