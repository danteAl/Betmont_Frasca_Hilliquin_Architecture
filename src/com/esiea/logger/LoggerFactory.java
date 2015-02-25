package com.esiea.logger;

import java.util.ArrayList;

public class LoggerFactory {
		
	private static ArrayList<Logger> loggers = new ArrayList<Logger>();
		
	public static Logger getLogger(Class<?> clazz) {
		
		if(!loggers.isEmpty())
			for(Logger logger : loggers)
				if(logger.getLogger().equals(clazz))
					return logger;
		
		Logger logger = new Logger(clazz);
		loggers.add(logger);
		
		return logger;
		
	}

	public static ArrayList<Logger> getLoggers() {
		return loggers;
	}
	
}