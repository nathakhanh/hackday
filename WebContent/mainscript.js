
$(document).ready(function(){
	getIndividualLineChartData();
    getPieChartData();
});

function getIndividualLineChartData() {
	
	jQuery.ajax({
        type: "GET",
        url: "http://localhost:8080/hackday/rest/speedCapture/doIndividualSpeedCapture?deviceId=afdba0877d513bdc",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	
      	  		var speed = [["00:00",data.speed1*1], ["1:00", data.speed2*1], ["2:00", data.speed3*1], ["3:00", data.speed4*1]
			      	  		,["4:00",data.speed5*1], ["5:00", data.speed6*1], ["6:00", data.speed7*1], ["7:00", data.speed8*1]
			      	  		,["8:00",data.speed9*1], ["9:00", data.speed10*1], ["10:00", data.speed11*1], ["11:00", data.speed12*1]
			      	  		,["12:00",data.speed13*1], ["13:00", data.speed14*1], ["14:00", data.speed15*1], ["15:00", data.speed16*1]
			      	  		,["16:00",data.speed17*1], ["17:00", data.speed18*1], ["18:00", data.speed19*1], ["19:00", data.speed20*1]
      	  					,["20:00",data.speed21*1], ["21:00", data.speed22*1], ["22:00", data.speed23*1], ["23:00", data.speed24*1]];
      	  		
      	  	var speedLimit = [["00:00",data.speedLimit1*1], ["1:00", data.speedLimit2*1], ["2:00", data.speedLimit3*1], ["3:00", data.speedLimit4*1]
  	  		,["4:00",data.speedLimit5*1], ["5:00", data.speedLimit6*1], ["6:00", data.speedLimit7*1], ["7:00", data.speedLimit8*1]
  	  		,["8:00",data.speedLimit9*1], ["9:00", data.speedLimit10*1], ["10:00", data.speedLimit11*1], ["11:00", data.speedLimit12*1]
  	  		,["12:00",data.speedLimit13*1], ["13:00", data.speedLimit14*1], ["14:00", data.speedLimit15*1], ["15:00", data.speedLimit16*1]
  	  		,["16:00",data.speedLimit17*1], ["17:00", data.speedLimit18*1], ["18:00", data.speedLimit19*1], ["19:00", data.speedLimit20*1]
				,["20:00",data.speedLimit21*1], ["21:00", data.speedLimit22*1], ["22:00", data.speedLimit23*1], ["23:00", data.speedLimit24*1]];
	

      	  	
		  	    var plot1 = $.jqplot('chart1', [speed, speedLimit], {
		  	        axes: {
		  	          xaxis: {
		  	            renderer: $.jqplot.CategoryAxisRenderer,
		  	            label: 'Time of Day',
		  	            labelRenderer: $.jqplot.CanvasAxisLabelRenderer,
		  	            tickRenderer: $.jqplot.CanvasAxisTickRenderer,
		  	            tickOptions: {
		  	                angle: 15
		  	            }
		  	             
		  	          },
		  	          yaxis: {
		  	        	min:0,
		  	        	max:120,
		  	            label: 'MPH',
		  	            labelRenderer: $.jqplot.CanvasAxisLabelRenderer
		  	          }
		  	        },
		  	       legend:{
	                    show:true, 
	                    placement: 'outside', 
	                    rendererOptions: {
	                        numberRows: 1
	                    }, 
	                    location:'e',
	                    marginTop: '15px'
	                },
	                series: [
	                	{ label: 'Your Speed'},
	                	{ label: 'Speed Limit'}
	                ]
		  	      });
        },

        error: function (jqXHR, status) {
            // error handler
        }
	});   	

}

function getPieChartData() {

	var speed1;
	var speed2;
	var speed3;
	var speed4;
	jQuery.ajax({
        type: "GET",
        url: "http://localhost:8080/hackday/rest/speedCapture/doDriverCountSpeed?TimeStamp=5:00PM_06_06_2016",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	speed1 = data.speed1;
        	speed2 = data.speed2;
        	speed3 = data.speed3;
        	speed4 = data.speed4;
        	$('span.numOfDrivers').html(data.numOfDrivers);
        	$('span.location').html(data.location);
        	
            var plot2 = $.jqplot('pie1', [[['<35 mph',speed1*1],['35-45 mph',speed2*1],['45-70 mph',speed3*1], ['Speeding', speed4*1]]], {
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
            
            
            // do something
            //alert(data.speed1+"|"+data.speed2+"|"+data.speed3+"|"+data.speed4);
        },

        error: function (jqXHR, status) {
            // error handler
        }
	});   
    

}   

