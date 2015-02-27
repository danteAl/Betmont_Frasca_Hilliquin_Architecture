package com.esiea.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDefault extends Formatter {

	@Override
	public String format(String message) {
		
		SimpleDateFormat formater = new SimpleDateFormat("'Le' dd/MM/yyyy 'à' hh:mm:ss ");
		Date date = new Date();
		
		StringBuilder builder = new StringBuilder();
		
		builder.append(formater.format(date));
		builder.append(" [NAME=" + logger.getLoggerName());
		builder.append(", LEVEL=");
		builder.append(level);
		builder.append(", MESSAGE= ");
		builder.append(message);
		builder.append("]");
		
		return builder.toString();
		
	}
	
}