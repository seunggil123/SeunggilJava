package 실습5주차1;

public class Tiger extends Animal {

	public static int count;
	
	public Tiger()
	{
		Name = "Tiger";
		count++;
	}
	
	public static int getTiger_count()
	{
		return count;
	}
	
}
