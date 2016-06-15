package com.sf.model;

import java.sql.Timestamp;

public class SpeedCapture {

	private int captureID;
	private int deviceID;
	private double speed;
	private double latitude;
	private double longtitude;
	private Timestamp timeStamp;
	
	public int getCaptureID() {
		return captureID;
	}
	public void setCaptureID(int captureID) {
		this.captureID = captureID;
	}
	public int getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(int deviceID) {
		this.deviceID = deviceID;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
