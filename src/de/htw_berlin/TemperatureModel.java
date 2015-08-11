package de.htw_berlin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemperatureModel extends SensorModel{
	
	public TemperatureModel(String id) {
		
		this.unit = "Celsius";
		this.sensorid = id;
	}
	
	public void readData() {
		Process pr;
		List<String> lines = new ArrayList<String>();
		try {
			pr = Runtime.getRuntime().exec("cat /sys/bus/w1/devices/" + this.sensorid + "/w1_slave");
		
		BufferedReader in = new BufferedReader(new 

				InputStreamReader(pr.getInputStream()));
				String line;
				
				while ((line = in.readLine()) != null) {
				    lines.add(line);
				}
				pr.waitFor();

				in.close();
		} catch (Exception e){
			
		}
		
		if(lines.get(0).contains("YES")) {
			this.sensortype = "Temperature";
			this.value = Double.parseDouble(lines.get(1).substring(lines.get(1).indexOf("t=") + 2, lines.get(1).length())) * 0.001;
			this.unit = "Einheit";
			this.timestamp = new Date();
		}
		
	}
	
	
}
