void setup()
{
	size(250, 250);
	background(125);
	noLoop();
}
void draw()
{
	//your code here
	setup();
	for (int j = 30; j <= 250; j+=75)
	{
		for (int i = 30; i <= 350; i+=75)
		{
			Die dice = new Die(i, j);
			dice.show();			
		}
		System.out.println();
	}
}
void mousePressed()
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
		numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
		// numDots = 6; // for checking if/else and positions.
	}
	void roll()
	{
		//your code here
	}
	void show()
	{
		//your code here
			noStroke();
			fill(255);
		rect(xPos, yPos, 25, 25, 2.5);

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
		else if (numDots == 5)
		{
			ellipse(xPos+(25/2), yPos+(25/2), 5, 5);
			ellipse(xPos+(25/3), yPos+(25/3), 5, 5);
			ellipse(xPos+(25/3), yPos+(2*(25/3)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(25/3), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/3)), 5, 5);
		}
		else if (numDots == 6)
		{
			ellipse(xPos+(25/3), yPos+(25/4), 5, 5);
			ellipse(xPos+(25/3), yPos+(2*(25/4)), 5, 5);
			ellipse(xPos+(25/3), yPos+(3*(25/4)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(25/4), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(2*(25/4)), 5, 5);
			ellipse(xPos+(2*(25/3)), yPos+(3*(25/4)), 5, 5);
		}
		/* */
	}
}
