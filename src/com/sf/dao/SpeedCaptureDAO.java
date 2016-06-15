package com.sf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sf.DBService;

public class SpeedCaptureDAO {
	private static String GET_SPEED_LOGS = "SELECT * FROM public.speedCapture where DeviceID=?";
	
	private static String GET_SPEED_BY_RANGE = "SELECT * FROM public.speedCapture order by ";

	
	public static ArrayList<SpeedCaptureTO> getSpeedLogs(String deviceId) throws Exception {
		Connection dbConn = null;
		PreparedStatement preparedStatement = null;
		ArrayList<SpeedCaptureTO> speedCaptureTOArray= new ArrayList<SpeedCaptureTO>();
		try {
			try {
				dbConn = DBService.createConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			preparedStatement = dbConn.prepareStatement(GET_SPEED_LOGS);
			preparedStatement.setString(1, deviceId);

			// execute select SQL stetement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				SpeedCaptureTO speedCaptureTO = new SpeedCaptureTO();
				speedCaptureTO.setCaptureId(rs.getString("CaptureID"));
				speedCaptureTO.setDeviceId(rs.getString("DeviceID"));
				speedCaptureTO.setLatitude(rs.getString("Latitude"));
				speedCaptureTO.setLongitude(rs.getString("Longitude"));
				speedCaptureTO.setSpeed(rs.getInt("Speed"));
				speedCaptureTO.setTimestamp(rs.getTimestamp("Timestamp"));
				speedCaptureTOArray.add(speedCaptureTO);
			}
			
		} catch (SQLException sqle) {
			throw sqle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if (dbConn != null) {
				dbConn.close();
			}
			throw e;
		} finally {
			if (dbConn != null) {
				dbConn.close();
			}
		}
		return speedCaptureTOArray;
	}
}
