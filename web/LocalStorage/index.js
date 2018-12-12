//localStorage.setItem("name", "luis");

window.onload = function(){

    //variables
    const inpKey = document.getElementById("inpKey");
    const inpValue = document.getElementById("inpValue");
    const btnInsert = document.getElementById("btnInsert");
    const btnClear = document.getElementById("btnDeleteCache");
    const lsOutput = document.getElementById("lsOutput");

    //action - insert value
    btnInsert.onclick = function () {
        const key = inpKey.value;
        const value = inpValue.value;

        if (key && value){
            localStorage.setItem(key, value);
            location.reload();
        }
    };

    // show list value in local storage
    for (let i = 0; i < localStorage.length; i++) {
        let key = localStorage.key(i);
        let value = localStorage.getItem(key);

        lsOutput.innerHTML += `${key}: ${value}<br />`;
    }

    //action - clear value
    btnClear.onclick = function () {
        localStorage.clear();
        location.reload();
    };
};