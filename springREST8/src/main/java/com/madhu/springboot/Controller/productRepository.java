package com.madhu.springboot.Controller;

//import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productRepository extends MongoRepository<Product,String>
{
//	List<Order>findByTitle(String title);
	//List<Order>findByPlaced(boolean placed);
}
