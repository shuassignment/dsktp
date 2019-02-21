package com.capgemini.app;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger=Logger.getLogger(App.class.getName()); 
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	BasicConfigurator.configure();
    	logger.info("In Maven");
    	Class.forName("com.mysql.jdbc.Driver");
        System.out.println( "Hello World!" );
    }
}
