package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fichierdao {
	
	public fichierdao(String lienFic, String texte) {
		
		try
		{
			File f = new File(lienFic); // d�finir l'arborescence
			f.createNewFile();
			FileWriter fw=new FileWriter(f, true);
			BufferedWriter output = new BufferedWriter(fw);
			output.write("\n"+texte);
			output.flush();
			//ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter	
			output.close();
			System.out.println("fichier cr��/compl�t�");
		}
		catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
	}
}
