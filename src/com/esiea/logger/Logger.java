package com.esiea.logger;

import java.util.ArrayList;

public class Logger {

	private Class<?> clazz;
	private Level level;
	private ArrayList<Handler> handlers;
	private Formatter formatter;

	public Logger(Class<?> clazz) {
		
		this.clazz = clazz;
		this.level = Level.DEBUG;
		this.formatter = new FormatDefault();
		
		formatter.setLogger(this);
		formatter.setLevel(level);
		setformatter(formatter);
		
	}
	
	public Class<?> getLogger() {
		return clazz;
	}
	
	public String getLoggerName() {
		return clazz.getName();
	}
	
	public Level getLevel() {
		return level;
	}
	
	protected void setLevel(Level level){
		this.level = level;
		formatter.setLevel(level);
	}
	
	protected void setformatter(Formatter formatter){
		this.formatter = formatter;
	}
	
	public void addHandler(Handler handler) {
		
		//add manager to check if same handlers added
		 
		 if(handlers == null)
			 handlers = new ArrayList<Handler>();

		 handlers.add(handler);
		 
	}
	
	public void debug(String message) {
		
		if(level.getLevel() <= 1) {
			
			if(handlers == null)
				addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
		
		}
		
	}
		
	public void info(String message) {
		
		if(level.getLevel() <= 2) {
			
			if(handlers == null)
				addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
		
		}
		
	}
		
	public void error(String message) {
		
		if(level.getLevel() <= 3) {
			
			if(handlers == null)
				 addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
			
		}
		
	}

}