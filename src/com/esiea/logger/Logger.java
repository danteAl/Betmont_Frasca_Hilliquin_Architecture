package com.esiea.logger;

import java.util.ArrayList;

public class Logger {
		
	private String Info;
	private String console = "";
	private Formateur formateur;
	private String name;
	private ArrayList<Handler> handlers;
	static private LoggerFactory loggerFactory;

	public Logger() {
		
	}
	
	public Logger(String name) {
		formateur = new Formateur();
		this.name = name;
	}
	
	 public void addHandler(Handler handler) {
		 
		 if (handlers == null)
			 handlers = new ArrayList<Handler>();

		 handlers.add(handler);
		 
	}
	
	public void debug(String message) {
		
		formateur = new Formateur();
		
		Info="DEBUG";
		console = formateur.formateurDefault(Info, message);
		
		if (console != "")
			System.out.println(console);
		else
			System.out.println("Error");
		
	}
		
	public void info(String message) {
		
		formateur = new Formateur();
		message = name;
		Info="INFO";
		console = formateur.formateurDefault(Info, message);
		
		if (console != "")
			System.out.println(console);
		else 
			System.out.println("Error");
		
	}
		
	public void error(String message) {
		
		formateur = new Formateur();
		
		Info="ERROR";
		console = formateur.formateurDefault(Info, message);
		
		if (console != "")
			System.out.println(console);
		else
			System.out.println("Error");
		
	}

	public static Logger getLogger(String name) {
		return loggerFactory.getLogger(name);
	}
	
	public static Logger getLogger(Class<?> clazz) {
		return getLogger(clazz.getName());
	}

}