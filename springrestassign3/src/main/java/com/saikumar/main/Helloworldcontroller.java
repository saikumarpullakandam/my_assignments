package com.saikumar.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Helloworldcontroller {
	
	@GetMapping(path="/helloworld")
	public String display()
	{
		return "hello world!!!!";
	}
	@GetMapping(path="/pathvariable/{name}")
	
	public Helloworld  helloworldpathVariable(@PathVariable String name,String id)
	{
		return new Helloworld(String.format("Hello world, %s",name,id));
	}

}
