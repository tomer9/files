package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class Loader {
	//This class has methods for loading a file into an arraylist
	
	private String file;
	private BufferedReader in;
	
	//testing variables
	//String array to test loading file into string
	//String [] string = new String[3];
	//Item array to test loading lines into object array
	//Item [] items = new Item[3];
	//ArrayList of Items
	ArrayList<Item> items = new ArrayList<>();
			
	//Constructor
	public Loader(String file) {
		super();
		this.file = file;
	}

	public void run()
	{
	//test method for this class	
		in = getReader(file);
		//test code to read strings (single string per line)
		/*
		for (int i=0; i<3; i++)
		{
			string[i] = readStrings(in);
			System.out.println(string[i]);
		}
		*/	
		//test code to read items to items []  array
		/*
		for (int i=0; i<3; i++)
		{
			items[i] = readLine(in);
			System.out.println(items[i].food + "\t" + items[i].category);

		}
		*/
		//Test code to read Item into an arraylist
		for (int i=0; i<3; i++)
		{
			items.add(readItem(in));
			
		}
		//Iterator e = items.iterator();
		//while (e.hasNext())
		for(int i=0; i < items.size(); i++)
		{
			System.out.println(items.get(i).food + "\t" + items.get(i).category);
			
		}
		
	}
	
	public Item readItem(BufferedReader in)
	{
		String line = "";
		String[] splitLine = new String[2];
		String f;
		String c;
		//Item x = new Item();
		try
		{
			line = in.readLine();
		}
		catch(IOException e)
		{
			System.out.println("I/O Error 2");

		}
		
		//if(line == null) {
		//	return null;
		//}
		//else {
			splitLine = line.split("\t");
			f = splitLine[0];
			c = splitLine[1];
			//x.food = f;
			//x.category = c;
			return new Item(f, c);
		//}
	}
		
	public Item readLine(BufferedReader in)
	{
		String line = "";
		String[] splitLine = new String[2];
		String f;
		String c;
		//Item x = new Item();
		try
		{
			line = in.readLine();
		}
		catch(IOException e)
		{
			System.out.println("I/O Error 2");

		}
		
		//if(line == null) {
		//	return null;
		//}
		//else {
			splitLine = line.split("\t");
			f = splitLine[0];
			c = splitLine[1];
			//x.food = f;
			//x.category = c;
			return new Item(f, c);
		//}
	}
	
	
	
	
	private String readStrings(BufferedReader in)
	{
		String s = null;
		try
		{
			s = in.readLine();
			
		}
		catch(IOException e)
		{
			System.out.println("I/O Error 2");

		}
		return s;
	}
	
	private BufferedReader getReader(String name)
	//returns a bufferedreader
	{

		File file = new File(name);
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
		}
		catch(IOException e) {
			System.out.println("I/O Error 1");
		}
		BufferedReader in = new BufferedReader(fr);
		return in;
	}
	
	//Sub-Class
	/////////////////////////////////////////////////////////////////////
	/*
	private static class Item
	{
		String food;
		String category;
		public Item(String f, String c) {
			super();
			this.food = f;
			this.category = c;
		}
	
	}
	*/
	
	
	
	
	
}
