float randomSize;
float x;
float y;
PImage pika;
PImage squirtle;
void setup()
{
	pika = loadImage("pikachu.gif.gif");
	squirtle = loadImage("squirtle.gif");
	size(1200,500);
	background(200,200,200);
}
void draw()
{
	randomSize = random(0,100);
	x = random(-500,1200);
	y = random(-200,500);
	drawCircles();
	drawRect();
	if (x < 600){
		image(pika, x,y);
	} else {
		image(squirtle, x,y);
	}
}

void drawCircles() 
{
	noStroke();
	if (x < 600){
		fill(random(212,255),random(28,100),28);
	} else {
		fill(random(114,200),random(177,255),232);
	}
	
	ellipse(x,y,randomSize+50,randomSize+50);
}

void drawRect() {
	noStroke();
	if (x <= 600){
		fill(random(212,255),random(206,255),random(28,75));
	} else {
		fill(random(114,200),random(232,255),random(149,200));
	}
	rect(x,y,randomSize+50,randomSize+50);
}

