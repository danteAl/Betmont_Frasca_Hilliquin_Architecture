package log;

<<<<<<< HEAD
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

=======
import java.util.Date;

public class Logger {

	private String Message;
	private String Info;
	private Date date;
	
	public Logger() {
	}
	
	
	public void info(String Message) {
		Date maDate = new Date(); 
		date = maDate;
		this.Message=Message;
		Info="INFO";
		System.out.println(this);
	}
	
	public void error(String Message) {
		Date maDate = new Date();
		date = maDate;
		this.Message=Message;
		Info="ERROR";
		System.out.println(this);
	}
	
	public void debug(String Message) {
		Date maDate = new Date();
		date = maDate;
		this.Message=Message;
		Info="DEBUG";
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(date);
		builder.append(" [Name=FR.ESIEA.TP");
		builder.append(", Level=");
		builder.append(Info);
		builder.append(" Message=");
		builder.append(Message);
		builder.append("]");
		return builder.toString();
	}
	
}
>>>>>>> 6db35dd72c7420557007a6b92f1f81af499bb46c
