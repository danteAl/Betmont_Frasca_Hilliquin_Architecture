package com.esiea.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

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
	
	public static void setProperties(String path) {

		Properties properties = new Properties();
		
		try {

			FileInputStream in = new FileInputStream(path);
			properties.load(in);
			in.close();

		} catch (IOException e) {
			System.out.println("Unable to load config file.");
		}
	
	}

}