package com.esiea.logger;

public class ConsoleHandler extends Handler {

	public ConsoleHandler() {
	}
	
	@Override
	public void message(String message) {
		System.out.println(message);
	}

}
