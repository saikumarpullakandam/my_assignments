package com.saikumar1;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController  

public class Addressresource {
	@Autowired  
	private Addresservice service;  
	@GetMapping("/address")  
	public List<Address> retriveAllUsers()  
	{  
	return service.findAll();  
	}  
	@GetMapping("/address/{id}")  
	public Address retriveUser(@PathVariable int id)  
	{  
	return service.findOne(id);  
	}  

	}  


