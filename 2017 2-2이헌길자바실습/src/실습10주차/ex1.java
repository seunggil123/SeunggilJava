package 실습10주차;
import java.io.*;
public class ex1 {

	public static void main(String[] args) throws IOException {

		File file = new File("practice1.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		File file2 = new File("output1.txt");
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);

		int ch = br.read();
		String s = br.readLine();

		String[] str = new String[17];
		String temp;

		while((s= br.readLine())!= null)
		{
			for(int i=0; i<str.length; i++)
			{
				str[i] = br.readLine();
			}
		}

		for(int i=0; i<str.length-1; i++)
		{	
			for(int j=0; j<str.length-1; j++)
			{
				if(str[j].length() > str[j+1].length())
				{
					temp = str[j];
					str[j] = str[j+1];
					str[j+1] = temp;
				}

			}
		}
		

		for(int i=0; i<str.length; i++)
		{	
			fw.write(str[i]+"\n");
			
			System.out.println(str[i]);
		}
		
		br.close();
		bw.close();
		
	}
}


