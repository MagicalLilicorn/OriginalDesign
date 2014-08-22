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

float x;

public void setup()
{
	size(1600,500);
	background(200,200,200);
}
public void draw()
{
	x = random(0,100);
	drawCircles();
	drawRect();
}

public void drawCircles() 
{
	noStroke();
	fill(random(74,200),random(162,200),224);
	ellipse(random(50,900),random(50,500),x+50,x+50);
}

public void drawRect() {
	noStroke();
	fill(random(53,150),random(242,255),random(56,75));
	rect(random(50,900), random(50,500),x+50,x+50);
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
