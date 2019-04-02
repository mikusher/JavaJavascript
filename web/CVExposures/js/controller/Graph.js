$(document).ready(function () {

    var _drawGraph = document.getElementById("drawGraph");

    let categoriesConteiner = [];
    let categorieConteinerValues = [];

    _drawGraph.addEventListener("click", function (params) {

        let inputDrawGraph = document.getElementById("inputDrawGraph").value;
        let lastTotal = (inputDrawGraph === '') ?  5 : Number(inputDrawGraph);

        Utils.fetchData('https://cve.circl.lu/api/last/'+lastTotal).then(function(dataIterator) {
            for (const individualIndex of dataIterator) {
                categoriesConteiner.push(individualIndex.id);
                categorieConteinerValues.push(individualIndex.references.length);
            }
            var options = {
                chart: {
                    type: 'bar'
                },
                title: {
                    text: 'Vulnerability Presentation Last '
                },
                subtitle: {
                    text: 'Source: cve.circl.lu'
                },
                xAxis: {
                    categories: categoriesConteiner,
                    title: {
                        text: null
                    }
                },
                yAxis: {
                    min: 0,
                    title: {
                        text: 'Vulnerability References (ref)',
                        align: 'high'
                    },
                    labels: {
                        overflow: 'justify'
                    }
                },
                tooltip: {
                    valueSuffix: ' ref'
                },
                plotOptions: {
                    bar: {
                        dataLabels: {
                            enabled: true
                        }
                    }
                },
                legend: {
                    layout: 'vertical',
                    align: 'right',
                    verticalAlign: 'top',
                    x: -40,
                    y: 100,
                    floating: true,
                    borderWidth: 1,

                    backgroundColor: ((Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'),
                    shadow: true
                },
                credits: {
                    enabled: false
                },
                series: [
                    {
                        name: 'References',
                        data: categorieConteinerValues
                    }
                ]
            };
            $('#container').highcharts(options);
            params.stopImmediatePropagation();
        });

    });
});