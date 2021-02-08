package com.madhu.springAssignment8;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(Configuration.class);
        context.refresh();
        
        Lifecycle2 l1=context.getBean(Lifecycle2.class);
        System.out.println(l1.hashCode());
        
        Lifecycle2 l2=context.getBean(Lifecycle2.class);
        System.out.println(l2.hashCode());
        context.close();
    }
}
