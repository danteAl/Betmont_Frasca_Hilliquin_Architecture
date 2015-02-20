package log;
import log.impl.*;

import log.impl.Implementation;

public class Main {

	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.geLogger();
		logger.debug("Test log ESIEA");
		logger.info("Test log ESIEA");
		logger.error("Test log ESIEA");
		
	}
	
	public void setup() {
		
		Implementation classe = new Implementation();
		Impl implementation = new ClasseImplementation();
		classe.setType(implementation);
		
	}
	
}