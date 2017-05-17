$(window).onload = function() {
    log('js loaded.');
    var stat = $("stat_container");
    log(stat);
    chart();
};

var myChart;

function chart() {
    myChart = Highcharts.chart('stat_container', {
        chart: {
            type: 'line'
        },
        title: {
            text: 'Súlygyarapodás'
        },
        xAxis: {
            categories: ['idő']
        },
        yAxis: {
            title: {
                text: 'súly (g)'
            }
        },
        series: [{
            name: 'Jane',
            data: [1, 3, 4, 5, 6, 1, 10, 8]
        }, {
            name: 'John',
            data: [5, 6, 7, 4, 3, 2, 4, 5]
        }, {
            name: 'Doe',
            data: [6, 3, 1, 6, 3, 1, 7, 8]
        }
        ]
    });
};