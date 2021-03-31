//same as Employee that I did in Question 5 
package com.madhu.springboot.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController 

{

	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Employee> getAllOrders()
	{
		return empService.getAllEmployees();
	}
	
	@RequestMapping("/getEmp/{id}")
	public Employee getEmployee(@PathVariable Long id)
	{
		return empService.getEmployee(id);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addOrder(@RequestBody Employee emp)
	{
		empService.addEmployee(emp);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/update/{id}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable Long id)
	{
		empService.updateEmployee(id,emp);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void deleteEmployee(@RequestBody Employee emp,@PathVariable Long id)
	{
		empService.deleteEmployee(id,emp);
	}
	
}
