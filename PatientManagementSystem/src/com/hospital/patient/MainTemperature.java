package com.hospital.patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;

import com.sun.glass.ui.Timer;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainTemperature {
	public static final float DEFAULT_TEMPERATURE = 98.3f;
	public static final float DEFAULT_TEMPERATURE_MAX = 100f;
	public Partoftheday partoftheday;

	public static void main(String[] args)  throws Exception {
				
		Patient patient = new Patient("ramya","fever", 123);
		Patient patient1 = new Patient("hareesh","bodypains",124);
		Record record1 = new Record(Partoftheday.MORNING);
		Temperature temp1 = new Temperature(98.3f, Partofthebody.armpit);			
		patient.getReadings().put(record1.getRecord(), temp1);
		
		Record record2 = new Record(Partoftheday.AFTERNOON);
		Temperature temp2 = new Temperature(98.9f, Partofthebody.tounge);
		patient.getReadings().put(record2.getRecord(), temp2);		
		
		Record record3 = new Record(Partoftheday.EVENING);
		Temperature temp3 = new Temperature(100f,Partofthebody.tounge);
		patient.getReadings().put(record3.getRecord(),temp3);
		
		Record record4 = new Record(Partoftheday.NIGHT);
		Temperature temp4 = new Temperature(103.4f, Partofthebody.tounge);
		patient.getReadings().put(record4.getRecord(),temp4);
		
		
		/*final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	     java.util.Date yourDate = sdf.parse("06/09/2018");		
		Record record5 = new Record(yourDate,Partoftheday.AFTERNOON);*/		
		
		List<Patient> patientList = new ArrayList<Patient>();
	    patientList.add(patient);
	    patientList.add(patient1);
	    
	    
	    List<Partoftheday> freque1 = new ArrayList<Partoftheday>();
	    freque1.add(Partoftheday.MORNING);
	    freque1.add(Partoftheday.NIGHT);
	    
	    PatientMedicine medicine = new PatientMedicine("1","tylonal ");
	    medicine.setFrequencylist(freque1);
	   
	   
	    
	    List<PatientMedicine> medicineList = new ArrayList<PatientMedicine>();
	    medicineList.add(medicine);
	    patient.setMedicinelist(medicineList);
	    System.out.println("patient medicines");
	    for(Patient patientt : patientList){
	    	System.out.println(patientt.patientid);
	    	System.out.println(patientt.disease);
	    	System.out.println(patientt.patientname); 
	    	for(PatientMedicine patmed : patientt.medicinelist)
	    	{
	    		System.out.println(patmed.getMedicinename());
	    		System.out.println(patmed.getDosage());
	    		
	    		for(Partoftheday ptday : patmed.getFrequencylist())
	    		{
	    			System.out.println(ptday.getClass());
	    			String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.
	    	    	System.out.println(newLine);
	    		}
	    	}    	
	    	   	
	    	
	    }
	    
	  	 
	    
	    System.out.println("+++++++++++++++++++++++ Patient temperature to findout patient has fever or not ");	 
	    
	    
	    
	      
	    System.out.println(Arrays.asList(patient.getReadings()));
	    System.out.println(Collections.singletonList(patient.getReadings()));
			
		for (Patient patientt : patientList) {   
	    for (Temperature value : patientt.getReadings().values()) {
	    	   System.out.println("Value = "  + value);
	    	   System.out.println(value.getPartofthebody());
	    	   System.out.println(value.getReading());
	    	   TemperatureConversion temperatureConversion = new TemperatureConversion();
	    	   System.out.println("temperatureConversion to f to c" + temperatureConversion.toCelcius(value.getReading() ));
	    	  
	    	   
	    	  if(value.getReading() >= DEFAULT_TEMPERATURE &&  value.getReading() <= DEFAULT_TEMPERATURE_MAX
	   				&& value.getReading() >= DEFAULT_TEMPERATURE && value.getReading() <= DEFAULT_TEMPERATURE_MAX
	   				&& value.getReading() >= DEFAULT_TEMPERATURE &&  value.getReading() <= DEFAULT_TEMPERATURE_MAX)

	   			{
	   				System.out.println("NO FEver");
	   			}
	   			else
	   			{
	   				System.out.println("patient has  FEver");
	   			}
	    	}
		}
		
		  String newLine = System.lineSeparator();//This will retrieve line separator 
	    	System.out.println(newLine);
	    	System.out.println("notify nurse about patient medication");
	    	
	    	List<Partoftheday> frequency = new ArrayList<Partoftheday>();
	    	frequency.add(Partoftheday.MORNING);
	    	frequency.add(Partoftheday.NIGHT);
	    	/*Timer timer = new Timer(); 
	    	TimerTask task = new Scheduler(); 
	    	
	    	timer.schedule(task, 1000,60000);*/
	
		
	}


	}

