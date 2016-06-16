<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Speed Capturer</title>
<jsp:include page='Bootstrap.html' />
<jsp:include page='JQPlot.html' />
<link rel="stylesheet" href="main.css" type="text/css" />
<script src="mainscript.js"></script>
</head>
<body>

<div class="container">
  <div class="jumbotron">
    <h1>Speed Capturer</h1>
    <p>See how you drive today and compare your speed with your peers!</p>
  </div>
</div>

<div id="wrapper">
<div id="charts">
	<h3>Driver's Speed Compilation</h3>
	<div id="chart1"></div>
	<br />
    <h3>Number of Drivers per Speed Range</h3>
    Number of drivers: <span class="numOfDrivers"></span><br />
    Location: <span class="location"></span>
    <div id="pie1"></div>
</div>
</div>


</body>
</html>