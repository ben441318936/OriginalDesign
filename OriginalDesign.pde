/*
Jingbin Huang
Block 4
Ap Computer Science
*/
int waveWidth = 0;
int waveHeight = 0;
int counter = 0;
void setup()
{
	size(500,500);
	background(0);
	cellTower();
}
void draw()
{
	frameRate(2);
	wave();
	if (waveWidth==300)
	{
		background(0);
		cellTower();
		waveWidth=0;
		waveHeight=0;
	}
	counter++;
	if (counter == 10)
	{

	}
}

void cellTower()
{
	noFill();
	strokeWeight(2);
	stroke(250,50,50);
	beginShape();
	vertex(200,450);
	vertex(250,200);
	vertex(300,450);
	vertex(250,400);
	vertex(200,450);
	endShape();
}

void wave()
{
	noFill();
	strokeWeight(2);
	stroke(90, 200, 250);
	ellipse(250, 200, waveWidth, waveHeight);
	waveWidth=waveWidth+30;
	waveHeight=waveHeight+30;
}