package com.evanrypel.skyward.model;

public class File
{
	private String creation_dtg;
	private String logging_type;
	private String filename;
	
	public String getCreation_dtg()
	{
		return creation_dtg;
	}
	
	public void setCreation_dtg(String creation_dtg)
	{
		this.creation_dtg = creation_dtg;
	}
	
	public String getLogging_type()
	{
		return logging_type;
	}
	
	public void setLogging_type(String logging_type)
	{
		this.logging_type = logging_type;
	}
	
	public String getFilename()
	{
		return filename;
	}
	
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
}
