$(document).ready(function () {

    var UUIDPosition = document.getElementById('uuid_p');
    var btnGenerateNewUUID = document.getElementById('btnGenerateNewUUID');

    UUIDPosition.innerHTML = uuid();

    btnGenerateNewUUID.addEventListener("click", function () {
        UUIDPosition.innerHTML = uuid();
    });

    //generate new uuid
    function uuid() {
        var seed = Date.now();
        if (window.performance && typeof window.performance.now === "function") {
            seed += performance.now();
        }

        var uuid = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
            var r = (seed + Math.random() * 16) % 16 | 0;
            seed = Math.floor(seed/16);

            return (c === 'x' ? r : r & (0x3|0x8)).toString(16);
        });

        return uuid;
    }

});