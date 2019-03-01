package week13;

import java.io.*;
import java.util.*;

public class ex3 {

	public static void main(String[] args) throws IOException {

		File file1 = new File("wordlist.txt");
		FileReader fr = new FileReader(file1);
		BufferedReader br = new BufferedReader(fr);

		ArrayList<String> aList = new ArrayList<String>();

		int length;
		String s;

		while ((s = br.readLine()) != null) {
			if (aList.size() == 0) {
				aList.add(s);
			}

			else {
				boolean flag = false;
				for (int i = 0; i < aList.size(); i++) {
					if (s.length() > aList.get(i).length())
						length = aList.get(i).length();
					else
						length = s.length();

					for (int j = 0; j < length; j++) {
						if (s.charAt(j) < aList.get(i).charAt(j)) {
							aList.add(i, s);
							flag = true;
							break;
						} else if (s.charAt(j) > aList.get(i).charAt(j))
							break;
					}
					if (flag)
						break;
				}
				if (!flag) {
					aList.add(s);
				}
			}
			for(int i=0; i<aList.size(); i++)
			{
				System.out.print(aList.get(i)+" ");
			}
			System.out.println();
			
		}
		br.close();
	}

}
