float x;

void setup()
{
	size(200,200);
	background(200,200,200);
}
void draw()
{
	drawCircles();
	x = random(0,100);
}

void drawCircles() 
{
	noStroke();
	fill(random(74,200),random(162,200),224);
	ellipse(random(50,100),random(50,100),x+50,x+50);
}

