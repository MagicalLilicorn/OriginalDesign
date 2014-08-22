float x;
PImage img;
void setup()
{
	img = loadImage("pikachu.gif.gif");
	size(1400,500);
	background(200,200,200);
}
void draw()
{
	x = random(0,100);
	drawCircles();
	drawRect();
	image(img, random(0,1400),random(0,500));
}

void drawCircles() 
{
	noStroke();
	fill(random(212,255),random(28,100),28);
	ellipse(random(0,1400),random(0,500),x+50,x+50);
}

void drawRect() {
	noStroke();
	fill(random(212,255),random(206,255),random(28,75));
	rect(random(0,1400), random(0,500),x+50,x+50);
}

void pika(){
	fill(0,0,0);
	text("pika pika", random(0,1400),random(0,500));
}
