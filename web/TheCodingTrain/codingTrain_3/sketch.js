/*jshint esversion: 6 */

var nums = ["0"];
var index = 0,  
	timeEnd = 0;

function setup() {
	createCanvas(600, 600);
}

function draw() {
	background(0);
	fill(255);
	textSize(32);
	text("Array Number: "+nums[index], 12, 200);
	text("Time End: " + timeEnd, 12, 300);
	text("Array Lenght: "+nums.length.toString(), 20, 400);
}

function mousePressed () {
	index = index + 1;

	if (index == nums.length) {
		index = 0;
		let newValue = (ceil((random([nums.length], [ceil(mouseX)]).toString())));
		nums.push(newValue);
		timeEnd = timeEnd + 1;
		console.log(newValue);
	}
}