package de.htw_berlin;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		long startTimeMilli, endTimeMilli;
		
		if(!readConfig()) {
			System.out.println("Config error, pleas check the configuration and try again.");
			return;
		}
		
		SensorHandler sensorHandler = new SensorHandler();
		
		while(true) {
			System.out.println("Start: " + new Date());
			startTimeMilli = System.currentTimeMillis();
			
			sensorHandler.readSensorData();
			sensorHandler.sendSensorData();
			
			endTimeMilli = System.currentTimeMillis();
			Thread.sleep((60000 - (endTimeMilli - startTimeMilli)));
		}

	}

	public static boolean readConfig() {
		Config.addTempSensorIds();
		
		return true;
	}

}
