package com.madhu.springREST7.API.controller;

//import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface orderRepository extends MongoRepository<Order,String>
{
//	List<Order>findByTitle(String title);
	//List<Order>findByPlaced(boolean placed);
}
