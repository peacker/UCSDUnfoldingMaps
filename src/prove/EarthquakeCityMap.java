package prove;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthquakeCityMap extends PApplet {
	private UnfoldingMap map;
	
	public void setup()  {
		size(950, 600, OPENGL);
		map = new UnfoldingMap(this, 150, 50, 650, 500, new Google.GoogleMapProvider());
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		
		Location valLoc = new Location(-38.14f, -73.03f);
		Marker val = new SimplePointMarker(valLoc);
		map.addMarker(val);
	}
	
	public void draw() {
		background(10);
		map.draw();
		//addKey();
	}
}
