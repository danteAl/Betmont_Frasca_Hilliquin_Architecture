package log;

public class Main {

	public static void main(String[] args) {
				
//		FileHandler handler = new FileHandler(FileName); //Ou envoyer l'info
		Logger logger = LoggerFactory.getLogger(); // ajouter Maclasse.class en param�tre
//		handler.addHandler(handler);
		
		logger.debug("Test log ESIEA");
		logger.info("Test log ESIEA");
		logger.error("Test log ESIEA");
	}
	
}