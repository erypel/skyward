package com.evanrypel.skyward.model;

public class Message
{
	private File file;
	private String message_type;
	private FlightLog flight_logging;
	
	public File getFile()
	{
		return file;
	}
	
	public void setFile(File file)
	{
		this.file = file;
	}
	
	public String getMessage_type()
	{
		return message_type;
	}
	
	public void setMessage_type(String message_type)
	{
		this.message_type = message_type;
	}
	
	public FlightLog getFlight_logging()
	{
		return flight_logging;
	}
	
	public void setFlight_logging(FlightLog flight_logging)
	{
		this.flight_logging = flight_logging;
	}
}
