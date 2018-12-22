function Progress() {
    var loading = document.getElementById('loading');
    var width = 0;
    var interval = setInterval(Duration, 120);


    function Duration() {
        if (width >= 100) {
            clearInterval(interval);
            window.location = 'home.html';
        } else {
            width++;
            loading.style.width = width + '%';
        }
    }
}