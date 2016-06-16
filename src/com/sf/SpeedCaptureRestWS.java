package com.sf;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.sf.dao.SpeedCaptureDAO;
import com.sf.dao.SpeedCaptureTO;

@Path("/speedCapture")
public class SpeedCaptureRestWS {

	@GET
	@Path("/doIndividualSpeedCapture")
	@Produces(MediaType.APPLICATION_JSON)
	public String doIndividualSpeedCapture(@QueryParam("deviceId") String deviceId,
			@QueryParam("LastName") String lastName, @QueryParam("TimeStamp") String timeStamp) {
		List<SpeedCaptureTO> response = new ArrayList<>();
		String returnedJOSNObj = "";
		// System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(timeStamp);

		try {
			SpeedCaptureDAO speedCaptureDAO = new SpeedCaptureDAO();

			ArrayList<SpeedCaptureTO> array = speedCaptureDAO.getSpeedLogs(deviceId);

			returnedJOSNObj = constructIndividualJSON(array);

			// response = callDAO(uname, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// response = "doIndividualSpeedCapture";
		// System.out.println(returnedJOSNObj);
		return returnedJOSNObj;
	}

	@GET
	@Path("/doDriverCountSpeed")
	@Produces(MediaType.APPLICATION_JSON)
	public String doDriverCountSpeed(@QueryParam("TimeStamp") String timeStamp) {
		String response = "";

		System.out.println(timeStamp);

		try {
			// response = callDAO(uname, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// response = "doDriverCountSpeed";
		response = constructDriverCountJSON("");
		System.out.println(response);
		return response;
	}

	public static String constructIndividualJSON(List<SpeedCaptureTO> speedCaptureTOs) {
		JSONObject obj = new JSONObject();
		try {
			int i = 0;
			for (SpeedCaptureTO speedCaptureTO : speedCaptureTOs) {
				obj.put("speed" + i++, speedCaptureTO.getSpeed());

			}
			
			obj.put("speedLimit1", "45");
			obj.put("speedLimit2", "45");
			obj.put("speedLimit3", "45");
			obj.put("speedLimit4", "65");
			obj.put("speedLimit5", "65");
			obj.put("speedLimit6", "65");
			obj.put("speedLimit7", "0");
			obj.put("speedLimit8", "0");
			obj.put("speedLimit9", "0");
			obj.put("speedLimit10", "0");
			obj.put("speedLimit11", "0");
			obj.put("speedLimit12", "0");
			obj.put("speedLimit13", "0");
			obj.put("speedLimit14", "0");
			obj.put("speedLimit15", "45");
			obj.put("speedLimit16", "65");
			obj.put("speedLimit17", "65");
			obj.put("speedLimit18", "35");
			obj.put("speedLimit19", "45");
			obj.put("speedLimit20", "45");
			obj.put("speedLimit21", "45");
			obj.put("speedLimit22", "45");
			obj.put("speedLimit23", "65");
			obj.put("speedLimit24", "65");
			
		} catch (JSONException e) {
		}

		return obj.toString();
	}

	public static String oldConstructIndividualJSON(String response) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("speed1", "45");
			obj.put("speed2", "30");
			obj.put("speed3", "65");
			obj.put("speed4", "70");
			obj.put("speed5", "75");
			obj.put("speed6", "85");
			obj.put("speed7", "10");
			obj.put("speed8", "23");
			obj.put("speed9", "45");
			obj.put("speed10", "90");
			obj.put("speed11", "66");
			obj.put("speed12", "55");
			obj.put("speed13", "17");
			obj.put("speed14", "20");
			obj.put("speed15", "34");
			obj.put("speed16", "66");
			obj.put("speed17", "76");
			obj.put("speed18", "23");
			obj.put("speed19", "54");
			obj.put("speed20", "56");
			obj.put("speed21", "34");
			obj.put("speed22", "38");
			obj.put("speed23", "77");
			obj.put("speed24", "88");

			obj.put("speedLimit1", "45");
			obj.put("speedLimit2", "45");
			obj.put("speedLimit3", "45");
			obj.put("speedLimit4", "65");
			obj.put("speedLimit5", "65");
			obj.put("speedLimit6", "65");
			obj.put("speedLimit7", "25");
			obj.put("speedLimit8", "25");
			obj.put("speedLimit9", "45");
			obj.put("speedLimit10", "65");
			obj.put("speedLimit11", "65");
			obj.put("speedLimit12", "45");
			obj.put("speedLimit13", "35");
			obj.put("speedLimit14", "35");
			obj.put("speedLimit15", "35");
			obj.put("speedLimit16", "65");
			obj.put("speedLimit17", "65");
			obj.put("speedLimit18", "35");
			obj.put("speedLimit19", "45");
			obj.put("speedLimit20", "45");
			obj.put("speedLimit21", "45");
			obj.put("speedLimit22", "45");
			obj.put("speedLimit23", "65");
			obj.put("speedLimit24", "65");

		} catch (JSONException e) {
		}
		return obj.toString();
	}

	public static String constructDriverCountJSON(String response) {
		JSONObject obj = new JSONObject();
		try {

			obj.put("speed1", "45");
			obj.put("speed2", "30");
			obj.put("speed3", "65");
			obj.put("speed4", "10");
			obj.put("numOfDrivers", "4300");
			obj.put("location", "Dunwoody Area");

		} catch (JSONException e) {
		}
		return obj.toString();
	}

	// public static String constructJSON(String tag, boolean status) {
	// JSONObject obj = new JSONObject();
	// try {
	// obj.
	// obj.put("a", 30);
	// obj.put("2", 30);
	// obj.put("3", 30);
	// obj.put("4", 30);
	//
	// obj.put("status", new Boolean(status));
	// } catch (JSONException e) {
	// // TODO Auto-generated catch block
	// }
	// return obj.toString();
	// }

}
