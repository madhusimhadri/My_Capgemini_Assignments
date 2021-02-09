package com.madhu.springAssignment9;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings( "resource" )
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("spring9.xml");
        Lifecycle lc=(Lifecycle)context.getBean("lifecycle");
        lc.getMessage();
        context.registerShutdownHook();
    }
}
