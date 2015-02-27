package com.esiea.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler extends Handler {

	private File f;
	
	public FileHandler() {
		
		try {
			
			this.f = new File("./loggers.txt");
			f.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public FileHandler(String path) {
		
		try {
			
			this.f = new File(path);
			f.createNewFile();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void message(String message) {
		
		try {
			
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter output = new BufferedWriter(fw);
			
			output.write(message + "\n");
			output.flush();
			output.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}