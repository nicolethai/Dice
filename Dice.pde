/********************************************************

TO DO:

- Use arrays to:
	1. Create Dice (instances)
	2. Store Dice randDot value
	3. Use randDot value to create sum of die

	- Sum of Die:
		~ create new member function within Die class
		~ create a counter
		~ for each die, add numDots to counter
		~ display the counter value
		~ reset counter to zero at mousePressed()
		

********************************************************/


int numMouseClicked = 0;

void setup()
{
	size(250, 250);
	background(200, 200, 200);
	noLoop();
}
void draw()
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
void mousePressed()
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
	void roll()
	{
		//your code here	
		// numDots = 1; // for checking if/else and positions.	
		numDots = (int)((Math.random() * 6) + 1); // generates the random dots for die
	}
	void show()
	{
		//your code here
			noStroke();
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

		// test text 
		stroke(1);
		fill(0);
		text("Number of Rolls: " + numMouseClicked, 10, 240);
	}
}
