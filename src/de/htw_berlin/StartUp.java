package de.htw_berlin;

import java.io.IOException;
import java.util.Date;

public class StartUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		long startTimeMilli, endTimeMilli;
		NetworkHandler nh = new NetworkHandler();
		TemperatureModel tm1 = new TemperatureModel("10-000802e41494");
		TemperatureModel tm2 = new TemperatureModel("10-000802e3c71f");
		TemperatureModel tm3 = new TemperatureModel("10-000802e3d01b");
		StationModel sm = new StationModel();
		
		while(true) {
			System.out.println("Start: " + new Date());
			startTimeMilli = System.currentTimeMillis();
			tm1.getData();
			tm2.getData();
			tm3.getData();
			nh.send(tm1);
			nh.send(tm2);
			nh.send(tm3);
			
			endTimeMilli = System.currentTimeMillis();
			Thread.sleep((60000 - (endTimeMilli - startTimeMilli)));
		}

	}

}
