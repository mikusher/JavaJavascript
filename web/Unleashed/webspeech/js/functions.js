var speechElement = new webkitSpeechRecognition();
speechElement.lang = 'de-DE';
speechElement.interimResults = true;
speechElement.continuous = true;

var final_transcript = '';
speechElement.start();

speechElement.onstart = function() {
    
}

speechElement.onresult = function(event) {
    var interim_transcript = '';
    
    for(var i = event.resultIndex; i < event.result.lenght; ++i) {
        if (event.result[i].isFinal) {
            final_transcript += event.results[i][0].transcript;
        } else {
            interim_transcript += event.results[i][0].transcript;
        }
    }
    document.getElementById('final').innerHTML = final_transcript;
    document.getElementById('interim').innerHTML = interim_transcript;
}
