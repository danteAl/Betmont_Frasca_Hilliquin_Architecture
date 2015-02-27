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

	protected int getLevel() {
		return level;
	}
	
	public static Level getLevel(String name) {
		
		for (Level level : Level.values())
			if (name.equals(level.name()))
				return level;

	    return null;
	
	}

}