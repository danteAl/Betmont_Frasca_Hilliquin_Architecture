package com.esiea.logger;

public class Configuration {
	
	public static void addHandler(Class<?> clazz, Handler handler){
		LoggerFactory.getLogger(clazz).addHandler(handler);
	}
	
	public static void setLevel(Class<?> clazz, Level level){
		LoggerFactory.getLogger(clazz).setLevel(level);
	}
	
	public static void setLayout(Class<?> clazz, Formatter formatter){
		
		formatter.setLogger(LoggerFactory.getLogger(clazz));
		LoggerFactory.getLogger(clazz).setformatter(formatter);

	}
	
	//properties files

}