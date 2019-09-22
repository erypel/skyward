package com.evanrypel.skyward.model;

public class Summary
{
	private String home_location_lat;
	private String home_location_lon;
	private AircraftSmartGohome aircraft_smart_gohome;
	
	public String getHome_location_lat()
	{
		return home_location_lat;
	}
	
	public void setHome_location_lat(String home_location_lat)
	{
		this.home_location_lat = home_location_lat;
	}
	
	public String getHome_location_lon()
	{
		return home_location_lon;
	}
	
	public void setHome_location_lon(String home_location_lon)
	{
		this.home_location_lon = home_location_lon;
	}
	
	public AircraftSmartGohome getAircraft_smart_gohome()
	{
		return aircraft_smart_gohome;
	}
	
	public void setAircraft_smart_gohome(AircraftSmartGohome aircraft_smart_gohome)
	{
		this.aircraft_smart_gohome = aircraft_smart_gohome;
	}
}
