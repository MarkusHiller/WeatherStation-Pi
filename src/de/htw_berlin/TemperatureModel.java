package de.htw_berlin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class TemperatureModel extends SensorModel{
	

	
	public TemperatureModel() {
		
		this.unit = "Celsius";
	}
	
	public void getData() {
		Process pr;
		try {
			pr = Runtime.getRuntime().exec("cat /sys/bus/w1/devices/10-000802e41494/w1_slave");
		
		BufferedReader in = new BufferedReader(new 

				InputStreamReader(pr.getInputStream()));
				String line;
				while ((line = in.readLine()) != null) {
				    System.out.println(line);
				}
				pr.waitFor();
				System.out.println("ok!");

				in.close();
		} catch (Exception e){
			
		}
				//string rawData = ;
		this.sensorid = (int)(Math.random()*(100 - 1));
		this.sensortype = "Temperature";
		this.value = Math.random()*(99 - 0);
		this.unit = "Einheit";
		this.timestamp = new Date();
	}
	
	
}
