package com.madhu.springREST7.API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController 

{
	@Autowired
	private orderService orderService;
	
	@RequestMapping("/orders")
	public List<Order> getAllOrders()
	{
		return orderService.getAllOrders();
	}
	
	@RequestMapping("/orders/{id}")
	public Order getOrder(@PathVariable String id)
	{
		return orderService.getOrder(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/orders")
	public void addOrder(@RequestBody Order order)
	{
		orderService.addOrder(order);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/orders/{id}")
	public void updateOrder(@RequestBody Order order,@PathVariable String id)
	{
		orderService.updateOrder(id,order);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/orders/{id}")
	public void deleteOrder(@RequestBody Order order,@PathVariable String id)
	{
		orderService.deleteOrder(id,order);
	}
	
	
	
	
		
	
	
	
	
}
