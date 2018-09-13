package com.hospital.patient;

public class TemperatureConversion {

	public double toCelcius(double ftemp)
	{
		double c =  ((ftemp - (32.0)) / 1.8);
		return c;
		
	}
	
	
public float toFarenheit(float  cel)
{
	float farenh = (float) (cel* 1.8 +32);
	return farenh;
	
}


public float toKelvin(float celciu)
{
	celciu = celciu + 273;
	return celciu;
	
}
}
