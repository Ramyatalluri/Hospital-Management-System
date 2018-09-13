package com.hospital.patient;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Record {
	
	private final Date DATE;
	private final Partoftheday PART_OF_THE_DAY;
	private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	public Record(Date date, Partoftheday partoftheday) {
		this.DATE = date;
		this.PART_OF_THE_DAY = partoftheday;
	}
	
	public Record(Partoftheday partoftheday) {
		this.DATE = new Date();
		this.PART_OF_THE_DAY = partoftheday;
	}
	
	public String getRecord() {
		String record = DATE_FORMAT.format(DATE) + "|" + PART_OF_THE_DAY;		
		return record;
	}
	
}