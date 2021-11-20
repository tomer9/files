package files;
import java.io.*;

//import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;

public class filestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create file object
		File f = new File("food.txt");	
		//see if file exists
		if (f.exists()) {
			System.out.print("file does exist");
		}
		
		//create a buffered reader
		BufferedReader in = null;
		String line;
		
		try {
		in = new BufferedReader(new FileReader(f));
		System.out.println("bufferedreader is created");
		
		}
		catch (IOException e) {
			System.out.print("file error");
		}
		
		try {
			line = in.readLine();
			while (line != null) {
				System.out.println(line);
				line = in.readLine();
			}
		}
		catch (IOException e) {
			System.out.print("file error");
		}
		

		
		/*
		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
*/

		
		
		
		
		
		
		
		/*
		try
		{
			f.createNewFile();
			System.out.print("file created");
		}
		catch (IOException e)
		{
			System.out.print("file could not be created");
		}
		*/
	}

}
