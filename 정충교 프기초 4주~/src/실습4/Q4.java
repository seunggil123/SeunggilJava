package 角嚼4;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double TAX_RATE_LOW = 10.0/100.0;

		final double TAX_RATE_MID = 18.0/100.0;

		final double TAX_RATE_HIGH = 30.0/100.0;
		
		/////// 技啦 ///////
		
		System.out.print("家垫篮? ");
		double a = input.nextDouble();
		
		if(a>=0 && a<= 30000000.0)
			System.out.println("家垫技 = "+a*TAX_RATE_LOW);
		else if(a>=0 && a<=70000000.0)
			System.out.println("家垫技 = "+a*TAX_RATE_MID);
		else if(a>70000000.0)
			System.out.println("家垫技 = "+(30000000.0*TAX_RATE_LOW+40000000.0*TAX_RATE_MID+(a-70000000.0)*TAX_RATE_HIGH));
		else if(a<0)
			System.out.println("家垫技 = " +0.0);
		
	}

}
