package log.sortie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fichierdao {

	public fichierdao(String nomFic, String texte) {

		//on va chercher le chemin et le nom du fichier et on me tout ca dans un String
		String adressedufichier = System.getProperty("user.dir") + "/"+ nomFic;
	
		try
		{

			FileWriter fw = new FileWriter(adressedufichier, true);
	
			BufferedWriter output = new BufferedWriter(fw);
			output.write(texte);
			output.flush();
			//ensuite flush envoie dans le fichier, ne pas oublier cette methode pour le BufferedWriter
			
	
			output.close();
			System.out.println("fichier créé");
		}
		catch(IOException ioe){
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
		}
}
