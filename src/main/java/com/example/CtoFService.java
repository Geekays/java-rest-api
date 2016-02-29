package com.example;

import java.io.IOException;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ibm.json.java.JSON;
import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;


// This class define the RESTful API to fetch the database service information
// <basepath>/api/ctof

@Path("/ctof/{value}")
public class CtoFService {

	@GET
	@Produces("application/json")
	public String getInformation() throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        myJSONObj.put("message", "This is a converter for C to F!");
        return myJSONObj.toString();
	}

	//@Path("/ctof/{value}")
	@GET
	@Produces("application/json")
	public String getInformation(@PathParam("value") int value) throws Exception, IOException {
        JSONObject myJSONObj = new JSONObject();
        int f=value;
        myJSONObj.put("message", "f");
        return myJSONObj.toString();
        
	}

}