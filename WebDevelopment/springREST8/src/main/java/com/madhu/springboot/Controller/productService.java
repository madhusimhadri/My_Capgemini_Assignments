package com.madhu.springboot.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productService

{
@Autowired
productRepository productRepository;

public List<Product>getAllProducts()
{
	List<Product> products=new ArrayList<>();
	productRepository.findAll().forEach(products::add);
	return products;
}

public Product getProduct(String id) {
	return productRepository.findOne(id);
}

public void addProduct(Product product) {
	
	productRepository.save(product);
}

public void updateProduct(String id, Product product) {
	
	productRepository.save(product);
}

public void deleteProduct(String id, Product product) {
	
	productRepository.delete(id);
	
}


}
