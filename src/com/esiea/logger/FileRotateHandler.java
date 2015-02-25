import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRotateHandler extends Handler {

	private int maxTaille = 100;
	private File f;
	private File ff;
	private String newFile;
	private String path;
	
	public FileRotateHandler(String path) {
		
		this.newFile = path;
		
		try
		{
			this.f = new File(path);
			this.path=path;
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
			ff=f;
			int l = path.length() - f.getName().length();
			System.out.println(l);
			while(ff.length() > maxTaille) {
				newFile = path.substring(l, l+f.getName().length()-4) +"_"+nbr+".txt";
				ff = new File(newFile);
				nbr++;
			}

			FileWriter fw=new FileWriter(ff, true);
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