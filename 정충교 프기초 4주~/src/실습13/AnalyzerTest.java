package ½Ç½À13;

public class AnalyzerTest {

	public static void main(String[] args)
	{
		int [] n = { 1, 3, 9, 10};
		int [] n2 = { 2 ,4 , 6, 8};
		Analyzer analyzer = new Analyzer(n);
		Analyzer analyzer2 = new Analyzer(n2);

		int maximum = analyzer.Max();
		System.out.println(maximum);
		
		int minimum = analyzer.Min();
		System.out.println(minimum);
		
		
		System.out.println(analyzer2.Max());
		System.out.println(analyzer2.Min());
		
		System.out.println(analyzer.Average());
		System.out.println(analyzer2.Average());
		
	}

}
