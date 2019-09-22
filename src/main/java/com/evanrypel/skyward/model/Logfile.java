package com.evanrypel.skyward.model;

public class Logfile
{
	private String exchange_type;
	private String exchanger;
	private String uploadingOrgUuid;
	private String uploadingPilorUuid;
	private String flight_session_id;
	private Message message;
	
	public String getExchange_type()
	{
		return exchange_type;
	}
	
	public void setExchange_type(String exchange_type)
	{
		this.exchange_type = exchange_type;
	}
	
	public String getExchanger()
	{
		return exchanger;
	}
	
	public void setExchanger(String exchanger)
	{
		this.exchanger = exchanger;
	}
	
	public String getUploadingOrgUuid()
	{
		return uploadingOrgUuid;
	}
	
	public void setUploadingOrgUuid(String uploadingOrgUuid)
	{
		this.uploadingOrgUuid = uploadingOrgUuid;
	}
	
	public String getUploadingPilorUuid()
	{
		return uploadingPilorUuid;
	}
	
	public void setUploadingPilorUuid(String uploadingPilorUuid)
	{
		this.uploadingPilorUuid = uploadingPilorUuid;
	}
	
	public String getFlight_session_id()
	{
		return flight_session_id;
	}
	
	public void setFlight_session_id(String flight_session_id)
	{
		this.flight_session_id = flight_session_id;
	}
	
	public Message getMessage()
	{
		return message;
	}
	
	public void setMessage(Message message)
	{
		this.message = message;
	}
}