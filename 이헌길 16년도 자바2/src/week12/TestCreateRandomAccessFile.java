package week12;
import java.util.*;
import java.io.*;
public class TestCreateRandomAccessFile {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		System.out.print("File name: ");
		String filename = input.next();
		
		CreateRandomAccessFile.makeRandomAccessFile(filename);
		
	}

}
