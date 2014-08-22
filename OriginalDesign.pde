float x;

void setup()
{
	size(1600,500);
	background(200,200,200);
}
void draw()
{
	x = random(0,100);
	drawCircles();
	drawRect();
}

void drawCircles() 
{
	noStroke();
	fill(random(74,200),random(162,200),224);
	ellipse(random(50,1500),random(50,500),x+50,x+50);
}

void drawRect() {
	noStroke();
	fill(random(53,150),random(242,255),random(56,75));
	rect(random(50,1500), random(50,500),x+50,x+50);
}

