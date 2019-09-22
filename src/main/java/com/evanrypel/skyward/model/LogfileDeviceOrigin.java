package com.evanrypel.skyward.model;

public class LogfileDeviceOrigin
{
	private String user_interface_idiom;
	private String operating_system;
	private String model;
	private String device_ssid;
	
	public String getUser_interface_idiom()
	{
		return user_interface_idiom;
	}
	
	public void setUser_interface_idiom(String user_interface_idiom)
	{
		this.user_interface_idiom = user_interface_idiom;
	}
	
	public String getOperating_system()
	{
		return operating_system;
	}
	
	public void setOperating_system(String operating_system)
	{
		this.operating_system = operating_system;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getDevice_ssid()
	{
		return device_ssid;
	}
	
	public void setDevice_ssid(String device_ssid)
	{
		this.device_ssid = device_ssid;
	}
}
