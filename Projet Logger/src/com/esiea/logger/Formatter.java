package com.esiea.logger;

public abstract class Formatter {
	
	protected Logger logger;
	protected Level level;
	
	protected Formatter() {
	}
	
	protected void setLevel(Level level){
		this.level = level;
	}

	protected void setLogger(Logger logger){
		this.logger = logger;
	}

	public abstract String format(String message);

}