package com.esiea.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRotateHandler extends Handler {

	private int maxTaille = 1024*1204*10;
	private File f;
	private String newFile;
	private String path;
	
	public FileRotateHandler(String path, int maxTaille) {
		
		this.maxTaille = maxTaille;
		new FileRotateHandler(path);

	}
	
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
		
		try {

			if(f.length() < maxTaille) { 	
				
				FileWriter fw=new FileWriter(f, true);
				BufferedWriter output = new BufferedWriter(fw);
				
				output.write("\n"+ message);
				output.flush();
				output.close();
				
			} else {
				newFile = path + "x";
				f = new File(newFile);
			}
		
		} catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
			
	}

}