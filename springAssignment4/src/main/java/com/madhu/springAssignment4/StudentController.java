package com.madhu.springAssignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@ComponentScan
@Controller("studentcontroller")
public class StudentController
{
	@Autowired
 Teacher teacher;
 
 public StudentA createNewStudent()
 {
	 return teacher.createNewStudent();
 }
}
