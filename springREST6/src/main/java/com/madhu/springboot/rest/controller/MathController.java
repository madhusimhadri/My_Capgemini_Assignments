package com.madhu.springboot.rest.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MathController 
{
	@Autowired
	RestTemplate template;
	@Autowired
	MathService service;
	
	@RequestMapping(value = "/consume/add", method=RequestMethod.POST)
	public String add(@RequestBody Maths ms) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<Maths> entity = new HttpEntity<Maths>(ms,headers);
		return template.exchange("http://localhost:8080/add", HttpMethod.POST, entity, String.class).getBody();
	}
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public long check(@RequestBody Maths ms) {
		
		return service.add(ms.getN1(), ms.getN2());
	}
}
