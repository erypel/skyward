package com.evanrypel.skyward.model;

public class Payload
{
	private Camera camera;
	private Gimbal gimbal;
	
	public Camera getCamera()
	{
		return camera;
	}
	
	public void setCamera(Camera camera)
	{
		this.camera = camera;
	}
	
	public Gimbal getGimbal()
	{
		return gimbal;
	}
	
	public void setGimbal(Gimbal gimbal)
	{
		this.gimbal = gimbal;
	}
}
