package com.casestudy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="Admin")
public class Admin  {
	
	@Id
	private String _id;
	private String username;
	@Field
	private String password;
	@Field
	

	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(String _id, String username, String password) {
		super();
		this._id = _id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [_id=" + _id + ", username=" + username + ", password=" + password + "]";
	}
	
	

}


