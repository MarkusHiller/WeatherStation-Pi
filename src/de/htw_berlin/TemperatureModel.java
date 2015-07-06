package de.htw_berlin;

public class TemperatureModel extends SensorModel{
	

	
	public TemperatureModel() {
		
		this.unit = "Celsius";
	}
	
	public void getData() {
		this.sensorId = (int)(Math.random()*(100 - 1));
		this.sensorType = "Sensor";
		this.value = Math.random()*(99 - 0);
		this.unit = "Einheit";
	}
	
	
}
