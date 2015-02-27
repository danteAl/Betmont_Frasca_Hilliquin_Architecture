package com.esiea.test;

import com.esiea.logger.*;

public class Main {
	
	// si aucune configuration faite avant :
	// - level : DEBUG
	// - cible : Console
	// - format : Format par d�faut
	static Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		logger.debug("Test log Debug ESIEA");
		logger.info("Test log Info ESIEA");
		logger.error("Test log Error ESIEA");
		
	/**************************************************************************************************/
		
		// Configure un formateur � la classe pour personnaliser le contenu du message
		Configuration.setLayout(Main.class, new MyCustomFormatter());
		
		// Configure la priorit� du logger avec le level
		Configuration.setLevel(Main.class, Level.INFO);
		
		// Ajoute une cible � la classe pour envoyer le message
		Configuration.addHandler(Main.class, new FileHandler("./simpleTest.txt"));
		FileHandler fileTest = new FileHandler();
		Configuration.addHandler(Main.class, fileTest);
		Configuration.addHandler(Main.class, new FileRotateHandler("./simpleRotate.txt"));
		Configuration.addHandler(Main.class, new FileRotateHandler("./logRotate.txt", 600));
		
		logger.debug("Test Configuration log Debug ESIEA");
		logger.info("Test Configuration log Info ESIEA");
		logger.error("Test Configuration log Error ESIEA");
		
		//Supprime la cible fileTest pour arr�ter d'�crire dans le fichier par d�faut "loggers.txt"
		Configuration.removeHandler(Main.class, fileTest);
		
	/**************************************************************************************************/
		
		// Configuration en fichier properties
		Configuration.getProperties("./src/com/esiea/test/config.properties");
		
		logger.debug("Test Properties log Debug ESIEA");
		logger.info("Test Properties log Info ESIEA");
		logger.error("Test Properties log Error ESIEA");
		
	}

}