package ½Ç½À12;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DeNumberer {

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
		
		int a;
		int lineNumber =0;
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			a=line.indexOf("*/");
			out.println(line.substring(a+2,line.length()));
			
		}
		
		
		console.close();
		in.close();
		out.close();
		
	}

}
