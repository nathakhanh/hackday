package com.sf;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
@Path("/login")
public class LoginRestWS {

	@GET 
	@Path("/dologin")
	@Produces(MediaType.APPLICATION_JSON) 
	public String doLogin(@QueryParam("username") String uname, @QueryParam("password") String pwd){
		String response = "";
		
		boolean result;
		try {
			result = DBService.checkLogin(uname, pwd);
			response = constructJSON("login",result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	return response;		
	}
	

	
	public static String constructJSON(String tag, boolean status) {
		JSONObject obj = new JSONObject();
		try {
			obj.put("tag", tag);
			obj.put("status", new Boolean(status));
		} catch (JSONException e) {
			// TODO Auto-generated catch block
		}
		return obj.toString();
	}
	
}
