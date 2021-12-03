package files;
import java.io.*;
import java.util.*;

//import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;

public class filestest {

	static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Testing code
		// to test string loader (one string per line only)
		//Loader loader = new Loader("strings.txt");
		// to test item loader
		Loader loader = new Loader("food.txt");
		loader.run();
		
	}	
		/*
		BufferedReader br = getReader("food.txt");
		Item item1 = readFile(br);
		Item item2 = readFile(br);

		ArrayList<Item> allItems = new ArrayList<>();
		allItems.add(item1);
		allItems.add(item2);
				
		System.out.println("First line of file, read into an Item object and printed:   " 
							+ item1.food + "\t" + item1.cat);
		System.out.println("First line of file, read into an Item object and printed:   " 
				+ item2.food + "\t" + item2.cat);	
		
		System.out.println("\nRetrieved items1 from ArrayList allItems:   ");
		
		for (Item i : allItems)
		{
			int n = allItems.indexOf(i);
			System.out.println(allItems.get(n).food + "\t" + allItems.get(n).cat);

		}
		
		
	}	
		*/
		
	
		
	
	
	
	
	
	
	
		
// Practice Code		
//////////////////////////////////////////////////////////////////////////////////////////////////////		
		/*
		BufferedReader in = getReader("food.txt");
		
		int x = 0;	//scanner input
			
		while (x!=3) {
		printMainMenu();
		switch(x){
			case 1:
				//edit();
				break; 
			default:
				break;
		}
		
		x = sc.nextInt();
		
		}
		
		*/
		
		// Practice file read/write  
		/*
		File f = new File("food.txt");
		FileReader fr = null;
		//BufferedReader in = null;
		try {
			fr = new FileReader(f); 
		}
		catch(IOException e) {
 		}
		
		BufferedReader in = new BufferedReader(fr);
		String line;
		
		try {
		line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
			}
		in.close();
		}
		catch(IOException e) {
			System.out.println("I/O error 2");

		}
		
		//Writing to a file...
		File f2 = new File("food.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(f2, true);
		}
		catch(IOException e){
			System.out.println("I/O error 3");
		}
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		
		String newLine; 
		newLine = "Pizza";
		newLine += "\t\t\t" + "Meal";
		out.print("\n" + newLine);
		out.close();
		*/
				
//} old end main

	/*
	private static void edit() {
		
		int x = 0;	//scanner input
		
		while (x!=3) {
		printItems();
		printEditMenu();
		switch(x){
			case 1:
				//edit();
				break; 
			default:
				break;
		}
		
		x = sc.nextInt();
		
		}
		
	private static void printMainMenu() {
		System.out.println("Grocery List Generator");
		System.out.println("----------------------");
		System.out.println("1.) Edit");
		System.out.println("2.) ...");
		System.out.println("3.) Exit");
		System.out.println("Select an option:");
	}
	
	private static void printEditMenu() {
		System.out.println("Grocery List Generator");
		System.out.println("----------------------");
		System.out.println("1.) Edit");
		System.out.println("2.) ...");
		System.out.println("3.) Exit");
		System.out.println("Select an option:");
	}	
	
	*/
	
	}
