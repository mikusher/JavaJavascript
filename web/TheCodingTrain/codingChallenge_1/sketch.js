// variables
var mapimg;
var earthquakes, earthquakesJson;
var myToken = 'pk.eyJ1IjoibWlrdXNoZXIiLCJhIjoiY2ppOTVsMzV1MGR1ZTNwczVzb2d5cm94ayJ9.ssyGt3-AEd2UgJIarzBTnA';

var canvasPosition = {
	x: 1024,
	y: 512
};
var gpsPosition = {
	zoom: 1,
	clat: 0,
	clon: 0,
	lat: 0,
	lon: 0
};

var whichDataToUse = false; //false -> csv / true -> Json
var earthquakesArray = [];

//functions 
function preload(params) {
	mapimg = loadImage('https://api.mapbox.com/styles/v1/mapbox/dark-v9/static/0,0,' +gpsPosition.zoom+',0,0/' + canvasPosition.x + 'x' + canvasPosition.y + '?access_token=' + myToken);
	//Past 30 Days (today 10Jun)
	earthquakes = loadStrings('https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.csv');

	earthquakesJson = $.ajax({
		url: "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_month.geojson",
		dataType: "json",
		success: function (earthquakesJsondata) {
			for (let index = 0; index < earthquakesJsondata.features.length; index++) {
				const gpsPositionBackup = { 
					lat: 0, 
					lon: 0, 
					mag: 0 
				};
				gpsPositionBackup.lon = earthquakesJsondata.features[index].geometry.coordinates[0];
				gpsPositionBackup.lat = earthquakesJsondata.features[index].geometry.coordinates[1];
				gpsPositionBackup.mag = earthquakesJsondata.features[index].properties.mag;
				
				earthquakesArray.push(gpsPositionBackup);
			}
		},
		error: function (xhr) {
			alert(xhr.statusText);
		}
	});

	//Past Day (today 10Jun)
	//earthquakes = loadStrings('https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/all_day.csv');
}

//formula to calculate lat/log - https://en.wikipedia.org/wiki/Web_Mercator
function mercX(lon){
	lon = radians(lon);
	var a = (256 / PI ) * pow(2, gpsPosition.zoom);
	var b = lon + PI;
	return a * b;

}

function mercY(lat) {
	lat = radians(lat);
	var a = (256 / PI) * pow(2, gpsPosition.zoom);
	var b = tan(PI/4 + lat / 2);
	var c = PI - log(b);
	return a * c;
}


function setup() {
	createCanvas(canvasPosition.x, canvasPosition.y);
	translate(width/2, height/2);
	imageMode(CENTER);
	image(mapimg, 0, 0);

	var cx = mercX(gpsPosition.clat);
	var cy = mercY(gpsPosition.clon);


	var dataIterator = whichDataToUse ? earthquakesArray : earthquakes;

	for (const earthquake of dataIterator) {
		if (whichDataToUse === true) {
			$.when(earthquake).done(() =>
				gpsPosition.lat = earthquake.lat,
				gpsPosition.lon = earthquake.lon
			);
		}else{
			var data = earthquake.split(/,/);
			gpsPosition.lat = data[1];
			gpsPosition.lon = data[2];
		}

		//get magnitude
		var mag = whichDataToUse ? earthquake.mag : data[4];

		var x = mercX(gpsPosition.lon) - cx;
		var y = mercY(gpsPosition.lat) - cy;

		//calculate te magnitude
		mag = pow(10, mag);
		mag = sqrt(mag);
		var magmax = sqrt(pow(10,10));
		var d = map(mag, 0, magmax, 0, 180);

		stroke(255, 0, 255);
		fill(255, 0, 255, 200);
		ellipse(x, y, d, d);
	}
}