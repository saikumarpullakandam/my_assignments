package com.saikumar3;

public class User {
	

	public User(int id, String name ) {	// TODO Auto-generated constructor stub

	super();  
	this.id = id;  
	this.name = name;  
	 
	}  

	 

	private Integer id;  
	private String name;    
	public Integer getId()   
	{  
	return id;  
	}  
	public void setId(Integer id)   
	{  
	this.id = id;  
	}  
	public String getName()   
	{  
	return name;  
	}  
	public void setName(String name)   
	{  
	this.name = name;  
	}  

	@Override  
	public String toString()   
	{  
	//return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";  
	return String.format("User [id=%s, name=%s, dob=%s]", id, name);  
	}  
	}  


