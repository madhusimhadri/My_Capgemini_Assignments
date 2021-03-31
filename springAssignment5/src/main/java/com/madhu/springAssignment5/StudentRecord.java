package com.madhu.springAssignment5;

import javax.annotation.Resource;

//import javax.inject.Inject;


public class StudentRecord 
{
//@Inject
	Student student;

	public Student getStudent() {
		return student;
	}
	@Resource
	//@Resource(name="Student")--follows byname
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student Information");
		System.out.println("Student No:" +student.getStudentNo());
		System.out.println("Student Name:" +student.getStudentName());
		
	}
}
