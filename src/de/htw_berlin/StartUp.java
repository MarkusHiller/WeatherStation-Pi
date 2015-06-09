package de.htw_berlin;

import java.util.Date;

public class StartUp {

	public static void main(String[] args) throws InterruptedException {
		long startTimeMilli, endTimeMilli;
		
		while(true) {
			System.out.println("Start: " + new Date());
			startTimeMilli = System.currentTimeMillis();
			Thread.sleep(1000);
			
			endTimeMilli = System.currentTimeMillis();
			Thread.sleep((60000 - (endTimeMilli - startTimeMilli)));
		}

	}

}
