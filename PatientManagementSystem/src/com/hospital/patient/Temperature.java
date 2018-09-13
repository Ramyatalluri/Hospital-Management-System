package com.hospital.patient;

public class Temperature {

	private final float READING;
	private final Partofthebody PART_OF_THE_BODY;
	//private char final sign  'F';

	public Temperature(float reading, Partofthebody partofthebody) {
		this.READING = reading;
		
		this.PART_OF_THE_BODY = partofthebody;
		
	}

	public float getReading() {
		return READING;
	}

	public Partofthebody getPartofthebody() {
		return PART_OF_THE_BODY;
	}
}