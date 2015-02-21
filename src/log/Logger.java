package log;

public class Logger {

	private String Info;
	private String console = "";
	private Formateur formateur;
	
	public Logger() {
		formateur = new Formateur();
	}
	
/*	public void addHandler(FileHandler handler) {
		
	}
*/
	public void debug(String Message) {
		Info="DEBUG";
		console = formateur.formateurDefault(Info, Message);
		if (console != "") {
			System.out.println(console);
		} else System.out.println("Error");
	}
	
	public void info(String Message) {
		Info="INFO";
		console = formateur.formateurDefault(Info, Message);
		if (console != "") {
			System.out.println(console);
		} else System.out.println("Error");
	}
	
	public void error(String Message) {
		Info="ERROR";
		console = formateur.formateurDefault(Info, Message);
		if (console != "") {
			System.out.println(console);
		} else System.out.println("Error");
	}

}

