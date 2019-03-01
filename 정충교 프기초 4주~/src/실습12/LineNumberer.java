package ½Ç½À12;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LineNumberer {

	public static void main(String[] args) throws IOException
	{
	
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input file: ");
		String inputFileName = console.next();
		
		System.out.print("Output file: ");
		String outputFileName = console.next();
		
		File inputFile = new File(inputFileName);
		
		Scanner in = null;
		PrintWriter out = null;
		
		in = new Scanner(inputFile);
		out = new PrintWriter(outputFileName);
		
		int lineNumber =0;
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			out.println("/* " + ++lineNumber + " */ "+ line);
		}
		
		
		
		console.close();
		in.close();
		out.close();
		
	}

}
