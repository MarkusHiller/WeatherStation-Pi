package de.htw_berlin;

public abstract class SensorModel {
	
	protected int stationId;
	protected double stationLong;
	protected double stationLat;
	protected int sensorId;
	protected String sensorType;
	protected double value;
	protected String unit;
	
	public SensorModel() {
		
	}
	
	public abstract void getData();
	
}
