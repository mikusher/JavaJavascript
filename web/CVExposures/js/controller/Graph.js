$(document).ready(function () {
    let productGraph = document.getElementById("container-graph");

    //create the data
    let data = [
        {x: 'Amazon', y: 520},
        {x: 'DZone', y: 60},
        {x: 'Gizmodo', y: 30},
        {x: 'StackOverFlow', y: 80},
        {x: 'CNET', y: 50}
    ];

    let chart = anychart.column(); //create a chart
    chart.title('Graph Configuration');//create title for the chart
    chart.xAxis().title("Website");//create name for X axis
    chart.yAxis().title("Traffic Per Minute"); //create name for Y axis
    let series = chart.column(data); //create bar series and pass data
    chart.container(productGraph); //reference the container Id
    chart.draw(); //initiate drawing the bar chart


});