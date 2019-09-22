package com.evanrypel.skyward.model;

public class Battery
{
	private String serial_number;
	private String remaining_life;
	private String discharges;
	private String full_charge_volume;
	private String cell_number;
	private String firmware_version;
	
	public String getSerial_number()
	{
		return serial_number;
	}
	
	public void setSerial_number(String serial_number)
	{
		this.serial_number = serial_number;
	}
	
	public String getRemaining_life()
	{
		return remaining_life;
	}
	
	public void setRemaining_life(String remaining_life)
	{
		this.remaining_life = remaining_life;
	}
	
	public String getDischarges()
	{
		return discharges;
	}
	
	public void setDischarges(String discharges)
	{
		this.discharges = discharges;
	}
	
	public String getFull_charge_volume()
	{
		return full_charge_volume;
	}
	
	public void setFull_charge_volume(String full_charge_volume)
	{
		this.full_charge_volume = full_charge_volume;
	}
	
	public String getCell_number()
	{
		return cell_number;
	}
	
	public void setCell_number(String cell_number)
	{
		this.cell_number = cell_number;
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
