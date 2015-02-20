package log.impl;

public class Implementation {

	private Impl type;	
	
	public void setType(Impl implementation) 
	{
		this.type = implementation;
	}
	
	public void message() {
		this.type.sortie();
	}
	
}
