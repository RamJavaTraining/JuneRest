package com.imcs.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/hello")
public class HelloController {
	
	
	@Path("/get")
	@GET
	public Response get() {
		
		return Response.status(Status.NOT_MODIFIED).build();
	}
	
	
	
	@Path("/getstring")
	@GET
	public String getString() {
		
		return "Hello Rest Test String";
	}
	
	@Path("/user")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUser(@QueryParam(value = "name") String name) {
		User user= new User();
		user.setUserName(name);
		
		return Response.ok().entity(user).build();
	}
	@Path("/userpath/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserPath(@PathParam(value = "name") String name) {
		User user= new User();
		user.setUserName(name);
		user.setUserId(1234);
		 
		List<String> names = new ArrayList<String>();
		names.add("ABC");
		names.add("XYZ");
		
		Map<String,String> namesMap= new HashMap<String, String>();
		namesMap.put("ABC", "XYZ");
		namesMap.put("ABCD", "WXYZ");
		
		user.setNames(names);
		user.setNamesMap(namesMap);
		return Response.ok().entity(user).build();
	}
	
	
	@Path("/userpost")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postuser( User user) {
		
		return Response.ok().entity(user).build();
	}

}
