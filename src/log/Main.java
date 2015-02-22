package log;
<<<<<<< HEAD
=======
import log.impl.*;

import log.impl.Implementation;
>>>>>>> 6db35dd72c7420557007a6b92f1f81af499bb46c

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
				
//		FileHandler handler = new FileHandler(FileName); //Ou envoyer l'info
		Logger logger = LoggerFactory.getLogger(); // ajouter Maclasse.class en paramètre
//		handler.addHandler(handler);
		
		logger.debug("Test log ESIEA");
		logger.info("Test log ESIEA");
		logger.error("Test log ESIEA");
=======
		
		Logger logger = LoggerFactory.geLogger();
		logger.debug("Test log ESIEA");
		logger.info("Test log ESIEA");
		logger.error("Test log ESIEA");
		
	}
	
	public void setup() {
		
		Implementation classe = new Implementation();
		Impl implementation = new ClasseImplementation();
		classe.setType(implementation);
		
>>>>>>> 6db35dd72c7420557007a6b92f1f81af499bb46c
	}
	
}