package com.esiea.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Properties;

public class Configuration {
	
	public static void addHandler(Class<?> clazz, Handler handler) {
		LoggerFactory.getLogger(clazz).addHandler(handler);
	}
	
	public static void removeHandler(Class<?> clazz, Handler handler) {
		LoggerFactory.getLogger(clazz).removeHandler(handler);
	}
	
	public static void setLevel(Class<?> clazz, Level level) {
		LoggerFactory.getLogger(clazz).setLevel(level);
	}
	
	public static void setLayout(Class<?> clazz, Formatter formatter) {
		
		formatter.setLogger(LoggerFactory.getLogger(clazz));
		LoggerFactory.getLogger(clazz).setformatter(formatter);

	}
	
	public static void getProperties(String path) {

		Properties property = new Properties();
		
		try {

			FileInputStream in = new FileInputStream(path);
			property.load(in);
			
			Iterator<Object> it = property.keySet().iterator();
			String key, cible = null;
			
            while(it.hasNext()) {
            	
            	key = (String)it.next();
            	
                if(key.startsWith("logger")) {
                
                	if(key.endsWith("formatter"))
						setLayout(Class.forName(key.substring(7,key.length()-10)), (Formatter) Class.forName((String)property.getProperty(key)).newInstance());

                	else if(key.endsWith("level"))
						setLevel(Class.forName(key.substring(7,key.length()-6)), Level.getLevel((String)property.getProperty(key)));
					
					else {
					
						cible = checkCible(key);
						
						if(cible != null) {
						
							String arguments[] = property.getProperty(key).split(",");
							
							switch(arguments.length) {
							
								case 1:
									addHandler(Class.forName(key.substring(7,key.length()-cible.length()-1)), (Handler)Class.forName(arguments[0]).newInstance());
									break;
									
								case 2:
									addHandler(Class.forName(key.substring(7,key.length()-cible.length()-1)), (Handler)Class.forName(arguments[0]).getConstructor(String.class).newInstance(arguments[1]));
									break;
								
								case 3:
									addHandler(Class.forName(key.substring(7,key.length()-cible.length()-1)), (Handler)Class.forName(arguments[0]).getConstructor(String.class,Integer.TYPE).newInstance(arguments[1],Integer.parseInt(arguments[2])));
									break;
							
							}
						
						}
				
					}
                
                }
					
            }
 
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	
	}
	
	public static String checkCible(String key) {
		
		for(int i = 0; i < 9999; i++)
			if(key.endsWith("cible"+i))
				return "cible"+i;
		
		return null;
		
	}

}