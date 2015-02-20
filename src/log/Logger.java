package log;

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
