package com.madhu.springAssignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacher")
public class TeacherImplementation implements Teacher
{
	@Autowired
	Student a;
	public StudentA createNewStudent()
	{
		return a.createNewStudent();
	}
	
}
