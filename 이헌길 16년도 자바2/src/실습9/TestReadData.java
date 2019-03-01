package ½Ç½À9;

public class TestReadData {

	public static void main(String[] args) {
		
		System.out.println("Enter 4 integer: ");
		for(int i=0; i<4; i++)
		{
			int x = ReadData.readInt();
			System.out.println("---" + x);
		}
		
		System.out.println("\nEnter 4 floating point numbers");
		for(int i=0; i<4; i++)
		{
			double x = ReadData.readDouble();
			System.out.println("---" + x);
		}
		
	}

}
