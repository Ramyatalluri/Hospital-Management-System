package com.hospital.patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Patient {

	String patientname;
	int patientid;
	String disease;	
	public Map<String,Temperature> readings = new HashMap<>();
	public List<PatientMedicine> medicinelist = new ArrayList<>();
	

	public Patient(String patientname, String disease, int patientid) {
		this.patientname = patientname;
		this.patientid = patientid;
		this.disease = disease;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}	

	public Map<String, Temperature> getReadings() {
		return readings;
	}

	public void setReadings(Map<String, Temperature> readings) {
		this.readings = readings;
	}

	public List<PatientMedicine> getMedicinelist() {
		return medicinelist;
	}

	public void setMedicinelist(List<PatientMedicine> medicinelist) {
		this.medicinelist = medicinelist;
	}

	

	
	
	
}