<html>
	<head>
		<script src="http://d3js.org/d3.VG.min.js">
		</script>
	</head>
	<body>
		<div>hello</div>
		<div id="myDiv">world</div>
		<div class="divClass">there!</div>
		<script>
		d3.select('#myDiv').text('welcome');
		d3.select('div').text('welcome');
		d3.select('.divClass').text('welcome');
		</script>
	</body>
</html>