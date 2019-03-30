$(document).ready(function () {
    var productConatinerTable = document.getElementById("list-table-products");
    var btnData = document.getElementById("btnGetVendor");
    var dataVendorsIterator = Utils.getContainerStorage("Vendors");

    Utils.loadToContainer("allVendorsSelect", 'vd');

    function productInTable(json, classes) {

        var headerRow = '';
        var bodyRows = '';

        classes = classes || '';
        headerRow += '<th>'
            + "Vendor: "+json.vendor
            + "  -  "
            + "Number of Products: "+json.product.length
            + '</th>';

        json.product.map(function(row) {
            bodyRows += '<tr>';
            bodyRows += '<td>' + row + '</td>';
            bodyRows += '</tr>';
        });

        return '<table class="' +
            classes +
            '"><thead><tr>' +
            headerRow +
            '</tr></thead><tbody>' +
            bodyRows +
            '</tbody></table>';
    };

    btnData.addEventListener("click", function (params) {

        var selectComboVendors = document.getElementById("allVendorsSelect").value;

        if(dataVendorsIterator !== null){
            $.getJSON('https://cve.circl.lu/api/browse/'+selectComboVendors, function (obj) {
                const line = productInTable(obj, 'table');
                productConatinerTable.innerHTML = line;
            });
        }
    });


});