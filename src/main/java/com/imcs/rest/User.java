package com.imcs.rest;

import java.util.List;
import java.util.Map;

public class User {
	
	private String userName;
	private Integer userId;
	
	private List<String> names;
	private Map<String,String> namesMap;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Map<String,String> getNamesMap() {
		return namesMap;
	}

	public void setNamesMap(Map<String,String> namesMap) {
		this.namesMap = namesMap;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
