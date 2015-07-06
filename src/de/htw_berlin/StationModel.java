package de.htw_berlin;

public class StationModel extends SensorModel{

	public void getData() {
		this.stationId = (int)(Math.random()*(100 - 1));
		this.stationLong = 52.455437;
		this.stationLat = 13.526179;
	}
}
