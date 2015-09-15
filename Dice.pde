/********************************************************

TO DO:

~~ CLEAN UP CODE ~~

********************************************************/

// init counter for totals
int numMouseClicked = 0;
int sumNumDots = 0; 

void setup()
{
	size(250, 300);
	background(200, 200, 200);
	noLoop();
}

void draw()
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

void mousePressed()
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
	void roll()
	{
		numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
	}
	void show()
	{
		noStroke();
		int randFill = (int)(Math.random()*3);
		int wgbFill = 0;
		    
	    if (randFill == 0)
	    {
	       	wgbFill = 0;
	    }
	    else if (randFill == 1)
	    {
	      	wgbFill = 125;
	    }
	    else if (randFill == 2)
	    {
	       	wgbFill = 255;
	    }
	    			
		fill(wgbFill);
		rect(xPos, yPos, 25, 25, 2.5);

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
