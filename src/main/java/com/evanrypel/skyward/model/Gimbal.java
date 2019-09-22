package com.evanrypel.skyward.model;

public class Gimbal
{
	private String serial_number;
	private String firmware_version;
	public String getSerial_number()
	{
		return serial_number;
	}
	public void setSerial_number(String serial_number)
	{
		this.serial_number = serial_number;
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
