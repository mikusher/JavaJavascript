var bola = {
	x: 300,
	y: 200,
};

function setup() {
	createCanvas(600, 400);
}

function draw() {
	background(0);
	move();
	display();
}

function display() {
	stroke(255);
	strokeWeight(4);
	noFill();
	ellipse(bola.x, bola.y, 24, 24);
}

function move() {
	bola.x = bola.x + random(-1, 1);
	bola.y = bola.y + random(-1, 1);
	//console.log("X = " + bola.x);
	//console.log("Y = " + bola.y);
	//console.log("");
}