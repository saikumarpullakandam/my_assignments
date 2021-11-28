package com.saikumar.main1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class RestUser {

	
	public static void main (String[]args)
	{
		SpringApplication.run( RestUser.class, args);
		
		System.out.println("App started");
	}
}
