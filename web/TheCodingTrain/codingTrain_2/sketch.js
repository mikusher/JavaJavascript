let bubble = [];

function setup() {
	createCanvas(600, 400);
	
	for (let index = 0; index < 6; index++) {
		let x = 20 + 100 * index;
		bubble[index] = new Bubble(x, 200, 20);
	}
	
}

function draw() {
	background(0);

	for (const bolas of bubble) {
		bolas.move();
		bolas.show();
	}
	/*
	for (let index = 0; index < bubble.length; index++) {
		bubble[index].move();
		bubble[index].show();
	}
	*/
}


class Bubble {
	constructor(tempx, tempy, tempr) {
		this.x = tempx;
		this.y = tempy;
		this.r = tempr;
	}

	move() {
		this.x = this.x + random(-1, 1);
		this.y = this.y + random(-1, 1);
	}

	show() {
		stroke(255);
		strokeWeight(4);
		noFill();
		ellipse(this.x, this.y, this.r*2);
	}
}



