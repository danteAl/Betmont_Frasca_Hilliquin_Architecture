package com.esiea.test;

import com.esiea.logger.*;

public class Main {

	public static void main(String[] args) {
		
		/*Configuration.setLayout(Main.class, new MyCustomFormatter());
		Configuration.setLevel(Main.class, Level.ERROR);
		Configuration.setLayout(Main.class, new FormatDefault());
		Configuration.setLevel(Main.class, Level.DEBUG);*/
		
		Logger logger = LoggerFactory.getLogger(Main.class);
		
		//Configuration.addHandler(Main.class, new FileHandler("./log.txt"));
		
		logger.debug("Test log1 ESIEA");
		logger.info("Test log2 ESIEA");
		logger.error("Test log3 ESIEA");
		
		/*Configuration.addHandler(Main.class, new ConsoleHandler());
		Configuration.setLayout(Main.class, new MyCustomFormatter());
		Configuration.setLevel(Main.class, Level.ERROR);
		
		logger.debug("Test log1 ESIEA");
		logger.info("Test log2 ESIEA");
		logger.error("Test log3 ESIEA");*/
		
	}
	
	/*private static class MyCustomFormatter extends Formatter {
		 
		@Override
		public String format(String message) {

			StringBuffer sb = new StringBuffer();
			sb.append("Prefix\n");
			sb.append(message + "\n");
			sb.append("Suffix : " + logger.getLevel() + "\n");
			sb.append("\n");
			
			return sb.toString();

		}
		    
	}*/

}