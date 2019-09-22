package com.evanrypel.skyward.model;

public class AircraftSmartGohome
{
	private String flight_return_time;
	private String landing_power;
	private String return_power;
	private String landing_radius;
	private String landing_time;
	
	public String getFlight_return_time()
	{
		return flight_return_time;
	}
	
	public void setFlight_return_time(String flight_return_time)
	{
		this.flight_return_time = flight_return_time;
	}
	
	public String getLanding_power()
	{
		return landing_power;
	}
	
	public void setLanding_power(String landing_power)
	{
		this.landing_power = landing_power;
	}
	
	public String getReturn_power()
	{
		return return_power;
	}
	
	public void setReturn_power(String return_power)
	{
		this.return_power = return_power;
	}
	
	public String getLanding_radius()
	{
		return landing_radius;
	}
	
	public void setLanding_radius(String landing_radius)
	{
		this.landing_radius = landing_radius;
	}
	
	public String getLanding_time()
	{
		return landing_time;
	}
	
	public void setLanding_time(String landing_time)
	{
		this.landing_time = landing_time;
	}
}
