package 실습5주차1;

public class Fox extends Animal{

	public static int count;
	
	public Fox()
	{
		Name="여우";
		count++;
	}
	
	public static int getFox_count()
	{
		return count;
	}
}
