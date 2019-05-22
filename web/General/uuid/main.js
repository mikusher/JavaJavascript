$(document).ready(function () {

    var UUIDPosition = document.getElementById('uuid_p');
    var btnGenerateNewUUID = document.getElementById('btnGenerateNewUUID');
    var btnCopyUUID = document.getElementById('btnCopyUUID');

    //initial presentation
    UUIDPosition.innerHTML = uuid();

    //button generate new uuid
    btnGenerateNewUUID.addEventListener("click", function () {
        UUIDPosition.innerHTML = uuid();
    });

    //button copy uuid
    btnCopyUUID.addEventListener("click", function () {
        copyToClipboard();
    });

    //generate new uuid
    function uuid() {
        var seed = Date.now();
        if (window.performance && typeof window.performance.now === "function") {
            seed += performance.now();
        }

        var uuid = 'xxxxxxxx-xxxx-xxxx-yxxx-wxxexxdxxoxx'.replace(/[xy]/g, function (c) {
            var r = (seed + Math.random() * 16) % 16 | 0;
            seed = Math.floor(seed/16);

            return (c === 'x' ? r : r & (0x3|0x8)).toString(16);
        });

        return uuid;
    }

    //copy uuid
    function copyToClipboard () {
        var el = document.createElement('textarea');  // Create a <textarea> element
        el.value = $(document.getElementById('uuid_p')).text();  // Set its value to the string that you want copied
        el.setAttribute('readonly', '');                // Make it readonly to be tamper-proof
        el.style.position = 'absolute';
        el.style.left = '-9999px';                      // Move outside the screen to make it invisible
        document.body.appendChild(el);                  // Append the <textarea> element to the HTML document
        var selected =
            document.getSelection().rangeCount > 0        // Check if there is any content selected previously
                ? document.getSelection().getRangeAt(0)     // Store selection if found
                : false;                                    // Mark as false to know no selection existed before
        el.select();                                    // Select the <textarea> content
        document.execCommand('copy');                   // Copy - only works as a result of a user action (e.g. click events)
        document.body.removeChild(el);                  // Remove the <textarea> element
        if (selected) {                                 // If a selection existed before copying
            document.getSelection().removeAllRanges();    // Unselect everything on the HTML document
            document.getSelection().addRange(selected);   // Restore the original selection
        }
    }

});