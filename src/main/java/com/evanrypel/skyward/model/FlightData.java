package com.evanrypel.skyward.model;

public class FlightData
{
	private Payload payload;
	private RemoteController remote_controller;
	private Aircraft aircraft;
	private Summary summary;
	private GCS gcs;
	private String flight_session_end;
	private FlightController flight_controller;
	private Battery battery;
	private String flight_session_start;
	private LogfileDeviceOrigin logfile_device_origin;

	public Payload getPayload()
	{
		return payload;
	}
	
	public void setPayload(Payload payload)
	{
		this.payload = payload;
	}
	
	public RemoteController getRemote_controller()
	{
		return remote_controller;
	}
	
	public void setRemote_controller(RemoteController remote_controller)
	{
		this.remote_controller = remote_controller;
	}
	
	public Aircraft getAircraft()
	{
		return aircraft;
	}
	
	public void setAircraft(Aircraft aircraft)
	{
		this.aircraft = aircraft;
	}
	
	public Summary getSummary()
	{
		return summary;
	}
	
	public void setSummary(Summary summary)
	{
		this.summary = summary;
	}
	
	public GCS getGcs()
	{
		return gcs;
	}
	
	public void setGcs(GCS gcs)
	{
		this.gcs = gcs;
	}
	
	public String getFlight_session_end()
	{
		return flight_session_end;
	}
	
	public void setFlight_session_end(String flight_session_end)
	{
		this.flight_session_end = flight_session_end;
	}
	
	public FlightController getFlight_controller()
	{
		return flight_controller;
	}
	
	public void setFlight_controller(FlightController flight_controller)
	{
		this.flight_controller = flight_controller;
	}
	
	public Battery getBattery()
	{
		return battery;
	}
	
	public void setBattery(Battery battery)
	{
		this.battery = battery;
	}
	
	public String getFlight_session_start()
	{
		return flight_session_start;
	}
	
	public void setFlight_session_start(String flight_session_start)
	{
		this.flight_session_start = flight_session_start;
	}
	
	public LogfileDeviceOrigin getLogfile_device_origin()
	{
		return logfile_device_origin;
	}
	
	public void setLogfile_device_origin(LogfileDeviceOrigin logfile_device_origin)
	{
		this.logfile_device_origin = logfile_device_origin;
	}
}
