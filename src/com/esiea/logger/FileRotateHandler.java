package com.esiea.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRotateHandler extends Handler {

	private int maxTaille = 10;
	private File f;
	private String newFile;
	private String path;
	
	public FileRotateHandler(String path) {
		
		this.newFile = path;
		this.path = path;
		
		try
		{
			this.f = new File(path);
			f.createNewFile();

		} catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}

	}
	
	@Override
	public void message(String message) {
		
		int nbr = 0;
		
		try {
			while(f.length() > maxTaille) {
				newFile = f.getName().substring(f.getName().indexOf("_"), f.getName().indexOf(".")) +"_"+nbr+".txt";
				f = new File(newFile);
				nbr++;
			}

			FileWriter fw=new FileWriter(f, true);
			BufferedWriter output = new BufferedWriter(fw);
			output.write("\n"+ message);
			output.flush();
			output.close();
		
		} catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
			
	}

}