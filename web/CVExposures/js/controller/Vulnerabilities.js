$(document).ready(function () {

    $('[data-toggle="tooltip"]').tooltip();
    let positionAlert = document.getElementById("alert-target");
    let allVendorsInPageVul = document.getElementById("allVendorsInPageVul");

    let btCheckProductContent = document.getElementById("btCheckProductContent");

    let inputSearchInTable = document.getElementById("inputSearchInTable");
    let btSearchInTable = document.getElementById("btSearchInTable");

    var vulnearbilitiesConatinerTable = document.getElementById("list-table-vulnerabilities");

    Utils.loadToContainer("allVendorsInPageVul", 'vd');


    allVendorsInPageVul.addEventListener("change", function () {
        var newVendorID = $(this).val();
        if (newVendorID !== '') {
            $.getJSON('https://cve.circl.lu/api/browse/'+newVendorID, function (obj) {
                Utils.loadToContainer("allProductInPageVul", 'pd', obj);
            });
        } else {
            $('#allVendors').html('<option value="">Select Vendor</option>');
            $('#allVendorProduct').html('<option value="">Select Product</option>');
        }
    });


    //action to filter button
    btSearchInTable.addEventListener("click", function () {
        let value = $(inputSearchInTable).val().toLowerCase();

        $("table tr").filter(function (index) {
            if (index > 0) {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1);
            }
        });
    });


    btCheckProductContent.addEventListener("click", function (params) {

        let selectComboVendors = document.getElementById("allVendorsInPageVul").value;
        let selectComboProduct = document.getElementById("allProductInPageVul").value;

        if (selectComboVendors === 'Select Vendor' || selectComboProduct === 'Select Product'){
            selectComboVendors = null;
            selectComboProduct = null;
        }

        if( selectComboVendors !== null && selectComboProduct !== null ){
            let urlResult = 'https://cve.circl.lu/api/search/'+selectComboVendors+'/'+selectComboProduct;
            $.getJSON(urlResult, function (obj) {
                for (const individualIndex of obj) {
                    let tr = document.createElement('tr');
                    let idOfElement = "listContainer-"+individualIndex.id;
                    let idOfElementV = "listContainerV-"+individualIndex.id;
                    var elementRefList = individualIndex.references;
                    var elementRefListVulnerabilities = individualIndex.vulnerable_configuration;
                    tr.innerHTML = `
                                <td><a href='https://cve.circl.lu/api/cve/${individualIndex.id}' target="_blank">${individualIndex.id}</a></td>
                                <td>${individualIndex.cvss}</td>
                                <td>${individualIndex.cwe}</td>
                                <td title='${individualIndex.summary}' data-toggle="tooltip" data-placement="top" style="text-overflow: ellipsis; max-width: 50%;">${individualIndex.summary}</td>
                                <td><div id='listContainer-${individualIndex.id}'></div></td>
                                <td><div id='listContainerV-${individualIndex.id}'></div></td>
                                `;
                    vulnearbilitiesConatinerTable.appendChild(tr);
                    addToLi(document.getElementById(idOfElement), elementRefList);
                    addToLi(document.getElementById(idOfElementV), elementRefListVulnerabilities);
                }
            });
        }else {
            positionAlert.style.display = (positionAlert.style.display === "none") ? "block" : "none";
        }
    });

    function addToLi(idOfElement, elementRefList) {
        let listElement = document.createElement("ul");
        idOfElement.appendChild(listElement);
        var numberOfListItems = elementRefList.length;

        for (let i = 0; i < numberOfListItems; ++i) {
            let listItem = document.createElement("li");
            listItem.innerHTML = elementRefList[i];
            listElement.appendChild(listItem);
        }

    }


});