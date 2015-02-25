package com.esiea.logger;

public abstract class Formatter {
	
	protected Logger logger;
	protected Level level;
	
	public void setLevel(Level level){
		this.level = level;
	}

	public void setLogger(Logger logger){
		this.logger = logger;
	}
	
	public Level getLevel(){
		return level;
	}

	public abstract String format(String message);

}