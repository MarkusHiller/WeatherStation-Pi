package de.htw_berlin;

import java.util.Date;

public class TemperatureModel extends SensorModel{
	

	
	public TemperatureModel() {
		
		this.unit = "Celsius";
	}
	
	public void getData() {
		this.sensorid = (int)(Math.random()*(100 - 1));
		this.sensortype = "Temperature";
		this.value = Math.random()*(99 - 0);
		this.unit = "Einheit";
		this.timestamp = new Date();
	}
	
	
}
