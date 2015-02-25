package com.esiea.logger;

import java.util.Date;

public class FormatDefault extends Formatter {

	@Override
	public String format(String message) {
		
		Date date = new Date();
		StringBuilder builder = new StringBuilder();
		builder.append(date);
		builder.append(" [Name = " + logger.getLoggerName());
		builder.append(", Level = ");
		builder.append(level);
		builder.append(", Message = ");
		builder.append(message);
		builder.append("]");
		return builder.toString();
		
	}
	
}