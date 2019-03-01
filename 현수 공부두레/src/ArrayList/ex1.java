package ArrayList;

import java.util.*;

public class ex1 {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
			int n = input.nextInt();
			
			if (arr.size() == 0)
				arr.add(n);
			
			else {
				boolean flag=false;
				for(int j=0; j < arr.size(); j++) 
				{
					if (n<arr.get(j))
					{
						arr.add(j,n);
						flag=true;
						break;
					}
				}
				if(!flag)
					arr.add(n);
			}
		}
		
		for(int i=0; i<arr.size(); i++)
		{
			System.out.print(arr.get(i) + " ");
		}
	}
}