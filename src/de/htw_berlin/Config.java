package de.htw_berlin;

import java.util.ArrayList;
import java.util.List;

public class Config {

	public static List<String> tempSensorIds = new ArrayList<String>();
	public static String serverUrl = "http://test.silverwars.de/testSensor";
	
	public static void addTempSensorIds() {
		tempSensorIds.add("10-000802e41494");
		tempSensorIds.add("10-000802e3c71f");
		tempSensorIds.add("10-000802e3d01b");
	}
}
