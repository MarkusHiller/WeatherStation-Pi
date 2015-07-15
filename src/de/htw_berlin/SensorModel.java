package de.htw_berlin;

import java.util.Date;

public abstract class SensorModel {

	protected String stationid = "Test";
	protected double stationlong = 52.455437;
	protected double stationlat = 13.526179;
	protected String sensorid;
	protected String sensortype;
	protected double value;
	protected String unit;
	protected Date timestamp;
	
	public SensorModel() {
		
	}
	
	public abstract void getData();
	
}
