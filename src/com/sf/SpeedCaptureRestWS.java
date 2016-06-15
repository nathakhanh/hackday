package com.sf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
@Path("/speedCapture")  
public class SpeedCaptureRestWS {

	@GET 
	@Path("/doIndividualSpeedCapture")
	@Produces(MediaType.APPLICATION_JSON)
	public String doIndividualSpeedCapture(@QueryParam("FirstName") String firstName, @QueryParam("LastName") String lastName, @QueryParam("TimeStamp") String timeStamp){
		String response = "";
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(timeStamp);
		
		
		try {
//			response = callDAO(uname, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}

//	response = "doIndividualSpeedCapture";
	String returnedJOSNObj = constructIndividualJSON(response);	
	System.out.println(returnedJOSNObj);
	return returnedJOSNObj;		
	}
	

	@GET 
	@Path("/doDriverCountSpeed")
	@Produces(MediaType.APPLICATION_JSON) 
	public String doDriverCountSpeed(@QueryParam("TimeStamp") String timeStamp){
		String response = "";
		
		System.out.println(timeStamp);
		
		
		try {
//			response = callDAO(uname, pwd);

		} catch (Exception e) {
			e.printStackTrace();
		}

//	response = "doDriverCountSpeed";
	response = constructDriverCountJSON("");
	System.out.println(response);
	return response;		
	}
	
	public static String constructDriverCountJSON(String response) {
	JSONObject obj = new JSONObject();
	try {
		obj.put("speed1", "45");
		obj.put("speed2", "30");
		obj.put("speed3", "65");
		obj.put("speed4", "10");

	} catch (JSONException e) {
	}
	return obj.toString();
}
	
	public static String constructIndividualJSON(String response) {
	JSONObject obj = new JSONObject();
	try {
		obj.put("individualResponse", response);

	} catch (JSONException e) {
	}
	return obj.toString();
}
	
//	public static String constructJSON(String tag, boolean status) {
//		JSONObject obj = new JSONObject();
//		try {
//			obj.
//			obj.put("a", 30);
//			obj.put("2", 30);
//			obj.put("3", 30);
//			obj.put("4", 30);
//
//			obj.put("status", new Boolean(status));
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//		}
//		return obj.toString();
//	}

	
}
