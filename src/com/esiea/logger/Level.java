package com.esiea.logger;

public enum Level {
	
	ALL(0),
	DEBUG(1),
	INFO(2),
	WARN(3),
	ERROR(4),
	FATAL(5); 
	
	private int level;
	
	Level(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}