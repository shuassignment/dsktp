package com.cg.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.app.model.Customer;
import com.cg.app.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("context.xml");
        CustomerService customerService=context.getBean("customerService",CustomerService.class);
        System.out.println(customerService.findAll().get(0));
    }
}
