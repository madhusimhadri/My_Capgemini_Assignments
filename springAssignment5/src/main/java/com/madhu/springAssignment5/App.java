package com.madhu.springAssignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
       @SuppressWarnings("resource")
	ApplicationContext context= new ClassPathXmlApplicationContext("spring5.xml");
       StudentRecord record=(StudentRecord) context.getBean("record");
       record.displayStudentInfo();
    }
}
