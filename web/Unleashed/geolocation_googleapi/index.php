<html>
<head>
<script type="text/javascript">
	var map = null;
    var geocoder = null;

    function initialize() {
      if (GBrowserIsCompatible()) {
        map = new GMap2(document.getElementById("map_canvas"));
		map.setCenter(new GLatLng(37.4419, -122.1419), 1);
        map.setUIToDefault();
        geocoder = new GClientGeocoder();
      }
    }

    function showAddress(address) {
      if (geocoder) {
        geocoder.getLatLng(
          address,
          function(point) {
            if (!point) {
              alert(address + " not found");
            } else {
              map.setCenter(point, 15);
              var marker = new GMarker(point, {draggable: true});
              map.addOverlay(marker);
              GEvent.addListener(marker, "dragend", function() {
                marker.openInfoWindowHtml(marker.getLatLng().toUrlValue(6));
              });
              GEvent.addListener(marker, "click", function() {
                marker.openInfoWindowHtml(marker.getLatLng().toUrlValue(6));
              });
	      GEvent.trigger(marker, "click");
            }
          }
        );
      }
    }
  </script>
<script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAjU0EJWnWPMv7oQ-jjS7dYxSPW5CJgpdgO_s4yyMovOaVh_KvvhSfpvagV18eOyDWu7VytS6Bi1CWxw" type="text/javascript"></script>
<title></title>
</head>
<body onload="initialize()" onunload="GUnload()">
<form name="form1" action="#" onsubmit="showAddress(this.address.value); return false">
	<input type="text" style="width:450px;" name="address" id="address" value="Bacolod City Government Center">
    <input type="submit" value="Go!" />
</form>
<div id="map_canvas" style="width: 780px; border:2px solid #999; height: 650px;"></div>
</body>
</html>