package de.htw_berlin;

import java.io.IOException;
import java.util.Date;

public class StartUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		long startTimeMilli, endTimeMilli;
		NetworkHandler nh = new NetworkHandler();
		TemperatureModel tm = new TemperatureModel();
		
		while(true) {
			System.out.println("Start: " + new Date());
			startTimeMilli = System.currentTimeMillis();
			tm.getData();
			nh.send(tm);
			
			endTimeMilli = System.currentTimeMillis();
			Thread.sleep((60000 - (endTimeMilli - startTimeMilli)));
		}

	}

}
