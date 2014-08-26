import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

float randomSize;
float x;
float y;
PImage pika;
PImage squirtle;

Minim minim;
AudioPlayer pikasfx, squirtlesfx;

public void setup()
{
	minim = new Minim(this);
	pikasfx = minim.loadFile("pika.wav");
	squirtlesfx = minim.loadFile("squirtle_squirtle.wav");
	frameRate(60);
	//noLoop();
	pika = loadImage("pikachu.gif.gif");
	squirtle = loadImage("squirtle.gif");
	size(1200,500);
	background(200,200,200);
	pikasfx.play();
	squirtlesfx.play();
}

public void draw()
{
	randomSize = random(0,100);
	x = random(-500,1200);
	y = random(-200,500);
	drawCircles();
	drawRect();
	if (x < 400){
		image(pika, x,y);
		
	} else {
		image(squirtle, x,y);
		
	}
}

public void drawCircles() 
{
	noStroke();
	if (x < 600){
		fill(random(212,255),random(28,100),28);
	} else {
		fill(random(114,200),random(177,255),232);
	}
	ellipse(x,y,randomSize+50,randomSize+50);
}

public void drawRect() {
	noStroke();
	if (x <= 600){
		fill(random(212,255),random(206,255),random(28,75));
	} else {
		fill(random(114,200),random(232,255),random(149,200));
	}
	rect(x,y,randomSize+50,randomSize+50);
}

// void mousePressed() {
// 	redraw();
// }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
