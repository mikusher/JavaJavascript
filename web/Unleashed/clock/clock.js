function DisplayTime() {
    var date = new Date();
    var hour = date.getHours();
    var minute = date.getMinutes();
    var seconds = date.getSeconds();
    var day = "AM";

    if (hour == 0) {
        hour = 12;
    }

    if (hour > 12) {
        hour -= 12;
        day = "PM";
    }

    hour = (hour < 10) ? "0" + hour : hour;
    minute = (minute < 10) ? "0" + minute : minute;
    seconds = (seconds < 10) ? "0" + seconds : seconds;

    var currentTime = hour + ":" + minute + ":" + seconds + " " + day;
    document.getElementById("myClockDisplay").innerText = currentTime;

    setInterval(DisplayTime, 1000);
}