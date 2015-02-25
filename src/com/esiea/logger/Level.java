package com.esiea.logger;

public enum Level {
	
	DEBUG(1),
	INFO(2),
	ERROR(3);

	private int level;
	
	Level(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

}