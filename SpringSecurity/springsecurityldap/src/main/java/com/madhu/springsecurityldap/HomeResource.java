package com.madhu.springsecurityldap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class HomeResource {
	
	@RequestMapping("/")
	public String index()
	{
		return "Home Page";
	}

}
