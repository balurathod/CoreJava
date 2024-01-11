package com.rathod.log4j;

import org.apache.log4j.Logger;

public class Log4jDemo {
	static Logger log = Logger.getLogger("com.rathod.Log4j.Log4jDemo.class");

	public static void main(String args[]) {
		System.out.println("Logger started");
		log.debug("This is my debug message.");
		log.info(" This is my info message.");
		log.warn(" This is my warn message.");
		log.error("This is my error message.");
		log.fatal("This is my fatal message.");
		System.out.println("Logger end");
	}
}