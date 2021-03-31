package com.madhu.springsecurity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
	@RequestMapping("/")
	public String sayHi()
	{
		return "<h1>Hello Madhu<h1>";
	}
	
	@RequestMapping("/user")
	public String user()
	{
		return("<h1>Welcome User<h1>");
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return("<h1>Welcome Admin<h1>");
	}

}
