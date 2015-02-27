package com.esiea.logger;

import java.util.ArrayList;

public class Logger {

	private Class<?> clazz;
	private Level level;
	private ArrayList<Handler> handlers;
	private Formatter formatter;

	protected Logger(Class<?> clazz) {
		
		this.clazz = clazz;
		this.level = Level.DEBUG;
		this.formatter = new FormatDefault();
		
		formatter.setLogger(this);
		setformatter(formatter);
		
	}
	
	protected Class<?> getLogger() {
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
	}
	
	protected void setformatter(Formatter formatter){
		this.formatter = formatter;
	}
	
	protected void addHandler(Handler handler) {
		
		 if(handlers == null)
			 handlers = new ArrayList<Handler>();
		 
		 for(Handler h : handlers)
			 if(h.equals(handler)) {
				 System.out.println("Le nom de cette cible existe déja !!");
				 return;
			 }
		 
		 handlers.add(handler);
		 
	}
	
	protected void removeHandler(Handler handler) {
		
		 for(Handler h : handlers)
			 if(h.equals(handler)) {
				 handlers.remove(h);
				 break;
			 }
		 
	}
	
	public void all(String message) {
		
		formatter.setLevel(Level.ALL);
		
		if(level.getLevel() <= 0) {
			
			if(handlers == null)
				addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
		
		}
		
	}

	public void debug(String message) {
		
		formatter.setLevel(Level.DEBUG);
		
		if(level.getLevel() <= 1) {
			
			if(handlers == null)
				addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
		
		}
		
	}
		
	public void info(String message) {
		
		formatter.setLevel(Level.INFO);
		
		if(level.getLevel() <= 2) {
			
			if(handlers == null)
				addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
		
		}
		
	}
	
	public void warn(String message) {
		
		formatter.setLevel(Level.WARN);
		
		if(level.getLevel() <= 3) {
			
			if(handlers == null)
				 addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
			
		}
		
	}
		
	public void error(String message) {
		
		formatter.setLevel(Level.ERROR);
		
		if(level.getLevel() <= 4) {
			
			if(handlers == null)
				 addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
			
		}
		
	}

	public void fatal(String message) {
		
		formatter.setLevel(Level.FATAL);
		
		if(level.getLevel() <= 5) {
			
			if(handlers == null)
				 addHandler(new ConsoleHandler());
			
			for(Handler handler : handlers)
				handler.message(formatter.format(message));
			
		}
		
	}

}