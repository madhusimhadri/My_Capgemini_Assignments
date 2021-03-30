package com.madhu.springREST7.API.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService

{
@Autowired
 orderRepository orderRepository;

public List<Order>getAllOrders()
{
	List<Order> orders=new ArrayList<>();
	orderRepository.findAll().forEach(orders::add);
	return orders;
}

public Order getOrder(String id) {
	return orderRepository.findOne(id);
}

public void addOrder(Order order) {
	
	 orderRepository.save(order);
}

public void updateOrder(String id, Order order) {
	
	orderRepository.save(order);
}

public void deleteOrder(String id, Order order) {
	
	orderRepository.delete(id);
	
}


}
