package com.sf.dao;

import java.sql.Timestamp;

public class SpeedCaptureTO {

	private String captureId;
	private String deviceId;
	private int speed;
	private String latitude;
	private String longitude;
	private Timestamp timestamp;
	
	public String getCaptureId() {
		return captureId;
	}
	public void setCaptureId(String captureId) {
		this.captureId = captureId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
