/*jshint esversion: 6 */

var nums = [100, 20, 40, 70, 80];

function setup() {
	createCanvas(600, 600);
}

function draw() {
	background(0);
	
	for (let index = 0; index < 4; index++) {
		ellipse((index*100+100), 200, nums[index], nums[index]);
	}
}

