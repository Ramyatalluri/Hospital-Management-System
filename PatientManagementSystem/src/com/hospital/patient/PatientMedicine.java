package com.hospital.patient;

import java.util.List;

public class PatientMedicine {
	
	String Medicinename;
	public String dosage;
	public List<Partoftheday>  frequencylist;
	
    public	PatientMedicine(String dosage,  String Medicinename)
    {
    	this.Medicinename = Medicinename;
    	this.dosage =dosage;
    }
	

	public PatientMedicine() {
		// TODO Auto-generated constructor stub
	}


	public String getMedicinename() {
		return Medicinename;
	}




	public void setMedicinename(String medicinename) {
		Medicinename = medicinename;
	}




	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}


	public List<Partoftheday> getFrequencylist() {
		return frequencylist;
	}


	public void setFrequencylist(List<Partoftheday> frequencylist) {
		this.frequencylist = frequencylist;
	}
	
	
	
	
   
}
