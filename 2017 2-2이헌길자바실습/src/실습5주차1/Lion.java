package 실습5주차1;

public class Lion extends Animal
{
	public static int count;
	
	public Lion()
	{
		Name = "Lion";
		count++;
	}
	
	public static int getLion_count()
	{
		return count;
	}
}
