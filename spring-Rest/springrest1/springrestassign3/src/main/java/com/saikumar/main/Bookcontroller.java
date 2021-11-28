package com.saikumar.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Bookcontroller {
	@GetMapping(path = "/assignments")
	public List <Book>getAllBook()
	{
		return Arrays.asList(new Book (12, "master spring","saikumar"));
	}

}
