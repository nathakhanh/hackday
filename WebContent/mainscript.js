$(document).ready(function(){
	  var speed = [["0:00",14], ["1:00", 32], ["2:00", 41], ["3:00", 44]];
	    var plot1 = $.jqplot('chart1', [speed], {
	        axes: {
	          xaxis: {
	            renderer: $.jqplot.DateAxisRenderer,
	            label: 'Time of Day',
	            labelRenderer: $.jqplot.CanvasAxisLabelRenderer,
	            tickRenderer: $.jqplot.CanvasAxisTickRenderer,
	            tickOptions: {
	                angle: 15
	            }
	             
	          },
	          yaxis: {
	            label: 'MPH',
	            labelRenderer: $.jqplot.CanvasAxisLabelRenderer
	          }
	        }
	      });
	   
	  });

$(document).ready(function(){
    var plot2 = $.jqplot('pie1', [[['<35',25],['35-45',14],['45-70',7], ['Speeding', 15]]], {
        gridPadding: {top:0, bottom:38, left:0, right:0},
        seriesDefaults:{
            renderer:$.jqplot.PieRenderer, 
            trendline:{ show:false }, 
            rendererOptions: { padding: 8, showDataLabels: true }
        },
        legend:{
            show:true, 
            placement: 'outside', 
            rendererOptions: {
                numberRows: 1
            }, 
            location:'s',
            marginTop: '15px'
        }       
    });
});