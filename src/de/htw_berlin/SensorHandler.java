package de.htw_berlin;

import java.util.ArrayList;
import java.util.List;

public class SensorHandler {

	private NetworkHandler nh;
	private List<SensorModel> sensors = new ArrayList<SensorModel>();

	public SensorHandler() {
		nh = new NetworkHandler();
		createTemperatureSensors();
	}

	/**
	 * fill the models with new data
	 */
	public void readSensorData() {
		for (SensorModel sensor : sensors) {
			sensor.readData();
		}
	}

	/**
	 * send the model data to server
	 */
	public void sendSensorData() {
		for (SensorModel sensor : sensors) {
			nh.send(sensor);
		}
	}

	/**
	 * Add 1-wire temperature sensors
	 */
	private void createTemperatureSensors() {
		int i = 0;

		for (Object sensorId : Config.tempSensorIds) {
			sensors.add(new TemperatureModel((String) sensorId));
			i++;
		}
		System.out.println(i + " 1-wire temperature sensors created.");
	}

}
