package com.madhu.springAssignment4;

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
      ApplicationContext context= new ClassPathXmlApplicationContext("spring3.xml");
    StudentController controller =( StudentController) context.getBean("studentcontroller") ;
    System.out.println(controller.createNewStudent());
      
 //     Teacher teacher= (Teacher)context.getBean(Teacher.class);
   //   System.out.println(teacher.createNewStudent());
      
    }
    
}
