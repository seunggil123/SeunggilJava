package 실습10주차;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex2 {

	public static void main(String[] args) throws IOException {

		File file = new File("aaa.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		File file2 = new File("output2.txt");
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bw = new BufferedWriter(fw);	

		String s;
		String [] str = new String[100];

		int[] Al = new int[26];
		int num=0;

		while((s= br.readLine())!= null)
		{
			s=s.toLowerCase();
			str[num] = s;
			num++;
		}


		//		for(int i=0; i<str.length; i++)
		//			{
		//				str[i] = br.readLine();
		//				str[i] = str[i].toLowerCase();
		//			}

		for(int k=0; k<26; k++)
		{
			//			for(int i=0; i<str.length; i++)
			for(int i=0; i<num; i++)
			{	
				String q = str[i];
				//				char[] a = new char[str[i].length()];

				for(int j=0; j<q.length(); j++)
				{	
					if(q.charAt(j)=='a'+k)
						Al[k]++;
					//					a[j] = str[i].charAt(j);
					//					if(a[j]=='a'+k)
					//						Al[k]++;
				}

			}
		}
		for(int i=0; i<26; i++)
		{
			char n = (char)('a'+i);
			fw.write(n+ "->" + Al[i] +"\n");
			System.out.println(n+ "->" + Al[i]);


		}

		bw.close();
		br.close();

	}

}
