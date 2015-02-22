package log;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fichierRot {

	private int maxTaille = 100;
	
	public String fichierRot(String lienFic, String texte) {
		
		File fichier;
		String nouveauFic = lienFic;
		
		try
		{
			File f = new File(lienFic); // définir l'arborescence
			f.createNewFile();
			
			if(f.length() < maxTaille) { 	
				
				FileWriter fw=new FileWriter(f, true);
				BufferedWriter output = new BufferedWriter(fw);
				output.write("\n"+texte);
				output.flush();
				//ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter	
				output.close();
				System.out.println("fichier créé/complété");
			} else
				System.out.println("Nouveau Fichier Crée !");
				nouveauFic = lienFic+"x";
				fichier = new File(nouveauFic);
		}
		catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
		return nouveauFic;
	}
}
