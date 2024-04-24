package com.hsrp.nic_project.dto;

import com.hsrp.nic_project.relation.User;

public class DataRequest {
	
	private User user;

	public DataRequest() 
	{
		
	}

	public DataRequest(User user) 
	{
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "DataRequest [user=" + user + "]";
	}
	
	
}
