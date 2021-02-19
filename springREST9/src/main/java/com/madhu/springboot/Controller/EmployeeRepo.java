//same as Employee that I did in Question 5 
package com.madhu.springboot.Controller;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{

	
	
}
