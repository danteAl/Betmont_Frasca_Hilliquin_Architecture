package com.esiea.test;

import com.esiea.logger.Formatter;

public class MyCustomFormatter extends Formatter {
	 
	@Override
	public String format(String message) {

		StringBuffer sb = new StringBuffer();
		sb.append("Message du fichier :\n");
		sb.append(message + "\n");
		
		return sb.toString();

	}
	
}
