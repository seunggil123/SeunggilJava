package ½Ç½À13;

public class Analyzer {
	
	int[] numbers;
	
	public Analyzer(int[] a)
	{
		numbers =a;
	}
	
	public int Max()
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i < numbers.length; i++)
		{
			if(numbers[i] > max)
			max = numbers[i];
		}
		
		return max;
		
	}
	
	public int Min()
	{
		int min = Integer.MAX_VALUE;
		for(int i=0; i< numbers.length; i++)
		{
			if(numbers[i] < min)
				min=numbers[i];
		}
		return min;
	}
	
	public double Average()
	{
		double average;
		double sum = 0;
		for(int i=0; i<numbers.length; i++)
		{
			sum=sum+numbers[i];
		}
		average= sum/numbers.length;
		return average;
	}
	
}
