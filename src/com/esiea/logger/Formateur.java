package com.esiea.logger;

import java.util.Date;

public class Formateur {

	private Date date;
	
	protected Formateur() {
		
	}

	public String formateurDefault(String level, String message) {
		
		date = new Date();
		StringBuilder builder = new StringBuilder();
		builder.append(date);
		builder.append(" [Name=FR.ESIEA.TP");
		builder.append(", Level=");
		builder.append(level);
		builder.append(" Message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
		
	}
	
}