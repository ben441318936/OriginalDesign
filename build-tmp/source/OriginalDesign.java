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

public class OriginalDesign extends PApplet {

int waveWidth = 0;
int waveHeight = 0;
int counter = 0;
public void setup()
{
	size(500,500);
	background(0);
	cellTower();
}
public void draw()
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

public void cellTower()
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

public void wave()
{
	noFill();
	strokeWeight(2);
	stroke(90, 200, 250);
	ellipse(250, 200, waveWidth, waveHeight);
	waveWidth=waveWidth+30;
	waveHeight=waveHeight+30;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
