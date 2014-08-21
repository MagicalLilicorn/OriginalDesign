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
	size(200,200);
	background(200,200,200);
}
public void draw()
{
	drawCircles();
	x = random(0,100);
}

public void drawCircles() 
{
	noStroke();
	fill(random(74,200),random(162,200),224);
	ellipse(random(50,100),random(50,100),x+50,x+50);
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
