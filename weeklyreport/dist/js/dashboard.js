  google.charts.load('current', {'packages':['geochart','corechart']});
  google.charts.setOnLoadCallback(drawRegionsMap);
  google.charts.setOnLoadCallback(drawCharts);

  function drawRegionsMap() {

    var data_regions = google.visualization.arrayToDataTable([
      ['Country', 'Presence of cool highligh'],
      ['Brazil', 400],
    ]);

    var options_regions = {
              region: 'BR'
     };
    var chart = new google.visualization.GeoChart(document.getElementById('regions_div'));

    chart.draw(data_regions, options_regions);
  }
 function drawCharts() {

     var data1 = google.visualization.arrayToDataTable([
     ['Income', 'Sales', 'Services', { role: 'annotation' } ],
     ['OCT', 28, 19, '']
   ]);

   var options1 = {
     width: 165,
     height: 125,
     legend: { position: 'bottom', maxLines: 3 },
     bar: { groupWidth: '40%' },
     isStacked: true
   };

   var chart1 = new google.visualization.BarChart(document.getElementById("indicador1"));
   var chart2 = new google.visualization.PieChart(document.getElementById("indicador2"));
   chart1.draw(data1, options1);
   chart2.draw(data1, options1);

 }
