package de.htw_berlin;

import java.util.Date;

public abstract class SensorModel {
	
	protected int stationId = (int)(Math.random()*(100 - 1));
	protected double stationLong = 52.455437;
	protected double stationLat = 13.526179;
	protected int sensorId;
	protected String sensorType;
	protected double value;
	protected String unit;
	protected Date timestamp;
	
	public SensorModel() {
		
	}
	
	public abstract void getData();
	
}
