package de.htw_berlin;

public abstract class SensorModel {
	
	protected int sensorId;
	protected double value;
	protected String unit;
	
	public SensorModel() {

	}
	
	public abstract void getData();
	
}
