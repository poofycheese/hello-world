package org.cheesypoof.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger log=  LogManager.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	log.debug("==Latest Log4j 2 Start==");
    	System.out.println( "Hey Yall!" );
    	log.debug("==End==");
    }
}
