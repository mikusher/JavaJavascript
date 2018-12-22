var button = document.getElementById('progress-button');
var bar = document.getElementById('bar');

button.addEventListener('click', function () {
    var element = this;
    element.classList.add('loading');
    setTimeout(function () {
        var progress = 0;
        interval = setInterval(function () {
            progress = Math.min(progress + Math.random() * 0.1, 1);
            bar.style.width = (progress * 100) + '%';
            if (progress === 1) {
                element.classList.remove('loading');
                element.classList.add('done');
                element.disabled = true;
                clearInterval(interval);
            }
        }, 200);
    }, 200);
});