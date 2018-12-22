


window.onload = function(){

    // initial variable
    let xs = [];
    let ys = [];
    const zeroPoint = 0;

    // variables
    document.getElementById("input-x").value = 1;

    document.getElementById("sendPositions").addEventListener('click', function(event){
        // tensor flow
        const model = tf.sequential();
        model.add(tf.layers.leakyReLU({units:128, inputShape:[1]}));
        model.add(tf.layers.leakyReLU({units:128, inputShape:[128], activation: "sigmoid"}));
        model.add(tf.layers.dense({units:1, inputShape:[128]}));

        const optimizer = tf.train.adam(0.001);

        model.compile({loss:"meanSquaredError", optimizer:optimizer});

        var x = document.getElementById('input-x').value;
        var y = document.getElementById('input-y').value;
        //graphical type - radar or line
        var graphType = $('#graph-type input:radio:checked').val();

        xs.push(x);
        ys.push(y);

        document.getElementById("input-x").value = parseInt(x)+1;

        model.fit(tf.tensor(xs), tf.tensor(ys), {epochs:100}).then(() => {
            //bestfit
            bestfit = model.predict(tf.tensor(xs, [xs.length, 1])).dataSync();

            // begin chart
            let ctx = document.getElementById("mychart").getContext('2d');

            // chart data and settings
            let myChart = new Chart(ctx, {
                type: graphType,
                options: {
                    scales:{
                        yAxes: [{ticks: {beginArZero: true}}]
                    }
                },
                data: {
                    labels: xs,
                    datasets: [
                        {label: 'Original Data', data: ys, borderWidth: 1},
                        {label: 'Bestfit', data: bestfit, borderWidth: 1, borderColor: "#FF0000", backgroundColor: "rgba(1,1,1,0)"}
                        ]
                },
            });
        });
    });
};