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
PImage img;
public void setup()
{
	img = loadImage("pikachu.gif.gif");
	size(1400,500);
	background(200,200,200);
}
public void draw()
{
	x = random(0,100);
	drawCircles();
	drawRect();
	image(img, random(-500,1400),random(-500,500));
}

public void drawCircles() 
{
	noStroke();
	fill(random(212,255),random(28,100),28);
	ellipse(random(0,1400),random(-200,500),x+50,x+50);
}

public void drawRect() {
	noStroke();
	fill(random(212,255),random(206,255),random(28,75));
	rect(random(-200,1400), random(-200,500),x+50,x+50);
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
