package org.example;

import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
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
        System.out.println( "Hello World!" );
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//       Student student = context.getBean("Student", Student.class);
//       System.out.println(student.toString());
       context.registerShutdownHook();

    }

}
