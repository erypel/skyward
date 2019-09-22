package com.evanrypel.skyward.model;

public class FlightLog
{
	private Event[] event;
	private String altitude_system;
	private String logging_start_dtg;
	private Object[][] flight_logging_items;
	private FlightData flight_data;
	
	public Event[] getEvent()
	{
		return event;
	}
	
	public void setEvent(Event[] event)
	{
		this.event = event;
	}
	
	public String getAltitude_system()
	{
		return altitude_system;
	}
	
	public void setAltitude_system(String altitude_system)
	{
		this.altitude_system = altitude_system;
	}
	
	public String getLogging_start_dtg()
	{
		return logging_start_dtg;
	}
	
	public void setLogging_start_dtg(String logging_start_dtg)
	{
		this.logging_start_dtg = logging_start_dtg;
	}
	
	public Object[][] getFlight_logging_items()
	{
		return flight_logging_items;
	}
	
	public void setFlight_logging_items(Object[][] flight_logging_items)
	{
		this.flight_logging_items = flight_logging_items;
	}
	
	public FlightData getFlight_data()
	{
		return flight_data;
	}
	
	public void setFlight_data(FlightData flight_data)
	{
		this.flight_data = flight_data;
	}
	
}
