// utils functions

function Utils () {}


Utils.date = function () {
    let date = new Date();
    return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' ' + date.getHours() + ':' + date.getMinutes();
};


Utils.fetchData = async function (url) {
    let dataResult = null;
    await fetch(url).then(function (response) {
        return response.json();
    }).then(function (data) {
        dataResult = data;
    });
    return dataResult;
};


Utils.addEventsTr = function (tr, individualIndex, conformeToPopUp) {
    Utils.fetchData('https://cve.circl.lu/api/browse/' + individualIndex).then(function (result) {
        tr.querySelector(".btn-pop").addEventListener("click", e => {
            $("#pop-" + conformeToPopUp).popover({
                title: individualIndex,
                content: "Blabla"
            });
        });
    });
};


Utils.setContainerStorage = function (container, data) {
    sessionStorage.setItem(container, JSON.stringify(data));
};


Utils.getContainerStorage = function (container) {
    let containerResult = null;

    if (sessionStorage.getItem(container)) {
        const items = sessionStorage.getItem(container);
        containerResult = JSON.parse(items);
    }

    return containerResult;
};


Utils.loadToContainer = function (containerId, category, newId) {
    var htmlCode = '';
    var dataProduct = [];
    var dataVendorsIterator = Utils.getContainerStorage("Vendors");
    if(newId !== undefined){
        dataProduct = newId.product;
    }

    if (dataVendorsIterator !== null) {
        if (category !== undefined && category === 'vd') {
            htmlCode += '<option value="">Select Vendor</option>';
            $.each(dataVendorsIterator, function (key, value) {
                htmlCode += '<option value="' + value + '">' + value + '</option>';
            });
        } else if (category !== undefined && category === 'pd') {
            htmlCode += '<option value="">Select Product</option>';
            $.each(dataProduct, function (key, value) {
                htmlCode += '<option value="' + value + '">' + value + '</option>';
            });
        } else {
            htmlCode += '<option value="">Select Content</option>';
        }

        $('#' + containerId).html(htmlCode);
    }
};