package com.esiea.test;

import com.esiea.logger.Logger;


public class Main {

	public static void main(String[] args) {
		
		Logger logger = new Logger(Main.class.getName());
		  
		logger.debug("Test log ESIEA");
		//logger.info("Test log ESIEA");
		//logger.error("Test log ESIEA");
		
		System.out.println();

	}
		  
}