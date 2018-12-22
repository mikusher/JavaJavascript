var cnt = 0;

function getData() {
    return Math.random();
}


setInterval(function() {
    Plotly.extendTraces('chart',{ y:[[getData()]]}, [0]);
    cnt++;

    if (cnt > 500) {
        Plotly.relayout('chart',{
            xaxis: {
                range: [cnt-500,cnt]
            }
        });
    }
},15);


