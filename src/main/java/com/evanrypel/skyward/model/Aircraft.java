package com.evanrypel.skyward.model;

public class Aircraft
{
	private String manufacturer;
	private String serial_number;
	private String name;
	private String model;
	private String firmware_version;
	
	public String getManufacturer()
	{
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer)
	{
		this.manufacturer = manufacturer;
	}
	
	public String getSerial_number()
	{
		return serial_number;
	}
	
	public void setSerial_number(String serial_number)
	{
		this.serial_number = serial_number;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getFirmware_version()
	{
		return firmware_version;
	}
	
	public void setFirmware_version(String firmware_version)
	{
		this.firmware_version = firmware_version;
	}
}
